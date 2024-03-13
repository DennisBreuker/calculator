package nl.han.aim.asd.calculator;

import nl.han.aim.asd.expression.Division;
import nl.han.aim.asd.expression.Expression;
import nl.han.aim.asd.parser.ExpressionReader;

public class Checker {
    private ExpressionReader reader;

    public Checker(ExpressionReader reader) {
        this.reader = reader;
    }

    public void check() {
        check(reader.getTopExpression());
    }

    public void check(Expression expression) { // Afvangen delen door dertien
        if (expression == null) {
            return;
        }

        if ((expression instanceof Division) && (expression.getRight().evaluate() == 13)) {
            throw new CheckerDivide13Exception();
        }

        check(expression.getLeft());
        check(expression.getRight());
    }
}
