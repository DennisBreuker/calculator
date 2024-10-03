package nl.han.aim.asd.expression;

/**
 * Created by Michel Koolwaaij on 10-10-18.
 */
public class Subtraction extends Expression {
    @Override
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }

    public String toString() {
        return "(" + left + " - " + right + ")";
    }
}
