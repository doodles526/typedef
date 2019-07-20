# Generated from typedef_dsl.g4 by ANTLR 4.7.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25")
        buf.write("q\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\6\2\32\n\2")
        buf.write("\r\2\16\2\33\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4\'")
        buf.write("\n\4\f\4\16\4*\13\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\5\3\5")
        buf.write("\5\5\64\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7=\n\7\f\7\16")
        buf.write("\7@\13\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bH\n\b\3\t\3\t\3\t")
        buf.write("\3\t\5\tN\n\t\3\t\3\t\5\tR\n\t\3\n\3\n\3\n\7\nW\n\n\f")
        buf.write("\n\16\nZ\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\6\f")
        buf.write("d\n\f\r\f\16\fe\3\f\3\f\7\fj\n\f\f\f\16\fm\13\f\3\f\3")
        buf.write("\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2s\2\31\3")
        buf.write("\2\2\2\4\37\3\2\2\2\6/\3\2\2\2\b\63\3\2\2\2\n\65\3\2\2")
        buf.write("\2\f8\3\2\2\2\16G\3\2\2\2\20I\3\2\2\2\22S\3\2\2\2\24[")
        buf.write("\3\2\2\2\26_\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\33")
        buf.write("\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35")
        buf.write("\36\7\2\2\3\36\3\3\2\2\2\37 \7\f\2\2 !\7\13\2\2!\"\5\6")
        buf.write("\4\2\"#\7\23\2\2#\5\3\2\2\2$(\5\b\5\2%\'\7\5\2\2&%\3\2")
        buf.write("\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2")
        buf.write("\2+,\5\16\b\2,\60\3\2\2\2-.\7\n\2\2.\60\5\26\f\2/$\3\2")
        buf.write("\2\2/-\3\2\2\2\60\7\3\2\2\2\61\64\5\n\6\2\62\64\7\b\2")
        buf.write("\2\63\61\3\2\2\2\63\62\3\2\2\2\64\t\3\2\2\2\65\66\7\t")
        buf.write("\2\2\66\67\5\f\7\2\67\13\3\2\2\289\7\24\2\29>\5\b\5\2")
        buf.write(":;\7\22\2\2;=\5\b\5\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?")
        buf.write("\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\25\2\2B\r\3\2\2\2CH\7")
        buf.write("\7\2\2DH\7\3\2\2EH\7\4\2\2FH\5\20\t\2GC\3\2\2\2GD\3\2")
        buf.write("\2\2GE\3\2\2\2GF\3\2\2\2H\17\3\2\2\2IM\7\17\2\2JN\5\16")
        buf.write("\b\2KN\5\22\n\2LN\5\24\13\2MJ\3\2\2\2MK\3\2\2\2ML\3\2")
        buf.write("\2\2NO\3\2\2\2OQ\7\20\2\2PR\7\22\2\2QP\3\2\2\2QR\3\2\2")
        buf.write("\2R\21\3\2\2\2SX\5\16\b\2TU\7\22\2\2UW\5\16\b\2VT\3\2")
        buf.write("\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\23\3\2\2\2ZX\3\2\2")
        buf.write("\2[\\\5\16\b\2\\]\7\21\2\2]^\5\16\b\2^\25\3\2\2\2_`\7")
        buf.write("\17\2\2`a\7\f\2\2ak\5\b\5\2bd\7\6\2\2cb\3\2\2\2de\3\2")
        buf.write("\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\f\2\2hj\5\b\5\2")
        buf.write("ic\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3")
        buf.write("\2\2\2no\7\20\2\2o\27\3\2\2\2\r\33(/\63>GMQXek")
        return buf.getvalue()


