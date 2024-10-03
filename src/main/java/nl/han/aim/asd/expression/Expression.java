package nl.han.aim.asd.expression;

/**
 * Created by Michel Koolwaaij on 10-10-18.
 */
public abstract class Expression {
    protected Expression left;
    protected Expression right;

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }
}
