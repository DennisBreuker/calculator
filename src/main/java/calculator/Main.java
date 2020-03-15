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

        ExpressionsParser parser = new ExpressionsParser(tokens);

        ParseTree tree = parser.expression();
        ParseTreeWalker walker = new ParseTreeWalker();
        ExpressionsReader reader = new ExpressionsReader();
        walker.walk(reader,tree);

        System.out.println(input+" = "+new Evaluator().Eval(reader.getExpressions()));

    }
}
