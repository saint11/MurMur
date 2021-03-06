// Generated from ../MurMurParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MurMurParser}.
 */
public interface MurMurParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MurMurParser#murmur}.
	 * @param ctx the parse tree
	 */
	void enterMurmur(MurMurParser.MurmurContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#murmur}.
	 * @param ctx the parse tree
	 */
	void exitMurmur(MurMurParser.MurmurContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#defBlock}.
	 * @param ctx the parse tree
	 */
	void enterDefBlock(MurMurParser.DefBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#defBlock}.
	 * @param ctx the parse tree
	 */
	void exitDefBlock(MurMurParser.DefBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MurMurParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MurMurParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(MurMurParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(MurMurParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MurMurParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MurMurParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#menuBlock}.
	 * @param ctx the parse tree
	 */
	void enterMenuBlock(MurMurParser.MenuBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#menuBlock}.
	 * @param ctx the parse tree
	 */
	void exitMenuBlock(MurMurParser.MenuBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(MurMurParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(MurMurParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(MurMurParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(MurMurParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#lineFragment}.
	 * @param ctx the parse tree
	 */
	void enterLineFragment(MurMurParser.LineFragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#lineFragment}.
	 * @param ctx the parse tree
	 */
	void exitLineFragment(MurMurParser.LineFragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#inlineIfBlock}.
	 * @param ctx the parse tree
	 */
	void enterInlineIfBlock(MurMurParser.InlineIfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#inlineIfBlock}.
	 * @param ctx the parse tree
	 */
	void exitInlineIfBlock(MurMurParser.InlineIfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#inlineIfTrueFragment}.
	 * @param ctx the parse tree
	 */
	void enterInlineIfTrueFragment(MurMurParser.InlineIfTrueFragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#inlineIfTrueFragment}.
	 * @param ctx the parse tree
	 */
	void exitInlineIfTrueFragment(MurMurParser.InlineIfTrueFragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#inlineIfFalseFragment}.
	 * @param ctx the parse tree
	 */
	void enterInlineIfFalseFragment(MurMurParser.InlineIfFalseFragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#inlineIfFalseFragment}.
	 * @param ctx the parse tree
	 */
	void exitInlineIfFalseFragment(MurMurParser.InlineIfFalseFragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#menuSubBlock}.
	 * @param ctx the parse tree
	 */
	void enterMenuSubBlock(MurMurParser.MenuSubBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#menuSubBlock}.
	 * @param ctx the parse tree
	 */
	void exitMenuSubBlock(MurMurParser.MenuSubBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#simpleCommand}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCommand(MurMurParser.SimpleCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#simpleCommand}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCommand(MurMurParser.SimpleCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#multiLineCommand}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineCommand(MurMurParser.MultiLineCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#multiLineCommand}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineCommand(MurMurParser.MultiLineCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(MurMurParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(MurMurParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(MurMurParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(MurMurParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodOrVariableExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodOrVariableExpression(MurMurParser.MethodOrVariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodOrVariableExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodOrVariableExpression(MurMurParser.MethodOrVariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(MurMurParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(MurMurParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(MurMurParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(MurMurParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpression(MurMurParser.AssignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpression(MurMurParser.AssignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparissonExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparissonExpression(MurMurParser.ComparissonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparissonExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparissonExpression(MurMurParser.ComparissonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodExpression(MurMurParser.MethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodExpression(MurMurParser.MethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code priorityExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPriorityExpression(MurMurParser.PriorityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code priorityExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPriorityExpression(MurMurParser.PriorityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpression(MurMurParser.MultiplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpression(MurMurParser.MultiplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(MurMurParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(MurMurParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(MurMurParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(MurMurParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#returnValue}.
	 * @param ctx the parse tree
	 */
	void enterReturnValue(MurMurParser.ReturnValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#returnValue}.
	 * @param ctx the parse tree
	 */
	void exitReturnValue(MurMurParser.ReturnValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#menuCommand}.
	 * @param ctx the parse tree
	 */
	void enterMenuCommand(MurMurParser.MenuCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#menuCommand}.
	 * @param ctx the parse tree
	 */
	void exitMenuCommand(MurMurParser.MenuCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#menuOptionCommand}.
	 * @param ctx the parse tree
	 */
	void enterMenuOptionCommand(MurMurParser.MenuOptionCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#menuOptionCommand}.
	 * @param ctx the parse tree
	 */
	void exitMenuOptionCommand(MurMurParser.MenuOptionCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#ifCommand}.
	 * @param ctx the parse tree
	 */
	void enterIfCommand(MurMurParser.IfCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#ifCommand}.
	 * @param ctx the parse tree
	 */
	void exitIfCommand(MurMurParser.IfCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#elseCommand}.
	 * @param ctx the parse tree
	 */
	void enterElseCommand(MurMurParser.ElseCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#elseCommand}.
	 * @param ctx the parse tree
	 */
	void exitElseCommand(MurMurParser.ElseCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#endCommand}.
	 * @param ctx the parse tree
	 */
	void enterEndCommand(MurMurParser.EndCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#endCommand}.
	 * @param ctx the parse tree
	 */
	void exitEndCommand(MurMurParser.EndCommandContext ctx);
}