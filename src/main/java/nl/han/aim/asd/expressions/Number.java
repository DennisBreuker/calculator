package nl.han.aim.asd.expressions;

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
        this.number = Integer.parseInt(string);
    }

    public float calc() {
        return number;
    }
}
