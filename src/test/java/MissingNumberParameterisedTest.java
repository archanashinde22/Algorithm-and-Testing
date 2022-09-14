import com.devMountain.part1.MissingNumber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class MissingNumberParameterisedTest {

    MissingNumber mn = new MissingNumber();
    private int[] input;
    private int expectedOutput;

    public MissingNumberParameterisedTest(int[] input, int expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }
    @Parameters
    public static Collection<Object[]> testConditions() {
        int[] missingMax = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] missingNone = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] missingSeven = {1, 2, 3, 4, 5, 6, 8, 9, 10};

        Object[][] expectedOutputs = {
                {missingMax , 10},
                {missingNone , 0} ,
                { missingSeven ,7}
        };
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testMissingNumber_Missing_max(){
        assertEquals(expectedOutput,mn.missingNumber(input,10));
    }
    @Test
    public void testMissingNumberSum_Missing_max(){
        assertEquals(expectedOutput,mn.missingNumberSum(input,10));
    }

}
