// Generated from ../typedef_dsl.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class typedef_dslLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, STRING_LITERAL=2, WS=3, NEWLINE=4, TYPE_LITERAL=5, TYPE_CONTEXTABLE=6, 
		STRUCT=7, VARIABLE_NAME_SEPERATOR=8, VARIABLE_NAME=9, OPEN_PAREN=10, CLOSE_PAREN=11, 
		OPEN_BRACKET=12, CLOSE_BRACKET=13, KEY_SEPERATOR=14, VALUE_SEPERATOR=15, 
		END_OF_STATEMENT=16, OPEN_CONTEXT=17, CLOSE_CONTEXT=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBER", "INTEGER", "FLOAT", "BINARY", "HEX", "STRING_LITERAL", "ESC", 
			"WS", "NEWLINE", "TYPE_LITERAL", "TYPE_CONTEXTABLE", "SET_TYPE", "MAP_TYPE", 
			"ARRAY_TYPE", "INT_TYPE", "STRING_TYPE", "BOOLEAN_TYPE", "FLOAT_TYPE", 
			"STRUCT", "VARIABLE_NAME_SEPERATOR", "VARIABLE_NAME", "ALPHA_NUMERIC", 
			"OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "KEY_SEPERATOR", 
			"VALUE_SEPERATOR", "END_OF_STATEMENT", "OPEN_CONTEXT", "CLOSE_CONTEXT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'struct'", "'->'", null, "'('", 
			"')'", "'{'", "'}'", "':'", "','", "';'", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "STRING_LITERAL", "WS", "NEWLINE", "TYPE_LITERAL", "TYPE_CONTEXTABLE", 
			"STRUCT", "VARIABLE_NAME_SEPERATOR", "VARIABLE_NAME", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "KEY_SEPERATOR", "VALUE_SEPERATOR", 
			"END_OF_STATEMENT", "OPEN_CONTEXT", "CLOSE_CONTEXT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public typedef_dslLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "typedef_dsl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00e4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\2\3\2\5\2F\n\2\3\3\5\3I\n\3\3\3\3\3\7\3M\n\3\f\3\16\3P\13"+
		"\3\3\4\5\4S\n\4\3\4\3\4\7\4W\n\4\f\4\16\4Z\13\4\3\4\5\4]\n\4\3\4\6\4`"+
		"\n\4\r\4\16\4a\3\5\3\5\3\5\3\5\6\5h\n\5\r\5\16\5i\3\6\3\6\3\6\3\6\6\6"+
		"p\n\6\r\6\16\6q\3\7\3\7\3\7\7\7w\n\7\f\7\16\7z\13\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u008d\n\13"+
		"\3\f\3\f\3\f\5\f\u0092\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00c6"+
		"\n\26\f\26\16\26\u00c9\13\26\3\26\5\26\u00cc\n\26\3\27\6\27\u00cf\n\27"+
		"\r\27\16\27\u00d0\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \2\2!\3\3\5\2\7\2\t\2\13\2\r\4\17\2"+
		"\21\5\23\6\25\7\27\b\31\2\33\2\35\2\37\2!\2#\2%\2\'\t)\n+\13-\2/\f\61"+
		"\r\63\16\65\17\67\209\21;\22=\23?\24\3\2\7\3\2$$\4\2\13\13\"\"\4\2\f\f"+
		"\17\17\4\2//aa\5\2\62;C\\c|\2\u00ec\2\3\3\2\2\2\2\r\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3E\3\2\2\2\5H\3\2\2\2\7R"+
		"\3\2\2\2\tc\3\2\2\2\13k\3\2\2\2\rs\3\2\2\2\17}\3\2\2\2\21\u0080\3\2\2"+
		"\2\23\u0084\3\2\2\2\25\u008c\3\2\2\2\27\u0091\3\2\2\2\31\u0093\3\2\2\2"+
		"\33\u0097\3\2\2\2\35\u009b\3\2\2\2\37\u00a1\3\2\2\2!\u00a5\3\2\2\2#\u00ac"+
		"\3\2\2\2%\u00b1\3\2\2\2\'\u00b7\3\2\2\2)\u00be\3\2\2\2+\u00cb\3\2\2\2"+
		"-\u00ce\3\2\2\2/\u00d2\3\2\2\2\61\u00d4\3\2\2\2\63\u00d6\3\2\2\2\65\u00d8"+
		"\3\2\2\2\67\u00da\3\2\2\29\u00dc\3\2\2\2;\u00de\3\2\2\2=\u00e0\3\2\2\2"+
		"?\u00e2\3\2\2\2AF\5\5\3\2BF\5\7\4\2CF\5\t\5\2DF\5\13\6\2EA\3\2\2\2EB\3"+
		"\2\2\2EC\3\2\2\2ED\3\2\2\2F\4\3\2\2\2GI\7/\2\2HG\3\2\2\2HI\3\2\2\2IJ\3"+
		"\2\2\2JN\4\63;\2KM\4\62;\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\6"+
		"\3\2\2\2PN\3\2\2\2QS\7/\2\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TX\4\63;\2UW"+
		"\4\62;\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2"+
		"[]\7\60\2\2\\[\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^`\4\62;\2_^\3\2\2\2`a\3\2"+
		"\2\2a_\3\2\2\2ab\3\2\2\2b\b\3\2\2\2cd\7\62\2\2de\7d\2\2eg\3\2\2\2fh\4"+
		"\62\63\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\n\3\2\2\2kl\7\62\2\2"+
		"lm\7z\2\2mo\3\2\2\2np\4\62;\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2"+
		"r\f\3\2\2\2sx\7$\2\2tw\5\17\b\2uw\n\2\2\2vt\3\2\2\2vu\3\2\2\2wz\3\2\2"+
		"\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7$\2\2|\16\3\2\2\2}~\7^\2"+
		"\2~\177\13\2\2\2\177\20\3\2\2\2\u0080\u0081\t\3\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\u0083\b\t\2\2\u0083\22\3\2\2\2\u0084\u0085\t\4\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0087\b\n\2\2\u0087\24\3\2\2\2\u0088\u008d\5\37\20\2\u0089"+
		"\u008d\5!\21\2\u008a\u008d\5#\22\2\u008b\u008d\5\7\4\2\u008c\u0088\3\2"+
		"\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\26\3\2\2\2\u008e\u0092\5\31\r\2\u008f\u0092\5\33\16\2\u0090\u0092\5\35"+
		"\17\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092"+
		"\30\3\2\2\2\u0093\u0094\7u\2\2\u0094\u0095\7g\2\2\u0095\u0096\7v\2\2\u0096"+
		"\32\3\2\2\2\u0097\u0098\7o\2\2\u0098\u0099\7c\2\2\u0099\u009a\7r\2\2\u009a"+
		"\34\3\2\2\2\u009b\u009c\7c\2\2\u009c\u009d\7t\2\2\u009d\u009e\7t\2\2\u009e"+
		"\u009f\7c\2\2\u009f\u00a0\7{\2\2\u00a0\36\3\2\2\2\u00a1\u00a2\7k\2\2\u00a2"+
		"\u00a3\7p\2\2\u00a3\u00a4\7v\2\2\u00a4 \3\2\2\2\u00a5\u00a6\7u\2\2\u00a6"+
		"\u00a7\7v\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7p\2\2"+
		"\u00aa\u00ab\7i\2\2\u00ab\"\3\2\2\2\u00ac\u00ad\7d\2\2\u00ad\u00ae\7q"+
		"\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7n\2\2\u00b0$\3\2\2\2\u00b1\u00b2"+
		"\7h\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7c\2\2\u00b5"+
		"\u00b6\7v\2\2\u00b6&\3\2\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7v\2\2\u00b9"+
		"\u00ba\7t\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7v\2\2"+
		"\u00bd(\3\2\2\2\u00be\u00bf\7/\2\2\u00bf\u00c0\7@\2\2\u00c0*\3\2\2\2\u00c1"+
		"\u00cc\4c|\2\u00c2\u00c7\4c|\2\u00c3\u00c6\5-\27\2\u00c4\u00c6\t\5\2\2"+
		"\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00cc\5-\27\2\u00cb\u00c1\3\2\2\2\u00cb\u00c2\3\2\2\2\u00cc,\3\2\2\2"+
		"\u00cd\u00cf\t\6\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1.\3\2\2\2\u00d2\u00d3\7*\2\2\u00d3\60"+
		"\3\2\2\2\u00d4\u00d5\7+\2\2\u00d5\62\3\2\2\2\u00d6\u00d7\7}\2\2\u00d7"+
		"\64\3\2\2\2\u00d8\u00d9\7\177\2\2\u00d9\66\3\2\2\2\u00da\u00db\7<\2\2"+
		"\u00db8\3\2\2\2\u00dc\u00dd\7.\2\2\u00dd:\3\2\2\2\u00de\u00df\7=\2\2\u00df"+
		"<\3\2\2\2\u00e0\u00e1\7>\2\2\u00e1>\3\2\2\2\u00e2\u00e3\7@\2\2\u00e3@"+
		"\3\2\2\2\24\2EHNRX\\aiqvx\u008c\u0091\u00c5\u00c7\u00cb\u00d0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}