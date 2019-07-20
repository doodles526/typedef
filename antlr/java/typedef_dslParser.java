// Generated from ../typedef_dsl.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class typedef_dslParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, STRING_LITERAL=2, WS=3, NEWLINE=4, TYPE_LITERAL=5, TYPE_CONTEXTABLE=6, 
		STRUCT=7, VARIABLE_NAME_SEPERATOR=8, VARIABLE_NAME=9, OPEN_PAREN=10, CLOSE_PAREN=11, 
		OPEN_BRACKET=12, CLOSE_BRACKET=13, KEY_SEPERATOR=14, VALUE_SEPERATOR=15, 
		END_OF_STATEMENT=16, OPEN_CONTEXT=17, CLOSE_CONTEXT=18;
	public static final int
		RULE_statements = 0, RULE_literal_statement = 1, RULE_phrase = 2, RULE_type_decl = 3, 
		RULE_type_with_context = 4, RULE_type_context = 5, RULE_value = 6, RULE_nested_value = 7, 
		RULE_multiple_values = 8, RULE_key_value_pair = 9, RULE_struct_members = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"statements", "literal_statement", "phrase", "type_decl", "type_with_context", 
			"type_context", "value", "nested_value", "multiple_values", "key_value_pair", 
			"struct_members"
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

	@Override
	public String getGrammarFileName() { return "typedef_dsl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public typedef_dslParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatementsContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(typedef_dslParser.EOF, 0); }
		public List<Literal_statementContext> literal_statement() {
			return getRuleContexts(Literal_statementContext.class);
		}
		public Literal_statementContext literal_statement(int i) {
			return getRuleContext(Literal_statementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typedef_dslListener ) ((typedef_dslListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typedef_dslListener ) ((typedef_dslListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				literal_statement();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIABLE_NAME );
			setState(27);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_statementContext extends ParserRuleContext {
		public TerminalNode VARIABLE_NAME() { return getToken(typedef_dslParser.VARIABLE_NAME, 0); }
		public TerminalNode VARIABLE_NAME_SEPERATOR() { return getToken(typedef_dslParser.VARIABLE_NAME_SEPERATOR, 0); }
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public TerminalNode END_OF_STATEMENT() { return getToken(typedef_dslParser.END_OF_STATEMENT, 0); }
		public Literal_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typedef_dslListener ) ((typedef_dslListener)listener).enterLiteral_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typedef_dslListener ) ((typedef_dslListener)listener).exitLiteral_statement(this);
		}
	}

	public final Literal_statementContext literal_statement() throws RecognitionException {
		Literal_statementContext _localctx = new Literal_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_literal_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(VARIABLE_NAME);
			setState(30);
			match(VARIABLE_NAME_SEPERATOR);
			setState(31);
			phrase();
			setState(32);
			match(END_OF_STATEMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PhraseContext extends ParserRuleContext {
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode STRUCT() { return getToken(typedef_dslParser.STRUCT, 0); }
		public Struct_membersContext struct_members() {
			return getRuleContext(Struct_membersContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(typedef_dslParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(typedef_dslParser.WS, i);
		}
		public PhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typedef_dslListener ) ((typedef_dslListener)listener).enterPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typedef_dslListener ) ((typedef_dslListener)listener).exitPhrase(this);
		}
	}

	public final PhraseContext phrase() throws RecognitionException {
		PhraseContext _localctx = new PhraseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_phrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_LITERAL:
			case TYPE_CONTEXTABLE:
				{
				{
				setState(34);
				type_decl();
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(35);
					match(WS);
					}
					}
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(41);
				value();
				}
				}
				break;
			case STRUCT:
				{
				{
				setState(43);
				match(STRUCT);
				setState(44);
				struct_members();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_declContext extends ParserRuleContext {
		public Type_with_contextContext type_with_context() {
			return getRuleContext(Type_with_contextContext.class,0);
		}
		public TerminalNode TYPE_LITERAL() { return getToken(typedef_dslParser.TYPE_LITERAL, 0); }
		public Type_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typedef_dslListener ) ((typedef_dslListener)listener).enterType_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typedef_dslListener ) ((typedef_dslListener)listener).exitType_decl(this);
		}
	}

	public final Type_declContext type_decl() throws RecognitionException {
		Type_declContext _localctx = new Type_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_CONTEXTABLE:
				{
				setState(47);
				type_with_context();
				}
				break;
			case TYPE_LITERAL:
				{
				setState(48);
				match(TYPE_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_with_contextContext extends ParserRuleContext {
		public TerminalNode TYPE_CONTEXTABLE() { return getToken(typedef_dslParser.TYPE_CONTEXTABLE, 0); }
		public Type_contextContext type_context() {
			return getRuleContext(Type_contextContext.class,0);
		}
		public Type_with_contextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_with_context; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typedef_dslListener ) ((typedef_dslListener)listener).enterType_with_context(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typedef_dslListener ) ((typedef_dslListener)listener).exitType_with_context(this);
		}
	}

	public final Type_with_contextContext type_with_context() throws RecognitionException {
		Type_with_contextContext _localctx = new Type_with_contextContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type_with_context);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(TYPE_CONTEXTABLE);
			setState(52);
			type_context();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_contextContext extends ParserRuleContext {
		public TerminalNode OPEN_CONTEXT() { return getToken(typedef_dslParser.OPEN_CONTEXT, 0); }
		public List<Type_declContext> type_decl() {
			return getRuleContexts(Type_declContext.class);
		}
		public Type_declContext type_decl(int i) {
			return getRuleContext(Type_declContext.class,i);
		}
		public TerminalNode CLOSE_CONTEXT() { return getToken(typedef_dslParser.CLOSE_CONTEXT, 0); }
		public List<TerminalNode> VALUE_SEPERATOR() { return getTokens(typedef_dslParser.VALUE_SEPERATOR); }
		public TerminalNode VALUE_SEPERATOR(int i) {
			return getToken(typedef_dslParser.VALUE_SEPERATOR, i);
		}
		public Type_contextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_context; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typedef_dslListener ) ((typedef_dslListener)listener).enterType_context(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typedef_dslListener ) ((typedef_dslListener)listener).exitType_context(this);
		}
	}

	public final Type_contextContext type_context() throws RecognitionException {
		Type_contextContext _localctx = new Type_contextContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type_context);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(OPEN_CONTEXT);
			setState(55);
			type_decl();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VALUE_SEPERATOR) {
				{
				{
				setState(56);
				match(VALUE_SEPERATOR);
				setState(57);
				type_decl();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(CLOSE_CONTEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(typedef_dslParser.NUMBER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(typedef_dslParser.STRING_LITERAL, 0); }
		public Nested_valueContext nested_value() {
			return getRuleContext(Nested_valueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typedef_dslListener ) ((typedef_dslListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typedef_dslListener ) ((typedef_dslListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(65);
				match(NUMBER);
				}
				break;
			case STRING_LITERAL:
				{
				setState(66);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_BRACKET:
				{
				setState(67);
				nested_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nested_valueContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(typedef_dslParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(typedef_dslParser.CLOSE_BRACKET, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Multiple_valuesContext multiple_values() {
			return getRuleContext(Multiple_valuesContext.class,0);
		}
		public Key_value_pairContext key_value_pair() {
			return getRuleContext(Key_value_pairContext.class,0);
		}
		public TerminalNode VALUE_SEPERATOR() { return getToken(typedef_dslParser.VALUE_SEPERATOR, 0); }
		public Nested_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typedef_dslListener ) ((typedef_dslListener)listener).enterNested_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typedef_dslListener ) ((typedef_dslListener)listener).exitNested_value(this);
		}
	}

	public final Nested_valueContext nested_value() throws RecognitionException {
		Nested_valueContext _localctx = new Nested_valueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nested_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(OPEN_BRACKET);
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(71);
				value();
				}
				break;
			case 2:
				{
				setState(72);
				multiple_values();
				}
				break;
			case 3:
				{
				setState(73);
				key_value_pair();
				}
				break;
			}
			setState(76);
			match(CLOSE_BRACKET);
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(77);
				match(VALUE_SEPERATOR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiple_valuesContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> VALUE_SEPERATOR() { return getTokens(typedef_dslParser.VALUE_SEPERATOR); }
		public TerminalNode VALUE_SEPERATOR(int i) {
			return getToken(typedef_dslParser.VALUE_SEPERATOR, i);
		}
		public Multiple_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typedef_dslListener ) ((typedef_dslListener)listener).enterMultiple_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typedef_dslListener ) ((typedef_dslListener)listener).exitMultiple_values(this);
		}
	}

	public final Multiple_valuesContext multiple_values() throws RecognitionException {
		Multiple_valuesContext _localctx = new Multiple_valuesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multiple_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			value();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VALUE_SEPERATOR) {
				{
				{
				setState(81);
				match(VALUE_SEPERATOR);
				setState(82);
				value();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key_value_pairContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode KEY_SEPERATOR() { return getToken(typedef_dslParser.KEY_SEPERATOR, 0); }
		public Key_value_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_value_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typedef_dslListener ) ((typedef_dslListener)listener).enterKey_value_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typedef_dslListener ) ((typedef_dslListener)listener).exitKey_value_pair(this);
		}
	}

	public final Key_value_pairContext key_value_pair() throws RecognitionException {
		Key_value_pairContext _localctx = new Key_value_pairContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_key_value_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			value();
			setState(89);
			match(KEY_SEPERATOR);
			setState(90);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_membersContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(typedef_dslParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> VARIABLE_NAME() { return getTokens(typedef_dslParser.VARIABLE_NAME); }
		public TerminalNode VARIABLE_NAME(int i) {
			return getToken(typedef_dslParser.VARIABLE_NAME, i);
		}
		public List<Type_declContext> type_decl() {
			return getRuleContexts(Type_declContext.class);
		}
		public Type_declContext type_decl(int i) {
			return getRuleContext(Type_declContext.class,i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(typedef_dslParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(typedef_dslParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(typedef_dslParser.NEWLINE, i);
		}
		public Struct_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typedef_dslListener ) ((typedef_dslListener)listener).enterStruct_members(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typedef_dslListener ) ((typedef_dslListener)listener).exitStruct_members(this);
		}
	}

	public final Struct_membersContext struct_members() throws RecognitionException {
		Struct_membersContext _localctx = new Struct_membersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_struct_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(OPEN_BRACKET);
			setState(93);
			match(VARIABLE_NAME);
			setState(94);
			type_decl();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(95);
					match(NEWLINE);
					}
					}
					setState(98); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(100);
				match(VARIABLE_NAME);
				setState(101);
				type_decl();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24p\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\6\2\32\n\2\r\2\16\2\33\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\7\4\'\n\4\f\4\16\4*\13\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\5\3\5\5\5\64\n"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7=\n\7\f\7\16\7@\13\7\3\7\3\7\3\b\3\b"+
		"\3\b\5\bG\n\b\3\t\3\t\3\t\3\t\5\tM\n\t\3\t\3\t\5\tQ\n\t\3\n\3\n\3\n\7"+
		"\nV\n\n\f\n\16\nY\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\6\fc\n\f\r"+
		"\f\16\fd\3\f\3\f\7\fi\n\f\f\f\16\fl\13\f\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f"+
		"\16\20\22\24\26\2\2\2q\2\31\3\2\2\2\4\37\3\2\2\2\6/\3\2\2\2\b\63\3\2\2"+
		"\2\n\65\3\2\2\2\f8\3\2\2\2\16F\3\2\2\2\20H\3\2\2\2\22R\3\2\2\2\24Z\3\2"+
		"\2\2\26^\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2"+
		"\2\33\34\3\2\2\2\34\35\3\2\2\2\35\36\7\2\2\3\36\3\3\2\2\2\37 \7\13\2\2"+
		" !\7\n\2\2!\"\5\6\4\2\"#\7\22\2\2#\5\3\2\2\2$(\5\b\5\2%\'\7\5\2\2&%\3"+
		"\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\5\16\b\2,"+
		"\60\3\2\2\2-.\7\t\2\2.\60\5\26\f\2/$\3\2\2\2/-\3\2\2\2\60\7\3\2\2\2\61"+
		"\64\5\n\6\2\62\64\7\7\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\t\3\2\2\2\65"+
		"\66\7\b\2\2\66\67\5\f\7\2\67\13\3\2\2\289\7\23\2\29>\5\b\5\2:;\7\21\2"+
		"\2;=\5\b\5\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2"+
		"\2AB\7\24\2\2B\r\3\2\2\2CG\7\3\2\2DG\7\4\2\2EG\5\20\t\2FC\3\2\2\2FD\3"+
		"\2\2\2FE\3\2\2\2G\17\3\2\2\2HL\7\16\2\2IM\5\16\b\2JM\5\22\n\2KM\5\24\13"+
		"\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2MN\3\2\2\2NP\7\17\2\2OQ\7\21\2\2PO\3\2"+
		"\2\2PQ\3\2\2\2Q\21\3\2\2\2RW\5\16\b\2ST\7\21\2\2TV\5\16\b\2US\3\2\2\2"+
		"VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\23\3\2\2\2YW\3\2\2\2Z[\5\16\b\2[\\\7\20"+
		"\2\2\\]\5\16\b\2]\25\3\2\2\2^_\7\16\2\2_`\7\13\2\2`j\5\b\5\2ac\7\6\2\2"+
		"ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\13\2\2gi\5\b\5"+
		"\2hb\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\17"+
		"\2\2n\27\3\2\2\2\r\33(/\63>FLPWdj";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}