package calculator;

import expressions.Divide;
import expressions.Expression;
import parser.ExpressionsReader;

public class Checker {
    private Expression expression;
    private ExpressionsReader reader;

    public Checker(ExpressionsReader reader) {
        this.reader = reader;
        this.expression = reader.getExpressions();
    }

    public void check() { //Afvangen delen door nul
        if ((expression instanceof Divide) && (expression.getRight().calc() == 13)){
            throw new CheckerDivide13Exception();
        }
        if (expression.getLeft() != null){
            expression = expression.getLeft();
            check();
        }
        if (expression.getRight() != null){
            expression = expression.getRight();
            check();
        }
    }
}
