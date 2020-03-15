package parser;

import expressions.*;
import expressions.Number;

import java.util.Stack;

/**
 * Created by Michel Koolwaaij on 10-10-18.
 */
public class ExpressionsReader extends ExpressionsBaseListener {
    Stack<Expression> expressions = new Stack<Expression>();

    public ExpressionsReader(){
    }

    @Override
    public void enterExpression(ExpressionsParser.ExpressionContext ctx){

    }

    public Expression getExpressions() {
        return expressions.peek();
    }

    @Override
    public void exitExpression(ExpressionsParser.ExpressionContext ctx){
        Expression exp;

        if (ctx.getChildCount() == 1){ // Leaf
            exp = new Number();
            ((Number) exp).setNumber(ctx.getChild(0).getText());
            expressions.push(exp);
        }

        if (ctx.getChildCount() == 3){
            char Op = ctx.getChild(1).getText().charAt(0);
            switch (Op){
                case '*': exp = new Multiply(); break;
                case '+': exp = new Add();break;
                case '/': exp = new Divide(); break;
                default: exp = new Substract(); break;
            }
            exp.setRight(expressions.pop());
            exp.setLeft(expressions.pop());
            expressions.push(exp);
        }
    }
}
