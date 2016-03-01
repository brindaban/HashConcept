import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by brindaba on 2/29/16.
 */
public class PowerOfTwoTest {
    @Test
    public void PowerOfTwoIsTrueWhenItHasTheNumberWhichIsPowerOfTwo(){
        PowerOfTwo myNumber = new PowerOfTwo(1);
        assertEquals(true,myNumber.isPowerOfTwo());
    }

    @Test
    public void  PowerOfTwoIsFalseWhenItHasTheNumberWhichIsNotPowerOfTwo(){
        PowerOfTwo myNumber = new PowerOfTwo(0);
        assertEquals(false,myNumber.isPowerOfTwo());

    }
}
