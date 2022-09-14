import com.devMountain.part2.BalancedParentheses;
import org.junit.Test;import static org.junit.Assert.*;

public class BalancedBracketsTest {

    String balancedParens = "(1)";
    String tooManyOpenParens = "((1";
    String tooManyOpenParens1 = "(1)(";
    String tooManyClosedParens = "(1))";
    String startClosedParens = ")(";
    String emptyString = "";
    String balancedAngleBrackets = "<<>>";
    String balancedComboBrackets = "<({})>";
    String mismatchedBrackets = "<({)}>";
    BalancedParentheses bp = new BalancedParentheses();

    @Test
    public void testBalancedParentheses_balancedParens(){
        assertTrue(bp.balancedParentheses(balancedParens));
    }
    @Test
    public void testBalancedParentheses_tooManyOpenParens(){
        assertFalse(bp.balancedParentheses(tooManyOpenParens));
    }
    @Test
    public void testBalancedParentheses_tooManyOpenParens1(){
        assertFalse(bp.balancedParentheses(tooManyOpenParens1));
    }
    @Test
    public void testBalancedParentheses_tooManyClosedParens() {
        assertFalse(bp.balancedParentheses(tooManyClosedParens));
    }

    @Test
    public void testBalancedParentheses_startClosedParens() {
        assertTrue(bp.balancedParentheses(startClosedParens));
    }
    @Test
    public void testBalancedParentheses_emptyString() {
        assertTrue(bp.balancedParentheses(emptyString));
    }
        @Test
    public void testBalancedBrackets_balancedParens() {
        assertTrue(bp.balancedBrackets("(1)"));
    }

    @Test
    public void testBalancedBrackets_tooManyOpenParens() {
        assertFalse(bp.balancedBrackets("({1)"));
    }

    @Test
    public void testBalancedBrackets_tooManyClosedParens() {
        assertFalse(bp.balancedBrackets("({1})>"));
    }

    @Test
    public void testBalancedBrackets_startWithClosedParens() {
        assertTrue(bp.balancedBrackets(")("));
    }

    @Test
    public void testBalancedBrackets_emptyString() {
        assertTrue(bp.balancedBrackets(""));
    }
    @Test
    public void testBalancedBrackets_balancedAngleBrackets() {
        assertTrue(bp.balancedBrackets(balancedAngleBrackets));
    }

    @Test
    public void testBalancedBrackets_balancedComboBrackets() {
        assertTrue(bp.balancedBrackets(balancedComboBrackets));
    }

    @Test
    public void testBalancedBrackets_mismatchedBrackets() {
        assertTrue(bp.balancedBrackets(mismatchedBrackets));
    }


}
