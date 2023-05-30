package Graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Christy Guo
 * @create 2023-04-10 9:36 AM
 */
class _670MaximumSwapTest {
    
    @Test
    public void testMaximumSwapWithFourDigits() {
        _670MaximumSwap obj = new _670MaximumSwap();
        int num = 2736;
        int expected = 7236;
        int result = obj.maximumSwap(num);
        assertEquals(expected, result);
    }

    @Test
    public void testMaximumSwapWithFiveDigits() {
        _670MaximumSwap obj = new _670MaximumSwap();
        int num = 98368;
        int expected = 98863;
        int result = obj.maximumSwap(num);
        assertEquals(expected, result);
    }

    @Test
    public void testMaximumSwapWithAscendingDigits() {
        _670MaximumSwap obj = new _670MaximumSwap();
        int num = 12345;
        int expected = 12345;
        int result = obj.maximumSwap(num);
        assertEquals(expected, result);
    }
}
