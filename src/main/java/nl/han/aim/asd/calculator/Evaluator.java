package nl.han.aim.asd.calculator;

import nl.han.aim.asd.expressions.Expression;

/**
 * Created by Michel Koolwaaij on 11-10-18.
 */
public class Evaluator {

    public float Eval (Expression ast){
        return ast.calc();
    }

}
