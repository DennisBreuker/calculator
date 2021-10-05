package expressions;

/**
 * Created by Michel Koolwaaij on 10-10-18.
 */
public class Add extends Expression{
    public Add(){
        operator = Operator.PLUS;
    }

    public float calc() {
        return left.calc() + right.calc();
    }
}
