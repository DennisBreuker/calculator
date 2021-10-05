package calculator;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.ExpressionsLexer;
import parser.ExpressionsParser;
import parser.ExpressionsReader;

/**
 * Created by Michel Koolwaaij on 10-10-18.
 */
public class Main {
    private final static String input = "16 / 4 + 5 * 2 + 3 * 8 + 2 + 9 / 3";

    public static void main(String[] args){
        CharStream cs = CharStreams.fromString(input);
        ExpressionsLexer lexer = new ExpressionsLexer(cs);
        TokenStream tokens = new CommonTokenStream(lexer);

        ExpressionsParser parser = new ExpressionsParser(tokens); // Tot hier alleen maar aanroepen

        ParseTree tree = parser.expression(); // Ook deze krijg ik cadeau
        ParseTreeWalker walker = new ParseTreeWalker(); // En deze
        ExpressionsReader reader = new ExpressionsReader(); // Alleen deze maak ik zelf
        walker.walk(reader,tree); // En deze krijg ik weer cadeau

        Checker checker = new Checker(reader);
        checker.check();

        System.out.println(input+" = "+new Evaluator().Eval(reader.getExpressions()));

    }
}
