package calculator;

import expressions.Expression;

import java.util.Stack;

/**
 * Created by Michel Koolwaaij on 11-10-18.
 */
public class Evaluator {

    public float Eval (Expression ast){
        return ast.calc();
    }

}
