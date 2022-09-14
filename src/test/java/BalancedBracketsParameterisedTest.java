import com.devMountain.part2.BalancedParentheses;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class BalancedBracketsParameterisedTest {
    BalancedParentheses bp = new BalancedParentheses();
    private String input;
    private boolean expectedOutput;

    public BalancedBracketsParameterisedTest(String input, boolean expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    // define Arguments
    @Parameters
    public static Collection<Object[]>  testConditions() {


        String balancedParens = "(1)";
        String tooManyOpenParens = "((1";
        String tooManyOpenParens1 = "(1)(";
        String tooManyClosedParens = "(1))";
        String startClosedParens = ")(";
        String emptyString = "";
        String balancedAngleBrackets = "<<>>";
        String balancedComboBrackets = "<({})>";
        String mismatchedBrackets = "<({)}>";


        Object[][] expectedOutputs ={
                {balancedParens, true},
                {tooManyOpenParens, false},
                {tooManyOpenParens1, false},
                {tooManyClosedParens ,false},
                {startClosedParens,false},
                {emptyString, true},
                {balancedAngleBrackets,true },
                {balancedComboBrackets,true},
                {mismatchedBrackets, false}
        };
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testBalancedBrackets(){
        assertEquals(expectedOutput, bp.balancedBrackets(input));
    }



}
