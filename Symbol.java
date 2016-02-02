// Symbol.java

public class Symbol { // A generic programming language symbol

    enum Kind { Unknown, Variable, Function, Formal, Field, Constant, TypeName, Package }
    
    static public boolean tracing = false;

    String name;
    Kind kind;
    Type type;
    Scope scope;      // the scope containing the definition

    public Symbol(String name) {
        this.name = name;
        kind = Kind.Unknown;
        type = Type.unknownType;
        scope = null;
    }

    public Symbol(String name, Kind kind, Type type, Scope scope) {
        this.name = name;
        this.kind = kind;
        this.type = type;
        this.scope = scope;
    }

	public Symbol() { }

    public String getName() { return name; }
    public void setName(String n) { name = n; }

	public Type getType() { return type; }
	public void setType(Type t) { type = t; }

    public Kind getKind() { return kind; }
    public void setkind(Kind k) { kind = k; }
    
    public Scope getScope() { return scope; }
    public void setScope(Scope s) { scope = s; }
    
    public int getLineNumber() {
    	// unimplemented
    	return 0;
    }

    public String toString() {
        if (type!=null)
            return kind+" "+getName()+":"+type;
        return getName();
    }
}
