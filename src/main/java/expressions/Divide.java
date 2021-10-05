package expressions;

/**
 * Created by Michel Koolwaaij on 12-10-18.
 */
public class Divide extends Expression {
    public Divide(){
        operator = Operator.DIVIDE;
    }

    public float calc() {
        return left.calc() / right.calc();
    }
}
