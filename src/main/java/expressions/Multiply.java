package expressions;

/**
 * Created by Michel Koolwaaij on 10-10-18.
 */
public class Multiply extends Expression {
    public Multiply(){
        operator = Operator.TIMES;
    }

    public float calc() {
        return left.calc() * right.calc();
    }
}
