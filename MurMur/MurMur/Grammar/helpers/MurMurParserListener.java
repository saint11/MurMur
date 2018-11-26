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
	 * Enter a parse tree produced by {@link MurMurParser#pickBlock}.
	 * @param ctx the parse tree
	 */
	void enterPickBlock(MurMurParser.PickBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#pickBlock}.
	 * @param ctx the parse tree
	 */
	void exitPickBlock(MurMurParser.PickBlockContext ctx);
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
	 * Enter a parse tree produced by {@link MurMurParser#fastPickBlock}.
	 * @param ctx the parse tree
	 */
	void enterFastPickBlock(MurMurParser.FastPickBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#fastPickBlock}.
	 * @param ctx the parse tree
	 */
	void exitFastPickBlock(MurMurParser.FastPickBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#pickThisBlock}.
	 * @param ctx the parse tree
	 */
	void enterPickThisBlock(MurMurParser.PickThisBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#pickThisBlock}.
	 * @param ctx the parse tree
	 */
	void exitPickThisBlock(MurMurParser.PickThisBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(MurMurParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(MurMurParser.CommandContext ctx);
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
	 * Enter a parse tree produced by the {@code additionExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpression(MurMurParser.AdditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additionExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpression(MurMurParser.AdditionExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(MurMurParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link MurMurParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(MurMurParser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#pickCommand}.
	 * @param ctx the parse tree
	 */
	void enterPickCommand(MurMurParser.PickCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#pickCommand}.
	 * @param ctx the parse tree
	 */
	void exitPickCommand(MurMurParser.PickCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MurMurParser#pickThisCommand}.
	 * @param ctx the parse tree
	 */
	void enterPickThisCommand(MurMurParser.PickThisCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MurMurParser#pickThisCommand}.
	 * @param ctx the parse tree
	 */
	void exitPickThisCommand(MurMurParser.PickThisCommandContext ctx);
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