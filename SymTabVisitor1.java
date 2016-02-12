// SymTabVisitor1.java
//
// When completed, this visitor class constructs a symbol table which includes
// the top level names in a Goo program, including the formal parameters of
// functions and the fields inside structs, but does not include local
// variables declared inside function bodies.

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class SymTabVisitor1 extends GooBaseVisitor<Type> {
	ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
	BlockScope globals;
	Scope currentScope;
	LinkedList<Type> currentSignatureParams = new LinkedList<Type>();
	LinkedList<Type> currentSignatureResult = new LinkedList<Type>();
	boolean dumpSymTab = false;
	boolean dumpPredefineds = false;

	// constructor
	//  t is the -dtsy command line flag
	//  d is the -dsym command line flag
	//  p is the -dpre command line flag
	public SymTabVisitor1( boolean t, boolean d, boolean p ) {
		Symbol.tracing = t;
		dumpSymTab = d;
		dumpPredefineds = p;
	}

	// default constructor
	public SymTabVisitor1() {
		Symbol.tracing = false;
		dumpSymTab = false;
		dumpPredefineds = false;
	}

	// associate scope s with parse tree node ctx
	// The scope block at package level and every scope block which
	// corresponds to a function body should be associated with the
	// tree nodes. The associations will be needed by other visitors.
	void saveScope(ParserRuleContext ctx, Scope s) {
		scopes.put(ctx, s);
	}

	public ParseTreeProperty<Scope> getScopes() {
		return scopes;
	}

	public int processLineNumber(ParserRuleContext ctx) {
		CommonToken pos = (CommonToken)(ctx.start);
		int line = pos.getLine();
		return line;
	}

	// *********** Visit methods follow *******************

	// SOME VISIT METHODS ARE PROVIDED
	// SEVERAL MORE VISIT METHODS NEED TO BE ADDED

		@Override
	public Type visitTopLevelDeclList(GooParser.TopLevelDeclListContext ctx) {
		//Need to figure out what to put here I believe
		System.out.println("here_TopLevel");
		return visitChildren(ctx);
	}

//Create trace down visits from TopLevelDeclList
//Need to add vars, consts, and types to symbol table
//Seems Type is already working
/*		@Override
	public Type visitTypeDecl(GooParser.TypeDeclContext ctx) {
		System.out.println("in_TypeDecl1");
		//String typeSpec = ctx.typeSpec().getText();
		//System.out.println(typeSpec);
		System.out.println("here100");
		//Symbol type = new Symbol(typeSpec)
		return visitChildren(ctx);
	}*/

		@Override
	public Type visitVarDecl(GooParser.VarDeclContext ctx) {
		System.out.println("in_VarDecl");

		return visitChildren(ctx);
	}

		@Override
	public Type visitIdentifierList(GooParser.IdentifierListContext ctx) {
		System.out.println("in_IdentifierList");
		String name = ctx.Identifier(0).getText(); //Gets x
		System.out.println(name);
		System.out.println("here200");
		return visitChildren(ctx);
	}

    @Override
	public Type visitSourceFile(GooParser.SourceFileContext ctx) {
		System.out.println("here4");
		globals = new BlockScope(null);
		globals.setScopeName("predefined names");
		Predefined.AddPredefinedNames(globals);
		currentScope = new BlockScope(globals);
		currentScope.setScopeName("package level names");//HERE
        visitChildren(ctx);	//Build in function that visits left to right
				System.out.println("here14");
		if (dumpSymTab)
			currentScope.dumpScope();	//Dumps the package level names output
		currentScope = currentScope.getEnclosingScope();
		if (dumpPredefineds)
			currentScope.dumpScope();
		return null;
	}

    @Override
	public Type visitFunctionDecl(GooParser.FunctionDeclContext ctx) {
		System.out.println("in_FunctionDecl");
		String funcName = ctx.functionName().getText();
		FunctionSymbol function = new FunctionSymbol(funcName, currentScope, processLineNumber(ctx));
		currentScope.define(function);	// add function defn to current scope
		currentScope = function;		// enter this new scope
		saveScope(ctx, currentScope);	// remember scope for this parse tree node
		currentSignatureParams.clear(); // prepare to build the signature: param types
		currentSignatureResult.clear();	// prepare to build the signature: result types
		Type signature = Type.unknownType;
		if (ctx.signature() != null) {
			signature = visit(ctx.signature());
		} else if (ctx.function() != null)
			signature = visit(ctx.function());
		function.setType(signature);
		currentScope = currentScope.getEnclosingScope();  // exit scope
		return signature;
	}

    @Override
    public Type visitFunction(GooParser.FunctionContext ctx) {
				System.out.println("in_Function");
        return visit(ctx.signature());
    }

    @Override
	public Type visitParameterDecl(GooParser.ParameterDeclContext ctx) {
		System.out.println("here7");
        visitChildren(ctx);
		List<Token> ids = ctx.identifierList().idl;
		Type typ = visit(ctx.type());
		if (ids != null) {
		    for( Token t : ids ) {
		        currentSignatureParams.add(typ);
		    }
		}
		return typ;
	}

    @Override
	public Type visitSignature(GooParser.SignatureContext ctx) {
		System.out.println("here8Sig");
        Type rt = null;
		// currentSignatureParams should contain all the input parameters
		// Just have to grab the result type, if there is one
		visit(ctx.parameters());
		if (ctx.result() != null)
		    rt = visit(ctx.result());
		if (rt != null)
			currentSignatureResult.add(rt);
		return Type.newFunctionSignature(currentSignatureParams,currentSignatureResult);
	}

    @Override
    public Type visitTypeName(GooParser.TypeNameContext ctx) {
			System.out.println("here9");
		String name = ctx.getText();
		Symbol sy = currentScope.resolve(name);
		if (sy == null || sy.getKind() != Symbol.Kind.TypeName) {
			ReportError.error(ctx, name+" is not a type");
			return Type.unknownType;
		}
		return sy.getType();
	}

    @Override
	public Type visitStructType(GooParser.StructTypeContext ctx) {
		System.out.println("here10");
	    Type t = Type.newStructType(currentScope);
		currentScope = (Scope)t;
	    visitChildren(ctx);
		currentScope = currentScope.getEnclosingScope();
		return t;
	}

    @Override
	public Type visitFieldDecl(GooParser.FieldDeclContext ctx) {
		System.out.println("here11");
		List<Token> ids = ctx.identifierList().idl;
		Type typ = visit(ctx.type());

		if (ids != null) {
		    for( Token t : ids ) {
		        String id = t.getText();
		        Symbol sy = new Symbol(id, Symbol.Kind.Field, typ, currentScope, processLineNumber(ctx));
		        currentScope.define(sy);
		    }
		}
		return typ;
	}

    @Override
	public Type visitArrayType(GooParser.ArrayTypeContext ctx) {
		System.out.println("here12");
		Type t = visit(ctx.elementType());
		return Type.newArrayType(t);
	}

    @Override
	public Type visitTypeSpec(GooParser.TypeSpecContext ctx) {
		System.out.println("here13");
		String name = ctx.Identifier().getText();
		Type t = visit(ctx.type());
		Symbol sy = new Symbol(name, Symbol.Kind.TypeName, t, currentScope, processLineNumber(ctx));
		currentScope.define(sy);
		return t;
	}

	@Override
	public Type visitVarSpec(GooParser.VarSpecContext ctx) {
		List<Token> ids = ctx.identifierList().idl;
		Type typ = visit(ctx.varSpecRem().type()); // For now, assuming only one type

		if (ids != null) {
			for ( Token t : ids ) {
				String id = t.getText();
				Symbol sy = new Symbol(id, Symbol.Kind.Variable, typ, currentScope, processLineNumber(ctx));
				currentScope.define(sy);
			}
		}
		return typ;

	}

	@Override
	public Type visitConstSpec(GooParser.ConstSpecContext ctx) {
		List<Token> ids = ctx.identifierList().idl;
		Type typ = visit(ctx.constSpecRem().type()); // For now, assuming only one type

		if (ids != null) {
			for ( Token t : ids ) {
				String id = t.getText();
				Symbol sy = new Symbol(id, Symbol.Kind.Constant, typ, currentScope, processLineNumber(ctx));
				currentScope.define(sy);
			}
		}
		return typ;

	}

}
