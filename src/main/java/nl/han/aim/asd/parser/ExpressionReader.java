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

    // TODO: 4.3 1b -- Maak een Antlr listener klasse waarmee je
    //  de geparseerde sommen omzet naar de bijbehorende AST’s.

}
