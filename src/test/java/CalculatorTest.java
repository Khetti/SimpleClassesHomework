import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void canSubtract(){
        assertEquals(2, calculator.subtract(6, 4));
    }

    @Test
    public void canMultiply(){
        assertEquals(10, calculator.multiply(2, 5));
    }

    @Test
    public void canDivide(){
        assertEquals(3, calculator.divide(9, 3), 0.00);
    }

}
