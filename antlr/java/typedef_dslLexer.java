// Generated from ./typedef_dsl.g4 by ANTLR 4.7.2
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
		NUMBER=1, STRING_LITERAL=2, WS=3, NEWLINE=4, BOOLEAN_VALUE=5, TYPE_LITERAL=6, 
		TYPE_CONTEXTABLE=7, STRUCT=8, VARIABLE_NAME_SEPERATOR=9, VARIABLE_NAME=10, 
		OPEN_PAREN=11, CLOSE_PAREN=12, OPEN_BRACKET=13, CLOSE_BRACKET=14, KEY_SEPERATOR=15, 
		VALUE_SEPERATOR=16, END_OF_STATEMENT=17, OPEN_CONTEXT=18, CLOSE_CONTEXT=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBER", "INTEGER", "FLOAT", "BINARY", "HEX", "STRING_LITERAL", "ESC", 
			"WS", "NEWLINE", "BOOLEAN_VALUE", "BOOLEAN_TRUE", "BOOLEAN_FALSE", "TYPE_LITERAL", 
			"TYPE_CONTEXTABLE", "SET_TYPE", "MAP_TYPE", "ARRAY_TYPE", "INT_TYPE", 
			"STRING_TYPE", "BOOLEAN_TYPE", "FLOAT_TYPE", "STRUCT", "VARIABLE_NAME_SEPERATOR", 
			"VARIABLE_NAME", "ALPHA_NUMERIC", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "KEY_SEPERATOR", "VALUE_SEPERATOR", "END_OF_STATEMENT", 
			"OPEN_CONTEXT", "CLOSE_CONTEXT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'struct'", "'->'", null, 
			"'('", "')'", "'{'", "'}'", "':'", "','", "';'", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "STRING_LITERAL", "WS", "NEWLINE", "BOOLEAN_VALUE", "TYPE_LITERAL", 
			"TYPE_CONTEXTABLE", "STRUCT", "VARIABLE_NAME_SEPERATOR", "VARIABLE_NAME", 
			"OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "KEY_SEPERATOR", 
			"VALUE_SEPERATOR", "END_OF_STATEMENT", "OPEN_CONTEXT", "CLOSE_CONTEXT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00fc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\5\2L\n\2\3\3\5\3O\n\3\3\3\3\3\7"+
		"\3S\n\3\f\3\16\3V\13\3\3\4\5\4Y\n\4\3\4\3\4\7\4]\n\4\f\4\16\4`\13\4\3"+
		"\4\5\4c\n\4\3\4\6\4f\n\4\r\4\16\4g\3\5\3\5\3\5\3\5\6\5n\n\5\r\5\16\5o"+
		"\3\6\3\6\3\6\3\6\6\6v\n\6\r\6\16\6w\3\7\3\7\3\7\7\7}\n\7\f\7\16\7\u0080"+
		"\13\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\5"+
		"\13\u0091\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\5\16\u00a2\n\16\3\17\3\17\3\17\5\17\u00a7\n\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\7\31\u00db\n\31\f\31\16\31\u00de\13\31\3\31"+
		"\5\31\u00e1\n\31\3\32\3\32\6\32\u00e5\n\32\r\32\16\32\u00e6\5\32\u00e9"+
		"\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\2\2$\3\3\5\2\7\2\t\2\13\2\r\4\17\2\21\5\23\6\25\7\27\2\31"+
		"\2\33\b\35\t\37\2!\2#\2%\2\'\2)\2+\2-\n/\13\61\f\63\2\65\r\67\169\17;"+
		"\20=\21?\22A\23C\24E\25\3\2\7\3\2$$\4\2\13\13\"\"\4\2\f\f\17\17\4\2//"+
		"aa\4\2\62;c|\2\u0104\2\3\3\2\2\2\2\r\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3K\3\2\2\2\5N\3\2\2\2\7X\3\2\2\2"+
		"\ti\3\2\2\2\13q\3\2\2\2\ry\3\2\2\2\17\u0083\3\2\2\2\21\u0086\3\2\2\2\23"+
		"\u008a\3\2\2\2\25\u0090\3\2\2\2\27\u0092\3\2\2\2\31\u0097\3\2\2\2\33\u00a1"+
		"\3\2\2\2\35\u00a6\3\2\2\2\37\u00a8\3\2\2\2!\u00ac\3\2\2\2#\u00b0\3\2\2"+
		"\2%\u00b6\3\2\2\2\'\u00ba\3\2\2\2)\u00c1\3\2\2\2+\u00c6\3\2\2\2-\u00cc"+
		"\3\2\2\2/\u00d3\3\2\2\2\61\u00e0\3\2\2\2\63\u00e8\3\2\2\2\65\u00ea\3\2"+
		"\2\2\67\u00ec\3\2\2\29\u00ee\3\2\2\2;\u00f0\3\2\2\2=\u00f2\3\2\2\2?\u00f4"+
		"\3\2\2\2A\u00f6\3\2\2\2C\u00f8\3\2\2\2E\u00fa\3\2\2\2GL\5\5\3\2HL\5\7"+
		"\4\2IL\5\t\5\2JL\5\13\6\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\4\3"+
		"\2\2\2MO\7/\2\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PT\4\63;\2QS\4\62;\2RQ\3"+
		"\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\6\3\2\2\2VT\3\2\2\2WY\7/\2\2XW\3"+
		"\2\2\2XY\3\2\2\2YZ\3\2\2\2Z^\4\63;\2[]\4\62;\2\\[\3\2\2\2]`\3\2\2\2^\\"+
		"\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2\2ac\7\60\2\2ba\3\2\2\2bc\3\2\2\2"+
		"ce\3\2\2\2df\4\62;\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\b\3\2\2"+
		"\2ij\7\62\2\2jk\7d\2\2km\3\2\2\2ln\4\62\63\2ml\3\2\2\2no\3\2\2\2om\3\2"+
		"\2\2op\3\2\2\2p\n\3\2\2\2qr\7\62\2\2rs\7z\2\2su\3\2\2\2tv\4\62;\2ut\3"+
		"\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\f\3\2\2\2y~\7$\2\2z}\5\17\b\2{}"+
		"\n\2\2\2|z\3\2\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7$\2\2\u0082\16\3\2\2\2\u0083"+
		"\u0084\7^\2\2\u0084\u0085\13\2\2\2\u0085\20\3\2\2\2\u0086\u0087\t\3\2"+
		"\2\u0087\u0088\3\2\2\2\u0088\u0089\b\t\2\2\u0089\22\3\2\2\2\u008a\u008b"+
		"\t\4\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\n\2\2\u008d\24\3\2\2\2\u008e"+
		"\u0091\5\27\f\2\u008f\u0091\5\31\r\2\u0090\u008e\3\2\2\2\u0090\u008f\3"+
		"\2\2\2\u0091\26\3\2\2\2\u0092\u0093\7v\2\2\u0093\u0094\7t\2\2\u0094\u0095"+
		"\7w\2\2\u0095\u0096\7g\2\2\u0096\30\3\2\2\2\u0097\u0098\7h\2\2\u0098\u0099"+
		"\7c\2\2\u0099\u009a\7n\2\2\u009a\u009b\7u\2\2\u009b\u009c\7g\2\2\u009c"+
		"\32\3\2\2\2\u009d\u00a2\5%\23\2\u009e\u00a2\5\'\24\2\u009f\u00a2\5)\25"+
		"\2\u00a0\u00a2\5\7\4\2\u00a1\u009d\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\34\3\2\2\2\u00a3\u00a7\5\37\20\2\u00a4"+
		"\u00a7\5!\21\2\u00a5\u00a7\5#\22\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a6\u00a5\3\2\2\2\u00a7\36\3\2\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa"+
		"\7g\2\2\u00aa\u00ab\7v\2\2\u00ab \3\2\2\2\u00ac\u00ad\7o\2\2\u00ad\u00ae"+
		"\7c\2\2\u00ae\u00af\7r\2\2\u00af\"\3\2\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2"+
		"\7t\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7{\2\2\u00b5"+
		"$\3\2\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7v\2\2\u00b9"+
		"&\3\2\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7t\2\2\u00bd"+
		"\u00be\7k\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7i\2\2\u00c0(\3\2\2\2\u00c1"+
		"\u00c2\7d\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7n\2\2"+
		"\u00c5*\3\2\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7q\2"+
		"\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7v\2\2\u00cb,\3\2\2\2\u00cc\u00cd\7"+
		"u\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1"+
		"\7e\2\2\u00d1\u00d2\7v\2\2\u00d2.\3\2\2\2\u00d3\u00d4\7/\2\2\u00d4\u00d5"+
		"\7@\2\2\u00d5\60\3\2\2\2\u00d6\u00e1\4c|\2\u00d7\u00dc\4c|\2\u00d8\u00db"+
		"\5\63\32\2\u00d9\u00db\t\5\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2"+
		"\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\5\63\32\2\u00e0\u00d6\3\2\2\2"+
		"\u00e0\u00d7\3\2\2\2\u00e1\62\3\2\2\2\u00e2\u00e9\t\6\2\2\u00e3\u00e5"+
		"\4C\\\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e4\3\2"+
		"\2\2\u00e9\64\3\2\2\2\u00ea\u00eb\7*\2\2\u00eb\66\3\2\2\2\u00ec\u00ed"+
		"\7+\2\2\u00ed8\3\2\2\2\u00ee\u00ef\7}\2\2\u00ef:\3\2\2\2\u00f0\u00f1\7"+
		"\177\2\2\u00f1<\3\2\2\2\u00f2\u00f3\7<\2\2\u00f3>\3\2\2\2\u00f4\u00f5"+
		"\7.\2\2\u00f5@\3\2\2\2\u00f6\u00f7\7=\2\2\u00f7B\3\2\2\2\u00f8\u00f9\7"+
		">\2\2\u00f9D\3\2\2\2\u00fa\u00fb\7@\2\2\u00fbF\3\2\2\2\26\2KNTX^bgow|"+
		"~\u0090\u00a1\u00a6\u00da\u00dc\u00e0\u00e6\u00e8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}