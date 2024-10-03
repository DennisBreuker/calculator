package nl.han.aim.asd.expression;

/**
 * Created by Michel Koolwaaij on 10-10-18.
 */
public class Number extends Expression {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNumber(String string) {
        setNumber(Integer.parseInt(string));
    }

    @Override
    public double evaluate() {
        return number;
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
