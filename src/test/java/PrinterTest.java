import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 100);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void paperCheckWillPrint(){
        assertEquals("Print Successful", printer.Print(50));
    }

}
