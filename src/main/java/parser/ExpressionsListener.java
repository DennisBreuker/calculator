package parser;// Generated from Expressions.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionsParser}.
 */
public interface ExpressionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ExpressionsParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ExpressionsParser.ExpressionContext ctx);
}