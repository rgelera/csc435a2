// Generated from Goo.g4 by ANTLR 4.5.2

import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GooLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, BREAK=30, CASE=31, CHAN=32, 
		CONST=33, CONTINUE=34, DEFAULT=35, DEFER=36, ELSE=37, FALLTHROUGH=38, 
		FOR=39, FUNC=40, GO=41, GOTO=42, IF=43, IMPORT=44, INTERFACE=45, MAP=46, 
		PACKAGE=47, RANGE=48, RETURN=49, SELECT=50, STRUCT=51, SWITCH=52, TYPE=53, 
		VAR=54, Identifier=55, ImaginaryLit=56, IntLit=57, FloatLit=58, StringLit=59, 
		RuneLit=60, PLUSPLUS=61, MINUSMINUS=62, RPAREN=63, RSQ=64, RBRACE=65, 
		SEMI=66, Whitespace=67, LineComment=68, NL=69, BlockComment=70, BlockNLComment=71;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "BREAK", "CASE", "CHAN", "CONST", 
		"CONTINUE", "DEFAULT", "DEFER", "ELSE", "FALLTHROUGH", "FOR", "FUNC", 
		"GO", "GOTO", "IF", "IMPORT", "INTERFACE", "MAP", "PACKAGE", "RANGE", 
		"RETURN", "SELECT", "STRUCT", "SWITCH", "TYPE", "VAR", "Identifier", "ImaginaryLit", 
		"IntLit", "FloatLit", "Digit", "FloatLitTail", "Exponent", "Letter", "LetterOrDigit", 
		"StringLit", "RuneLit", "PLUSPLUS", "MINUSMINUS", "RPAREN", "RSQ", "RBRACE", 
		"SEMI", "SChar", "CChar", "Whitespace", "LineComment", "NL", "BlockComment", 
		"BlockNLComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'['", "'{'", "'*'", "','", "'='", "':='", "'.'", "'...'", 
		"':'", "'&&'", "'||'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'+'", 
		"'-'", "'|'", "'^'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'&^'", "'!'", 
		"'break'", "'case'", "'chan'", "'const'", "'continue'", "'default'", "'defer'", 
		"'else'", "'fallthrough'", "'for'", "'func'", "'go'", "'goto'", "'if'", 
		"'import'", "'interface'", "'map'", "'package'", "'range'", "'return'", 
		"'select'", "'struct'", "'switch'", "'type'", "'var'", null, null, null, 
		null, null, null, "'++'", "'--'", "')'", "']'", "'}'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "BREAK", "CASE", "CHAN", "CONST", 
		"CONTINUE", "DEFAULT", "DEFER", "ELSE", "FALLTHROUGH", "FOR", "FUNC", 
		"GO", "GOTO", "IF", "IMPORT", "INTERFACE", "MAP", "PACKAGE", "RANGE", 
		"RETURN", "SELECT", "STRUCT", "SWITCH", "TYPE", "VAR", "Identifier", "ImaginaryLit", 
		"IntLit", "FloatLit", "StringLit", "RuneLit", "PLUSPLUS", "MINUSMINUS", 
		"RPAREN", "RSQ", "RBRACE", "SEMI", "Whitespace", "LineComment", "NL", 
		"BlockComment", "BlockNLComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	    protected int prevTokenType = Token.INVALID_TYPE;

	    // These are the token types such that if one appears as the last
	    // token on a line, a semicolon is inserted right afterwards.
	    protected HashSet<Integer> lastTokens = new HashSet<Integer>() {{
	        add(GooParser.Identifier);      add(GooParser.IntLit);
	        add(GooParser.FloatLit);        add(GooParser.RuneLit);
	        add(GooParser.StringLit);       add(GooParser.BREAK);
	        add(GooParser.CONTINUE);        add(GooParser.FALLTHROUGH);
	        add(GooParser.RETURN);          add(GooParser.PLUSPLUS);
	        add(GooParser.MINUSMINUS);      add(GooParser.RPAREN);
	        add(GooParser.RSQ);             add(GooParser.RBRACE);
	    }};

		@Override
		public Token emit() {
			if (_type == GooParser.NL) {
	            // we have a newline (NL) token
				if (lastTokens.contains(prevTokenType)) {
	                // convert that NL token into a semicolon token
					_type = GooParser.SEMI;
					_text = ";";
				    prevTokenType = Token.INVALID_TYPE;
	                //System.out.println(_tokenStartLine + ":" +
	                //    _tokenStartCharPositionInLine + ": inserted semicolon");
				} else {
	                // skip NL tokens
	                //int cnt = 0;
	                while(true) {
	                    _type = nextToken().getType();
	                //    cnt++;
	                    if (_type != GooParser.NL) break;
	                    super.emit();
	                }
	                prevTokenType = _type;
	                if (_type < 0)
	                    return emitEOF();
	                //System.out.println(_tokenStartLine + ":" + _tokenStartCharPositionInLine +
	                //    ": skipped " + cnt + "*NL" + ", next token = " + _SYMBOLIC_NAMES[_type]);
	            }
			} else {
	            // not a NL token, remember what kind it was
				prevTokenType = _type;
			}
			return super.emit();
		}

		@Override
		public Token nextToken() {
			if (_hitEOF && prevTokenType == GooParser.RBRACE) {
			    // insert a semicolon if last line ends with a right brace (i.e. NL is missing)
				_type = GooParser.SEMI;
				_text = ";";
				prevTokenType = Token.INVALID_TYPE;
				return super.emit();
			}
			return super.nextToken();
		}


	public GooLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Goo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 61:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 62:
			return LetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean Letter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean LetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2I\u0238\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3"+
		"+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3"+
		"/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\78\u0182\n"+
		"8\f8\168\u0185\138\39\39\39\39\39\39\59\u018d\n9\3:\3:\7:\u0191\n:\f:"+
		"\16:\u0194\13:\3:\3:\3:\6:\u0199\n:\r:\16:\u019a\3:\3:\7:\u019f\n:\f:"+
		"\16:\u01a2\13:\5:\u01a4\n:\3;\6;\u01a7\n;\r;\16;\u01a8\3;\3;\3;\3;\6;"+
		"\u01af\n;\r;\16;\u01b0\3;\5;\u01b4\n;\5;\u01b6\n;\3<\3<\3=\3=\7=\u01bc"+
		"\n=\f=\16=\u01bf\13=\3=\5=\u01c2\n=\3=\5=\u01c5\n=\3>\3>\5>\u01c9\n>\3"+
		">\6>\u01cc\n>\r>\16>\u01cd\3?\3?\3?\3?\3?\3?\5?\u01d6\n?\3@\3@\3@\3@\3"+
		"@\3@\5@\u01de\n@\3A\3A\7A\u01e2\nA\fA\16A\u01e5\13A\3A\3A\3B\3B\3B\3B"+
		"\3C\3C\3C\3D\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3I\5I\u01fe\nI\3J\3J"+
		"\3J\5J\u0203\nJ\3K\6K\u0206\nK\rK\16K\u0207\3K\3K\3L\3L\3L\3L\7L\u0210"+
		"\nL\fL\16L\u0213\13L\3L\3L\3M\3M\5M\u0219\nM\3M\3M\5M\u021d\nM\3N\3N\3"+
		"N\3N\7N\u0223\nN\fN\16N\u0226\13N\3N\3N\3N\3N\3N\3O\3O\3O\3O\7O\u0231"+
		"\nO\fO\16O\u0234\13O\3O\3O\3O\3\u0232\2P\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w\2y\2{\2}\2\177\2\u0081"+
		"=\u0083>\u0085?\u0087@\u0089A\u008bB\u008dC\u008fD\u0091\2\u0093\2\u0095"+
		"E\u0097F\u0099G\u009bH\u009dI\3\2\24\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\62"+
		"9\3\2\62;\4\2GGgg\4\2--//\5\2C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802"+
		"\udc01\3\2\udc02\ue001\6\2\62;C\\aac|\6\2\f\f\17\17$$^^\n\2$$^^cdhhpp"+
		"ttvvxx\6\2\f\f\17\17))^^\n\2))^^cdhhppttvvxx\5\2\13\13\16\16\"\"\4\2\f"+
		"\f\17\17\u024e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\3\u009f\3\2\2"+
		"\2\5\u00a1\3\2\2\2\7\u00a3\3\2\2\2\t\u00a5\3\2\2\2\13\u00a7\3\2\2\2\r"+
		"\u00a9\3\2\2\2\17\u00ab\3\2\2\2\21\u00ae\3\2\2\2\23\u00b0\3\2\2\2\25\u00b4"+
		"\3\2\2\2\27\u00b6\3\2\2\2\31\u00b9\3\2\2\2\33\u00bc\3\2\2\2\35\u00bf\3"+
		"\2\2\2\37\u00c2\3\2\2\2!\u00c4\3\2\2\2#\u00c7\3\2\2\2%\u00c9\3\2\2\2\'"+
		"\u00cc\3\2\2\2)\u00ce\3\2\2\2+\u00d0\3\2\2\2-\u00d2\3\2\2\2/\u00d4\3\2"+
		"\2\2\61\u00d6\3\2\2\2\63\u00d8\3\2\2\2\65\u00db\3\2\2\2\67\u00de\3\2\2"+
		"\29\u00e0\3\2\2\2;\u00e3\3\2\2\2=\u00e5\3\2\2\2?\u00eb\3\2\2\2A\u00f0"+
		"\3\2\2\2C\u00f5\3\2\2\2E\u00fb\3\2\2\2G\u0104\3\2\2\2I\u010c\3\2\2\2K"+
		"\u0112\3\2\2\2M\u0117\3\2\2\2O\u0123\3\2\2\2Q\u0127\3\2\2\2S\u012c\3\2"+
		"\2\2U\u012f\3\2\2\2W\u0134\3\2\2\2Y\u0137\3\2\2\2[\u013e\3\2\2\2]\u0148"+
		"\3\2\2\2_\u014c\3\2\2\2a\u0154\3\2\2\2c\u015a\3\2\2\2e\u0161\3\2\2\2g"+
		"\u0168\3\2\2\2i\u016f\3\2\2\2k\u0176\3\2\2\2m\u017b\3\2\2\2o\u017f\3\2"+
		"\2\2q\u018c\3\2\2\2s\u01a3\3\2\2\2u\u01b5\3\2\2\2w\u01b7\3\2\2\2y\u01c4"+
		"\3\2\2\2{\u01c6\3\2\2\2}\u01d5\3\2\2\2\177\u01dd\3\2\2\2\u0081\u01df\3"+
		"\2\2\2\u0083\u01e8\3\2\2\2\u0085\u01ec\3\2\2\2\u0087\u01ef\3\2\2\2\u0089"+
		"\u01f2\3\2\2\2\u008b\u01f4\3\2\2\2\u008d\u01f6\3\2\2\2\u008f\u01f8\3\2"+
		"\2\2\u0091\u01fd\3\2\2\2\u0093\u0202\3\2\2\2\u0095\u0205\3\2\2\2\u0097"+
		"\u020b\3\2\2\2\u0099\u021c\3\2\2\2\u009b\u021e\3\2\2\2\u009d\u022c\3\2"+
		"\2\2\u009f\u00a0\7*\2\2\u00a0\4\3\2\2\2\u00a1\u00a2\7]\2\2\u00a2\6\3\2"+
		"\2\2\u00a3\u00a4\7}\2\2\u00a4\b\3\2\2\2\u00a5\u00a6\7,\2\2\u00a6\n\3\2"+
		"\2\2\u00a7\u00a8\7.\2\2\u00a8\f\3\2\2\2\u00a9\u00aa\7?\2\2\u00aa\16\3"+
		"\2\2\2\u00ab\u00ac\7<\2\2\u00ac\u00ad\7?\2\2\u00ad\20\3\2\2\2\u00ae\u00af"+
		"\7\60\2\2\u00af\22\3\2\2\2\u00b0\u00b1\7\60\2\2\u00b1\u00b2\7\60\2\2\u00b2"+
		"\u00b3\7\60\2\2\u00b3\24\3\2\2\2\u00b4\u00b5\7<\2\2\u00b5\26\3\2\2\2\u00b6"+
		"\u00b7\7(\2\2\u00b7\u00b8\7(\2\2\u00b8\30\3\2\2\2\u00b9\u00ba\7~\2\2\u00ba"+
		"\u00bb\7~\2\2\u00bb\32\3\2\2\2\u00bc\u00bd\7?\2\2\u00bd\u00be\7?\2\2\u00be"+
		"\34\3\2\2\2\u00bf\u00c0\7#\2\2\u00c0\u00c1\7?\2\2\u00c1\36\3\2\2\2\u00c2"+
		"\u00c3\7>\2\2\u00c3 \3\2\2\2\u00c4\u00c5\7>\2\2\u00c5\u00c6\7?\2\2\u00c6"+
		"\"\3\2\2\2\u00c7\u00c8\7@\2\2\u00c8$\3\2\2\2\u00c9\u00ca\7@\2\2\u00ca"+
		"\u00cb\7?\2\2\u00cb&\3\2\2\2\u00cc\u00cd\7-\2\2\u00cd(\3\2\2\2\u00ce\u00cf"+
		"\7/\2\2\u00cf*\3\2\2\2\u00d0\u00d1\7~\2\2\u00d1,\3\2\2\2\u00d2\u00d3\7"+
		"`\2\2\u00d3.\3\2\2\2\u00d4\u00d5\7\61\2\2\u00d5\60\3\2\2\2\u00d6\u00d7"+
		"\7\'\2\2\u00d7\62\3\2\2\2\u00d8\u00d9\7>\2\2\u00d9\u00da\7>\2\2\u00da"+
		"\64\3\2\2\2\u00db\u00dc\7@\2\2\u00dc\u00dd\7@\2\2\u00dd\66\3\2\2\2\u00de"+
		"\u00df\7(\2\2\u00df8\3\2\2\2\u00e0\u00e1\7(\2\2\u00e1\u00e2\7`\2\2\u00e2"+
		":\3\2\2\2\u00e3\u00e4\7#\2\2\u00e4<\3\2\2\2\u00e5\u00e6\7d\2\2\u00e6\u00e7"+
		"\7t\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7m\2\2\u00ea"+
		">\3\2\2\2\u00eb\u00ec\7e\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7u\2\2\u00ee"+
		"\u00ef\7g\2\2\u00ef@\3\2\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7j\2\2\u00f2"+
		"\u00f3\7c\2\2\u00f3\u00f4\7p\2\2\u00f4B\3\2\2\2\u00f5\u00f6\7e\2\2\u00f6"+
		"\u00f7\7q\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9\7u\2\2\u00f9\u00fa\7v\2\2"+
		"\u00faD\3\2\2\2\u00fb\u00fc\7e\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7p\2"+
		"\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7p\2\2\u0101\u0102"+
		"\7w\2\2\u0102\u0103\7g\2\2\u0103F\3\2\2\2\u0104\u0105\7f\2\2\u0105\u0106"+
		"\7g\2\2\u0106\u0107\7h\2\2\u0107\u0108\7c\2\2\u0108\u0109\7w\2\2\u0109"+
		"\u010a\7n\2\2\u010a\u010b\7v\2\2\u010bH\3\2\2\2\u010c\u010d\7f\2\2\u010d"+
		"\u010e\7g\2\2\u010e\u010f\7h\2\2\u010f\u0110\7g\2\2\u0110\u0111\7t\2\2"+
		"\u0111J\3\2\2\2\u0112\u0113\7g\2\2\u0113\u0114\7n\2\2\u0114\u0115\7u\2"+
		"\2\u0115\u0116\7g\2\2\u0116L\3\2\2\2\u0117\u0118\7h\2\2\u0118\u0119\7"+
		"c\2\2\u0119\u011a\7n\2\2\u011a\u011b\7n\2\2\u011b\u011c\7v\2\2\u011c\u011d"+
		"\7j\2\2\u011d\u011e\7t\2\2\u011e\u011f\7q\2\2\u011f\u0120\7w\2\2\u0120"+
		"\u0121\7i\2\2\u0121\u0122\7j\2\2\u0122N\3\2\2\2\u0123\u0124\7h\2\2\u0124"+
		"\u0125\7q\2\2\u0125\u0126\7t\2\2\u0126P\3\2\2\2\u0127\u0128\7h\2\2\u0128"+
		"\u0129\7w\2\2\u0129\u012a\7p\2\2\u012a\u012b\7e\2\2\u012bR\3\2\2\2\u012c"+
		"\u012d\7i\2\2\u012d\u012e\7q\2\2\u012eT\3\2\2\2\u012f\u0130\7i\2\2\u0130"+
		"\u0131\7q\2\2\u0131\u0132\7v\2\2\u0132\u0133\7q\2\2\u0133V\3\2\2\2\u0134"+
		"\u0135\7k\2\2\u0135\u0136\7h\2\2\u0136X\3\2\2\2\u0137\u0138\7k\2\2\u0138"+
		"\u0139\7o\2\2\u0139\u013a\7r\2\2\u013a\u013b\7q\2\2\u013b\u013c\7t\2\2"+
		"\u013c\u013d\7v\2\2\u013dZ\3\2\2\2\u013e\u013f\7k\2\2\u013f\u0140\7p\2"+
		"\2\u0140\u0141\7v\2\2\u0141\u0142\7g\2\2\u0142\u0143\7t\2\2\u0143\u0144"+
		"\7h\2\2\u0144\u0145\7c\2\2\u0145\u0146\7e\2\2\u0146\u0147\7g\2\2\u0147"+
		"\\\3\2\2\2\u0148\u0149\7o\2\2\u0149\u014a\7c\2\2\u014a\u014b\7r\2\2\u014b"+
		"^\3\2\2\2\u014c\u014d\7r\2\2\u014d\u014e\7c\2\2\u014e\u014f\7e\2\2\u014f"+
		"\u0150\7m\2\2\u0150\u0151\7c\2\2\u0151\u0152\7i\2\2\u0152\u0153\7g\2\2"+
		"\u0153`\3\2\2\2\u0154\u0155\7t\2\2\u0155\u0156\7c\2\2\u0156\u0157\7p\2"+
		"\2\u0157\u0158\7i\2\2\u0158\u0159\7g\2\2\u0159b\3\2\2\2\u015a\u015b\7"+
		"t\2\2\u015b\u015c\7g\2\2\u015c\u015d\7v\2\2\u015d\u015e\7w\2\2\u015e\u015f"+
		"\7t\2\2\u015f\u0160\7p\2\2\u0160d\3\2\2\2\u0161\u0162\7u\2\2\u0162\u0163"+
		"\7g\2\2\u0163\u0164\7n\2\2\u0164\u0165\7g\2\2\u0165\u0166\7e\2\2\u0166"+
		"\u0167\7v\2\2\u0167f\3\2\2\2\u0168\u0169\7u\2\2\u0169\u016a\7v\2\2\u016a"+
		"\u016b\7t\2\2\u016b\u016c\7w\2\2\u016c\u016d\7e\2\2\u016d\u016e\7v\2\2"+
		"\u016eh\3\2\2\2\u016f\u0170\7u\2\2\u0170\u0171\7y\2\2\u0171\u0172\7k\2"+
		"\2\u0172\u0173\7v\2\2\u0173\u0174\7e\2\2\u0174\u0175\7j\2\2\u0175j\3\2"+
		"\2\2\u0176\u0177\7v\2\2\u0177\u0178\7{\2\2\u0178\u0179\7r\2\2\u0179\u017a"+
		"\7g\2\2\u017al\3\2\2\2\u017b\u017c\7x\2\2\u017c\u017d\7c\2\2\u017d\u017e"+
		"\7t\2\2\u017en\3\2\2\2\u017f\u0183\5}?\2\u0180\u0182\5\177@\2\u0181\u0180"+
		"\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"p\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\5s:\2\u0187\u0188\7k\2\2\u0188"+
		"\u018d\3\2\2\2\u0189\u018a\5u;\2\u018a\u018b\7k\2\2\u018b\u018d\3\2\2"+
		"\2\u018c\u0186\3\2\2\2\u018c\u0189\3\2\2\2\u018dr\3\2\2\2\u018e\u0192"+
		"\t\2\2\2\u018f\u0191\5w<\2\u0190\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u01a4\3\2\2\2\u0194\u0192\3\2"+
		"\2\2\u0195\u0196\7\62\2\2\u0196\u0198\t\3\2\2\u0197\u0199\t\4\2\2\u0198"+
		"\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2"+
		"\2\2\u019b\u01a4\3\2\2\2\u019c\u01a0\7\62\2\2\u019d\u019f\t\5\2\2\u019e"+
		"\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u018e\3\2\2\2\u01a3"+
		"\u0195\3\2\2\2\u01a3\u019c\3\2\2\2\u01a4t\3\2\2\2\u01a5\u01a7\5w<\2\u01a6"+
		"\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2"+
		"\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\5y=\2\u01ab\u01b6\3\2\2\2\u01ac\u01ae"+
		"\7\60\2\2\u01ad\u01af\5w<\2\u01ae\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b4\5{"+
		">\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5"+
		"\u01a6\3\2\2\2\u01b5\u01ac\3\2\2\2\u01b6v\3\2\2\2\u01b7\u01b8\t\6\2\2"+
		"\u01b8x\3\2\2\2\u01b9\u01bd\7\60\2\2\u01ba\u01bc\5w<\2\u01bb\u01ba\3\2"+
		"\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c2\5{>\2\u01c1\u01c0\3\2\2"+
		"\2\u01c1\u01c2\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c5\5{>\2\u01c4\u01b9"+
		"\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5z\3\2\2\2\u01c6\u01c8\t\7\2\2\u01c7"+
		"\u01c9\t\b\2\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2"+
		"\2\2\u01ca\u01cc\5w<\2\u01cb\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cb"+
		"\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce|\3\2\2\2\u01cf\u01d6\t\t\2\2\u01d0"+
		"\u01d1\n\n\2\2\u01d1\u01d6\6?\2\2\u01d2\u01d3\t\13\2\2\u01d3\u01d4\t\f"+
		"\2\2\u01d4\u01d6\6?\3\2\u01d5\u01cf\3\2\2\2\u01d5\u01d0\3\2\2\2\u01d5"+
		"\u01d2\3\2\2\2\u01d6~\3\2\2\2\u01d7\u01de\t\r\2\2\u01d8\u01d9\n\n\2\2"+
		"\u01d9\u01de\6@\4\2\u01da\u01db\t\13\2\2\u01db\u01dc\t\f\2\2\u01dc\u01de"+
		"\6@\5\2\u01dd\u01d7\3\2\2\2\u01dd\u01d8\3\2\2\2\u01dd\u01da\3\2\2\2\u01de"+
		"\u0080\3\2\2\2\u01df\u01e3\7$\2\2\u01e0\u01e2\5\u0091I\2\u01e1\u01e0\3"+
		"\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e6\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e7\7$\2\2\u01e7\u0082\3\2"+
		"\2\2\u01e8\u01e9\7)\2\2\u01e9\u01ea\5\u0093J\2\u01ea\u01eb\7)\2\2\u01eb"+
		"\u0084\3\2\2\2\u01ec\u01ed\7-\2\2\u01ed\u01ee\7-\2\2\u01ee\u0086\3\2\2"+
		"\2\u01ef\u01f0\7/\2\2\u01f0\u01f1\7/\2\2\u01f1\u0088\3\2\2\2\u01f2\u01f3"+
		"\7+\2\2\u01f3\u008a\3\2\2\2\u01f4\u01f5\7_\2\2\u01f5\u008c\3\2\2\2\u01f6"+
		"\u01f7\7\177\2\2\u01f7\u008e\3\2\2\2\u01f8\u01f9\7=\2\2\u01f9\u0090\3"+
		"\2\2\2\u01fa\u01fe\n\16\2\2\u01fb\u01fc\7^\2\2\u01fc\u01fe\t\17\2\2\u01fd"+
		"\u01fa\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u0092\3\2\2\2\u01ff\u0203\n\20"+
		"\2\2\u0200\u0201\7^\2\2\u0201\u0203\t\21\2\2\u0202\u01ff\3\2\2\2\u0202"+
		"\u0200\3\2\2\2\u0203\u0094\3\2\2\2\u0204\u0206\t\22\2\2\u0205\u0204\3"+
		"\2\2\2\u0206\u0207\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u020a\bK\2\2\u020a\u0096\3\2\2\2\u020b\u020c\7\61"+
		"\2\2\u020c\u020d\7\61\2\2\u020d\u0211\3\2\2\2\u020e\u0210\n\23\2\2\u020f"+
		"\u020e\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2"+
		"\2\2\u0212\u0214\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0215\bL\2\2\u0215"+
		"\u0098\3\2\2\2\u0216\u0218\7\17\2\2\u0217\u0219\7\f\2\2\u0218\u0217\3"+
		"\2\2\2\u0218\u0219\3\2\2\2\u0219\u021d\3\2\2\2\u021a\u021d\7\f\2\2\u021b"+
		"\u021d\5\u009dO\2\u021c\u0216\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021b"+
		"\3\2\2\2\u021d\u009a\3\2\2\2\u021e\u021f\7\61\2\2\u021f\u0220\7,\2\2\u0220"+
		"\u0224\3\2\2\2\u0221\u0223\n\23\2\2\u0222\u0221\3\2\2\2\u0223\u0226\3"+
		"\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0227\3\2\2\2\u0226"+
		"\u0224\3\2\2\2\u0227\u0228\7,\2\2\u0228\u0229\7\61\2\2\u0229\u022a\3\2"+
		"\2\2\u022a\u022b\bN\2\2\u022b\u009c\3\2\2\2\u022c\u022d\7\61\2\2\u022d"+
		"\u022e\7,\2\2\u022e\u0232\3\2\2\2\u022f\u0231\13\2\2\2\u0230\u022f\3\2"+
		"\2\2\u0231\u0234\3\2\2\2\u0232\u0233\3\2\2\2\u0232\u0230\3\2\2\2\u0233"+
		"\u0235\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0236\7,\2\2\u0236\u0237\7\61"+
		"\2\2\u0237\u009e\3\2\2\2\35\2\u0183\u018c\u0192\u019a\u01a0\u01a3\u01a8"+
		"\u01b0\u01b3\u01b5\u01bd\u01c1\u01c4\u01c8\u01cd\u01d5\u01dd\u01e3\u01fd"+
		"\u0202\u0207\u0211\u0218\u021c\u0224\u0232\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}