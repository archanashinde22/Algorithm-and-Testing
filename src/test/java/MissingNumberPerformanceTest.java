import static org.junit.Assert.*;

import com.devMountain.part1.MissingNumber;
import org.junit.Test;
public class MissingNumberPerformanceTest {

        private int[] missingMax = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        private int[] missingNone = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        private int[] missingSeven = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
        private int max = 10;
        private MissingNumber mn = new MissingNumber();

        @Test(timeout=500)
        public void testMissingNumber_Performance() {
            for (int i = 0; i < 1000000; i += 1) {
                mn.missingNumber(missingMax, max);
                mn.missingNumber(missingNone, max);
                mn.missingNumber(missingSeven, max);
            }
        }

        @Test(timeout=1000)
        public void testMissingNumberSum_Performance() {
            for (int i = 0; i < 1000000; i += 1) {
                mn.missingNumberSum(missingMax, max);
                mn.missingNumberSum(missingNone, max);
                mn.missingNumberSum(missingSeven, max);
            }
        }
    }



