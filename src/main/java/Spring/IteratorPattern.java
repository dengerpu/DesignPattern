package Spring;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-04 20:51
 */
public class IteratorPattern {
    public static void main(String[] args) {
        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("10*(2+1) + 66");
        int result =(Integer) expression.getValue();
        System.out.println(result);
    }
}