class typedef_dslParser ( Parser ):

    grammarFileName = "typedef_dsl.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'struct'", "'->'", "<INVALID>", "'('", "')'", "'{'", 
                     "'}'", "':'", "','", "';'", "'<'", "'>'" ]

    symbolicNames = [ "<INVALID>", "NUMBER", "STRING_LITERAL", "WS", "NEWLINE", 
                      "BOOLEAN_VALUE", "TYPE_LITERAL", "TYPE_CONTEXTABLE", 
                      "STRUCT", "VARIABLE_NAME_SEPERATOR", "VARIABLE_NAME", 
                      "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", 
                      "KEY_SEPERATOR", "VALUE_SEPERATOR", "END_OF_STATEMENT", 
                      "OPEN_CONTEXT", "CLOSE_CONTEXT" ]

    RULE_statements = 0
    RULE_literal_statement = 1
    RULE_phrase = 2
    RULE_type_decl = 3
    RULE_type_with_context = 4
    RULE_type_context = 5
    RULE_value = 6
    RULE_nested_value = 7
    RULE_multiple_values = 8
    RULE_key_value_pair = 9
    RULE_struct_members = 10

    ruleNames =  [ "statements", "literal_statement", "phrase", "type_decl", 
                   "type_with_context", "type_context", "value", "nested_value", 
                   "multiple_values", "key_value_pair", "struct_members" ]

    EOF = Token.EOF
    NUMBER=1
    STRING_LITERAL=2
    WS=3
    NEWLINE=4
    BOOLEAN_VALUE=5
    TYPE_LITERAL=6
    TYPE_CONTEXTABLE=7
    STRUCT=8
    VARIABLE_NAME_SEPERATOR=9
    VARIABLE_NAME=10
    OPEN_PAREN=11
    CLOSE_PAREN=12
    OPEN_BRACKET=13
    CLOSE_BRACKET=14
    KEY_SEPERATOR=15
    VALUE_SEPERATOR=16
    END_OF_STATEMENT=17
    OPEN_CONTEXT=18
    CLOSE_CONTEXT=19

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class StatementsContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(typedef_dslParser.EOF, 0)

        def literal_statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(typedef_dslParser.Literal_statementContext)
            else:
                return self.getTypedRuleContext(typedef_dslParser.Literal_statementContext,i)


        def getRuleIndex(self):
            return typedef_dslParser.RULE_statements

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatements" ):
                listener.enterStatements(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatements" ):
                listener.exitStatements(self)




    def statements(self):

        localctx = typedef_dslParser.StatementsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_statements)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 23 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 22
                self.literal_statement()
                self.state = 25 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==typedef_dslParser.VARIABLE_NAME):
                    break

            self.state = 27
            self.match(typedef_dslParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Literal_statementContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VARIABLE_NAME(self):
            return self.getToken(typedef_dslParser.VARIABLE_NAME, 0)

        def VARIABLE_NAME_SEPERATOR(self):
            return self.getToken(typedef_dslParser.VARIABLE_NAME_SEPERATOR, 0)

        def phrase(self):
            return self.getTypedRuleContext(typedef_dslParser.PhraseContext,0)


        def END_OF_STATEMENT(self):
            return self.getToken(typedef_dslParser.END_OF_STATEMENT, 0)

        def getRuleIndex(self):
            return typedef_dslParser.RULE_literal_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLiteral_statement" ):
                listener.enterLiteral_statement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLiteral_statement" ):
                listener.exitLiteral_statement(self)




    def literal_statement(self):

        localctx = typedef_dslParser.Literal_statementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_literal_statement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 29
            self.match(typedef_dslParser.VARIABLE_NAME)
            self.state = 30
            self.match(typedef_dslParser.VARIABLE_NAME_SEPERATOR)
            self.state = 31
            self.phrase()
            self.state = 32
            self.match(typedef_dslParser.END_OF_STATEMENT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PhraseContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def type_decl(self):
            return self.getTypedRuleContext(typedef_dslParser.Type_declContext,0)


        def value(self):
            return self.getTypedRuleContext(typedef_dslParser.ValueContext,0)


        def WS(self, i:int=None):
            if i is None:
                return self.getTokens(typedef_dslParser.WS)
            else:
                return self.getToken(typedef_dslParser.WS, i)

        def STRUCT(self):
            return self.getToken(typedef_dslParser.STRUCT, 0)

        def struct_members(self):
            return self.getTypedRuleContext(typedef_dslParser.Struct_membersContext,0)


        def getRuleIndex(self):
            return typedef_dslParser.RULE_phrase

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPhrase" ):
                listener.enterPhrase(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPhrase" ):
                listener.exitPhrase(self)




    def phrase(self):

        localctx = typedef_dslParser.PhraseContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_phrase)
        self._la = 0 # Token type
        try:
            self.state = 45
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [typedef_dslParser.TYPE_LITERAL, typedef_dslParser.TYPE_CONTEXTABLE]:
                self.enterOuterAlt(localctx, 1)
                self.state = 34
                self.type_decl()
                self.state = 38
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==typedef_dslParser.WS:
                    self.state = 35
                    self.match(typedef_dslParser.WS)
                    self.state = 40
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 41
                self.value()
                pass
            elif token in [typedef_dslParser.STRUCT]:
                self.enterOuterAlt(localctx, 2)
                self.state = 43
                self.match(typedef_dslParser.STRUCT)
                self.state = 44
                self.struct_members()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Type_declContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def type_with_context(self):
            return self.getTypedRuleContext(typedef_dslParser.Type_with_contextContext,0)


        def TYPE_LITERAL(self):
            return self.getToken(typedef_dslParser.TYPE_LITERAL, 0)

        def getRuleIndex(self):
            return typedef_dslParser.RULE_type_decl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterType_decl" ):
                listener.enterType_decl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitType_decl" ):
                listener.exitType_decl(self)




    def type_decl(self):

        localctx = typedef_dslParser.Type_declContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_type_decl)
        try:
            self.state = 49
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [typedef_dslParser.TYPE_CONTEXTABLE]:
                self.enterOuterAlt(localctx, 1)
                self.state = 47
                self.type_with_context()
                pass
            elif token in [typedef_dslParser.TYPE_LITERAL]:
                self.enterOuterAlt(localctx, 2)
                self.state = 48
                self.match(typedef_dslParser.TYPE_LITERAL)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Type_with_contextContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TYPE_CONTEXTABLE(self):
            return self.getToken(typedef_dslParser.TYPE_CONTEXTABLE, 0)

        def type_context(self):
            return self.getTypedRuleContext(typedef_dslParser.Type_contextContext,0)


        def getRuleIndex(self):
            return typedef_dslParser.RULE_type_with_context

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterType_with_context" ):
                listener.enterType_with_context(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitType_with_context" ):
                listener.exitType_with_context(self)




    def type_with_context(self):

        localctx = typedef_dslParser.Type_with_contextContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_type_with_context)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 51
            self.match(typedef_dslParser.TYPE_CONTEXTABLE)
            self.state = 52
            self.type_context()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Type_contextContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def OPEN_CONTEXT(self):
            return self.getToken(typedef_dslParser.OPEN_CONTEXT, 0)

        def type_decl(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(typedef_dslParser.Type_declContext)
            else:
                return self.getTypedRuleContext(typedef_dslParser.Type_declContext,i)


        def CLOSE_CONTEXT(self):
            return self.getToken(typedef_dslParser.CLOSE_CONTEXT, 0)

        def VALUE_SEPERATOR(self, i:int=None):
            if i is None:
                return self.getTokens(typedef_dslParser.VALUE_SEPERATOR)
            else:
                return self.getToken(typedef_dslParser.VALUE_SEPERATOR, i)

        def getRuleIndex(self):
            return typedef_dslParser.RULE_type_context

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterType_context" ):
                listener.enterType_context(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitType_context" ):
                listener.exitType_context(self)




    def type_context(self):

        localctx = typedef_dslParser.Type_contextContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_type_context)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 54
            self.match(typedef_dslParser.OPEN_CONTEXT)
            self.state = 55
            self.type_decl()
            self.state = 60
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==typedef_dslParser.VALUE_SEPERATOR:
                self.state = 56
                self.match(typedef_dslParser.VALUE_SEPERATOR)
                self.state = 57
                self.type_decl()
                self.state = 62
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 63
            self.match(typedef_dslParser.CLOSE_CONTEXT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ValueContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BOOLEAN_VALUE(self):
            return self.getToken(typedef_dslParser.BOOLEAN_VALUE, 0)

        def NUMBER(self):
            return self.getToken(typedef_dslParser.NUMBER, 0)

        def STRING_LITERAL(self):
            return self.getToken(typedef_dslParser.STRING_LITERAL, 0)

        def nested_value(self):
            return self.getTypedRuleContext(typedef_dslParser.Nested_valueContext,0)


        def getRuleIndex(self):
            return typedef_dslParser.RULE_value

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterValue" ):
                listener.enterValue(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitValue" ):
                listener.exitValue(self)




    def value(self):

        localctx = typedef_dslParser.ValueContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_value)
        try:
            self.state = 69
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [typedef_dslParser.BOOLEAN_VALUE]:
                self.enterOuterAlt(localctx, 1)
                self.state = 65
                self.match(typedef_dslParser.BOOLEAN_VALUE)
                pass
            elif token in [typedef_dslParser.NUMBER]:
                self.enterOuterAlt(localctx, 2)
                self.state = 66
                self.match(typedef_dslParser.NUMBER)
                pass
            elif token in [typedef_dslParser.STRING_LITERAL]:
                self.enterOuterAlt(localctx, 3)
                self.state = 67
                self.match(typedef_dslParser.STRING_LITERAL)
                pass
            elif token in [typedef_dslParser.OPEN_BRACKET]:
                self.enterOuterAlt(localctx, 4)
                self.state = 68
                self.nested_value()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Nested_valueContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def OPEN_BRACKET(self):
            return self.getToken(typedef_dslParser.OPEN_BRACKET, 0)

        def CLOSE_BRACKET(self):
            return self.getToken(typedef_dslParser.CLOSE_BRACKET, 0)

        def value(self):
            return self.getTypedRuleContext(typedef_dslParser.ValueContext,0)


        def multiple_values(self):
            return self.getTypedRuleContext(typedef_dslParser.Multiple_valuesContext,0)


        def key_value_pair(self):
            return self.getTypedRuleContext(typedef_dslParser.Key_value_pairContext,0)


        def VALUE_SEPERATOR(self):
            return self.getToken(typedef_dslParser.VALUE_SEPERATOR, 0)

        def getRuleIndex(self):
            return typedef_dslParser.RULE_nested_value

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNested_value" ):
                listener.enterNested_value(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNested_value" ):
                listener.exitNested_value(self)




    def nested_value(self):

        localctx = typedef_dslParser.Nested_valueContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_nested_value)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 71
            self.match(typedef_dslParser.OPEN_BRACKET)
            self.state = 75
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,6,self._ctx)
            if la_ == 1:
                self.state = 72
                self.value()
                pass

            elif la_ == 2:
                self.state = 73
                self.multiple_values()
                pass

            elif la_ == 3:
                self.state = 74
                self.key_value_pair()
                pass


            self.state = 77
            self.match(typedef_dslParser.CLOSE_BRACKET)
            self.state = 79
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
            if la_ == 1:
                self.state = 78
                self.match(typedef_dslParser.VALUE_SEPERATOR)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Multiple_valuesContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def value(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(typedef_dslParser.ValueContext)
            else:
                return self.getTypedRuleContext(typedef_dslParser.ValueContext,i)


        def VALUE_SEPERATOR(self, i:int=None):
            if i is None:
                return self.getTokens(typedef_dslParser.VALUE_SEPERATOR)
            else:
                return self.getToken(typedef_dslParser.VALUE_SEPERATOR, i)

        def getRuleIndex(self):
            return typedef_dslParser.RULE_multiple_values

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMultiple_values" ):
                listener.enterMultiple_values(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMultiple_values" ):
                listener.exitMultiple_values(self)




    def multiple_values(self):

        localctx = typedef_dslParser.Multiple_valuesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_multiple_values)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 81
            self.value()
            self.state = 86
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==typedef_dslParser.VALUE_SEPERATOR:
                self.state = 82
                self.match(typedef_dslParser.VALUE_SEPERATOR)
                self.state = 83
                self.value()
                self.state = 88
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Key_value_pairContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def value(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(typedef_dslParser.ValueContext)
            else:
                return self.getTypedRuleContext(typedef_dslParser.ValueContext,i)


        def KEY_SEPERATOR(self):
            return self.getToken(typedef_dslParser.KEY_SEPERATOR, 0)

        def getRuleIndex(self):
            return typedef_dslParser.RULE_key_value_pair

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterKey_value_pair" ):
                listener.enterKey_value_pair(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitKey_value_pair" ):
                listener.exitKey_value_pair(self)




    def key_value_pair(self):

        localctx = typedef_dslParser.Key_value_pairContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_key_value_pair)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 89
            self.value()
            self.state = 90
            self.match(typedef_dslParser.KEY_SEPERATOR)
            self.state = 91
            self.value()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Struct_membersContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def OPEN_BRACKET(self):
            return self.getToken(typedef_dslParser.OPEN_BRACKET, 0)

        def VARIABLE_NAME(self, i:int=None):
            if i is None:
                return self.getTokens(typedef_dslParser.VARIABLE_NAME)
            else:
                return self.getToken(typedef_dslParser.VARIABLE_NAME, i)

        def type_decl(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(typedef_dslParser.Type_declContext)
            else:
                return self.getTypedRuleContext(typedef_dslParser.Type_declContext,i)


        def CLOSE_BRACKET(self):
            return self.getToken(typedef_dslParser.CLOSE_BRACKET, 0)

        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(typedef_dslParser.NEWLINE)
            else:
                return self.getToken(typedef_dslParser.NEWLINE, i)

        def getRuleIndex(self):
            return typedef_dslParser.RULE_struct_members

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStruct_members" ):
                listener.enterStruct_members(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStruct_members" ):
                listener.exitStruct_members(self)




    def struct_members(self):

        localctx = typedef_dslParser.Struct_membersContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_struct_members)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 93
            self.match(typedef_dslParser.OPEN_BRACKET)
            self.state = 94
            self.match(typedef_dslParser.VARIABLE_NAME)
            self.state = 95
            self.type_decl()
            self.state = 105
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==typedef_dslParser.NEWLINE:
                self.state = 97 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 96
                    self.match(typedef_dslParser.NEWLINE)
                    self.state = 99 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not (_la==typedef_dslParser.NEWLINE):
                        break

                self.state = 101
                self.match(typedef_dslParser.VARIABLE_NAME)
                self.state = 102
                self.type_decl()
                self.state = 107
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 108
            self.match(typedef_dslParser.CLOSE_BRACKET)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





