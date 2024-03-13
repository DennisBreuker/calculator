package nl.han.aim.asd.expression;

/**
 * Created by Michel Koolwaaij on 12-10-18.
 */
public class Division extends Expression {
    @Override
    public double evaluate() {
        return left.evaluate() / right.evaluate();
    }
}
