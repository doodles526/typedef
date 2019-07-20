// Generated from ./typedef_dsl.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link typedef_dslParser}.
 */
public interface typedef_dslListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link typedef_dslParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(typedef_dslParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link typedef_dslParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(typedef_dslParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link typedef_dslParser#literal_statement}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_statement(typedef_dslParser.Literal_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link typedef_dslParser#literal_statement}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_statement(typedef_dslParser.Literal_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link typedef_dslParser#phrase}.
	 * @param ctx the parse tree
	 */
	void enterPhrase(typedef_dslParser.PhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link typedef_dslParser#phrase}.
	 * @param ctx the parse tree
	 */
	void exitPhrase(typedef_dslParser.PhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link typedef_dslParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void enterType_decl(typedef_dslParser.Type_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link typedef_dslParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void exitType_decl(typedef_dslParser.Type_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link typedef_dslParser#type_with_context}.
	 * @param ctx the parse tree
	 */
	void enterType_with_context(typedef_dslParser.Type_with_contextContext ctx);
	/**
	 * Exit a parse tree produced by {@link typedef_dslParser#type_with_context}.
	 * @param ctx the parse tree
	 */
	void exitType_with_context(typedef_dslParser.Type_with_contextContext ctx);
	/**
	 * Enter a parse tree produced by {@link typedef_dslParser#type_context}.
	 * @param ctx the parse tree
	 */
	void enterType_context(typedef_dslParser.Type_contextContext ctx);
	/**
	 * Exit a parse tree produced by {@link typedef_dslParser#type_context}.
	 * @param ctx the parse tree
	 */
	void exitType_context(typedef_dslParser.Type_contextContext ctx);
	/**
	 * Enter a parse tree produced by {@link typedef_dslParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(typedef_dslParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link typedef_dslParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(typedef_dslParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link typedef_dslParser#nested_value}.
	 * @param ctx the parse tree
	 */
	void enterNested_value(typedef_dslParser.Nested_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link typedef_dslParser#nested_value}.
	 * @param ctx the parse tree
	 */
	void exitNested_value(typedef_dslParser.Nested_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link typedef_dslParser#multiple_values}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_values(typedef_dslParser.Multiple_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link typedef_dslParser#multiple_values}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_values(typedef_dslParser.Multiple_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link typedef_dslParser#key_value_pair}.
	 * @param ctx the parse tree
	 */
	void enterKey_value_pair(typedef_dslParser.Key_value_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link typedef_dslParser#key_value_pair}.
	 * @param ctx the parse tree
	 */
	void exitKey_value_pair(typedef_dslParser.Key_value_pairContext ctx);
	/**
	 * Enter a parse tree produced by {@link typedef_dslParser#struct_members}.
	 * @param ctx the parse tree
	 */
	void enterStruct_members(typedef_dslParser.Struct_membersContext ctx);
	/**
	 * Exit a parse tree produced by {@link typedef_dslParser#struct_members}.
	 * @param ctx the parse tree
	 */
	void exitStruct_members(typedef_dslParser.Struct_membersContext ctx);
}