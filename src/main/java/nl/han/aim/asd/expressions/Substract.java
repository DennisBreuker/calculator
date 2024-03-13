package nl.han.aim.asd.expressions;

/**
 * Created by Michel Koolwaaij on 10-10-18.
 */
public class Substract extends Expression {
    public Substract(){
        operator = Operator.SUBSTRACT;
    }

    public float calc() {
        return left.calc() - right.calc();
    }
}
