package nl.han.aim.asd.expression;

/**
 * Created by Michel Koolwaaij on 10-10-18.
 */
public class Addition extends Expression{
    @Override
    public String toString() {
        return "(" + left + " + " + right + ")";
    }
}
