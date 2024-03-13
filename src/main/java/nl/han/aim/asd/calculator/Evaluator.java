package nl.han.aim.asd.calculator;

import nl.han.aim.asd.expression.Expression;

/**
 * Created by Michel Koolwaaij on 11-10-18.
 */
public class Evaluator {

    public double evaluate(Expression ast){
        return ast.evaluate();
    }

}
