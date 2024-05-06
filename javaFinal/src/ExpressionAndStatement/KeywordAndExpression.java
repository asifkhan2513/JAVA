package ExpressionAndStatement;
/*
In Java, a keyword is a word with a predefined meaning in Java programming language syntax.
 */
/*
expression-> compute to a singal value
statement ->  statement are stand-alone units of work
code of block ->  set of expression is a code of block
 */
public class KeywordAndExpression {
    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);

        int highScore = 50;

        if (highScore > 25) {
            highScore = 1000 + highScore;     // add bonus points
        }

        int health = 100;

        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }
    }
}
