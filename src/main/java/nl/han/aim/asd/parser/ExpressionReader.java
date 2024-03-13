package nl.han.aim.asd.parser;

import nl.han.aim.asd.expression.*;
import nl.han.aim.asd.expression.Number;

import java.util.Stack;

/**
 * Created by Michel Koolwaaij on 10-10-18.
 */
public class ExpressionReader extends ExpressionsBaseListener {
    Stack<Expression> expressions = new Stack<Expression>();

    public Expression getTopExpression() {
        return expressions.peek();
    }

    @Override
    public void exitExpression(ExpressionsParser.ExpressionContext context){
        Expression expression;

        if (context.getChildCount() == 1) { // Leaf → Number
            expression = new Number();
            ((Number) expression).setNumber(context.getChild(0).getText());
            expressions.push(expression);
        }

        if (context.getChildCount() == 3) { // Expression Operator Expression
            char operator = context.getChild(1).getText().charAt(0);
            switch (operator){
                case '*': expression = new Multiplication(); break;
                case '+': expression = new Addition();break;
                case '/': expression = new Division(); break;
                case '-': expression = new Subtraction(); break;
                default: throw new RuntimeException("Unknown operator: " + operator);
            }
            expression.setRight(expressions.pop());
            expression.setLeft(expressions.pop());
            expressions.push(expression);
        }
    }
}
