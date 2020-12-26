# Generated from ./typedef_dsl.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .typedef_dslParser import typedef_dslParser
else:
    from typedef_dslParser import typedef_dslParser

# This class defines a complete listener for a parse tree produced by typedef_dslParser.
class TopLevelListener(ParseTreeListener):
    def __init__(self, handlers):
        self.handlers = handlers

    # Enter a parse tree produced by typedef_dslParser#statements.
    def enterStatements(self, ctx:typedef_dslParser.StatementsContext):
        for handler in self.handlers:
            handler.beginNewInputs()

    # Exit a parse tree produced by typedef_dslParser#statements.
    def exitStatements(self, ctx:typedef_dslParser.StatementsContext):
        for handler in self.handlers:
            handler.endNewInputs()


    # Enter a parse tree produced by typedef_dslParser#literal_statement.
    def enterLiteral_statement(self, ctx:typedef_dslParser.Literal_statementContext):
        for handler in self.handlers:
            handler.beginLiteral()
            handler.setVariableName(ctx.VARIABLE_NAME().getText())

    # Exit a parse tree produced by typedef_dslParser#literal_statement.
    def exitLiteral_statement(self, ctx:typedef_dslParser.Literal_statementContext):
        for handler in self.handlers:
            handler.endLiteral()


    # Enter a parse tree produced by typedef_dslParser#valuePhrase.
    def enterValuePhrase(self, ctx:typedef_dslParser.ValuePhraseContext):
        pass

    # Exit a parse tree produced by typedef_dslParser#valuePhrase.
    def exitValuePhrase(self, ctx:typedef_dslParser.ValuePhraseContext):
        pass





    ### TYPE DECLARATION HANDLING ### Note: This is likely optional as types can easily be inferred from the structure

    # Enter a parse tree produced by typedef_dslParser#embeddedType.
    def enterEmbeddedType(self, ctx:typedef_dslParser.EmbeddedTypeContext):
        for handler in self.handlers:
            handler.beginEmbeddedType(ctx.TYPE_EMBEDDED().getText())

    # Exit a parse tree produced by typedef_dslParser#embeddedType.
    def exitEmbeddedType(self, ctx:typedef_dslParser.EmbeddedTypeContext):
        for handler in self.handlers:
            handler.endEmbeddedType()


    # Enter a parse tree produced by typedef_dslParser#literalType.
    def enterLiteralType(self, ctx:typedef_dslParser.LiteralTypeContext):
        for handler in self.handlers:
            handler.setLiteralType(ctx.getText())

    # Exit a parse tree produced by typedef_dslParser#literalType.
    # NOTE: Not recursive - do not need to mark exit of a literal type
    def exitLiteralType(self, ctx:typedef_dslParser.LiteralTypeContext):
        pass




    ### VALUE HANDLING ###
      #  Non-recursive #

    # Enter a parse tree produced by typedef_dslParser#booleanValue.
    def enterBooleanValue(self, ctx:typedef_dslParser.BooleanValueContext):
        for handler in self.handlers:
            # TODO: How to get the token direct?
            handler.setBooleanValue(ctx.getText() == 'true')

    # Enter a parse tree produced by typedef_dslParser#numberValue.
    def enterNumberValue(self, ctx:typedef_dslParser.NumberValueContext):
        # TODO: Parse more corsely to set individual number types instead of fragments?
        for handler in self.handlers:
            handler.setNumberValue(ctx.getText())

    # Enter a parse tree produced by typedef_dslParser#stringValue.
    def enterStringValue(self, ctx:typedef_dslParser.StringValueContext):
        # the [1:-1] is to strip the quotes so individual languages can do as they wish
        # NOTE: String parsing is primitive here - escaped quotes are not properly parsed
        # Also, single quotes are not parsed
        for handler in self.handlers:
            handler.setStringValue(ctx.getText()[1:-1])

    
    # recursive #

    # Enter a parse tree produced by typedef_dslParser#arrayValue.
    def enterArrayValue(self, ctx:typedef_dslParser.ArrayValueContext):
        for handler in self.handlers:
            handler.beginArrayValue()

    # Exit a parse tree produced by typedef_dslParser#arrayValue.
    def exitArrayValue(self, ctx:typedef_dslParser.ArrayValueContext):
        for handler in self.handlers:
            handler.endArrayValue()


    # Enter a parse tree produced by typedef_dslParser#setValue.
    def enterSetValue(self, ctx:typedef_dslParser.SetValueContext):
        for handler in self.handlers:
            handler.beginSetValue()

    # Exit a parse tree produced by typedef_dslParser#setValue.
    def exitSetValue(self, ctx:typedef_dslParser.SetValueContext):
        for handler in self.handlers:
            handler.endSetValue()


    # Enter a parse tree produced by typedef_dslParser#mapValue.
    def enterMapValue(self, ctx:typedef_dslParser.MapValueContext):
        for handler in self.handlers:
            handler.beginMapValue()

    # Exit a parse tree produced by typedef_dslParser#mapValue.
    def exitMapValue(self, ctx:typedef_dslParser.MapValueContext):
        for handler in self.handlers:
            handler.endMapValue()

    # Enter a parse tree produced by typedef_dslParser#multiple_values.
    def enterMultiple_values(self, ctx:typedef_dslParser.Multiple_valuesContext):
        for handler in self.handlers:
            handler.beginMultipleValues()

    # Exit a parse tree produced by typedef_dslParser#multiple_values.
    def exitMultiple_values(self, ctx:typedef_dslParser.Multiple_valuesContext):
        for handler in self.handlers:
            handler.endMultipleValues()

    # Enter a parse tree produced by typedef_dslParser#key_value_pair.
    def enterKey_value_pair(self, ctx:typedef_dslParser.Key_value_pairContext):
        for handler in self.handlers:
            handler.beginKeyValue()

    # Exit a parse tree produced by typedef_dslParser#key_value_pair.
    def exitKey_value_pair(self, ctx:typedef_dslParser.Key_value_pairContext):
        for handler in self.handlers:
            handler.endKeyValue()


    # Enter a parse tree produced by typedef_dslParser#map_kv_key.
    def enterMap_kv_key(self, ctx:typedef_dslParser.Map_kv_keyContext):
        for handler in self.handlers:
            handler.beginKVKey()

    # Exit a parse tree produced by typedef_dslParser#map_kv_key.
    def exitMap_kv_key(self, ctx:typedef_dslParser.Map_kv_keyContext):
        for handler in self.handlers:
            handler.endKVKey()

    # Enter a parse tree produced by typedef_dslParser#map_kv_value.
    def enterMap_kv_value(self, ctx:typedef_dslParser.Map_kv_valueContext):
        for handler in self.handlers:
            handler.beginKVValue()

    # Exit a parse tree produced by typedef_dslParser#map_kv_value.
    def exitMap_kv_value(self, ctx:typedef_dslParser.Map_kv_valueContext):
        for handler in self.handlers:
            handler.endKVValue()

    ### Struct Members ###
    # NOTE: Not implemented

    # Enter a parse tree produced by typedef_dslParser#structPhrase.
    # TODO: Implement struct types
    def enterStructPhrase(self, ctx:typedef_dslParser.StructPhraseContext):
        pass

    # Exit a parse tree produced by typedef_dslParser#structPhrase.
    # TODO: Implement struct types
    def exitStructPhrase(self, ctx:typedef_dslParser.StructPhraseContext):
        pass

    # Enter a parse tree produced by typedef_dslParser#struct_members.
    def enterStruct_members(self, ctx:typedef_dslParser.Struct_membersContext):
        pass

    # Exit a parse tree produced by typedef_dslParser#struct_members.
    def exitStruct_members(self, ctx:typedef_dslParser.Struct_membersContext):
        pass



del typedef_dslParser
