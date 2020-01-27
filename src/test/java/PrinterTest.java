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
    public void checkWillPrint(){
        assertEquals("Print Successful", printer.print(25, 2));
    }

    @Test
    public void checkWillNotPrint(){
        assertEquals("Print Failed", printer.print(25, 5));
    }

    @Test
    public void checkPaperLevel(){
        printer.print(25, 2);
        assertEquals(50, printer.getPaper());
    }

    @Test
    public void checkTonerLevel(){
        printer.print(25, 2);
        assertEquals(50, printer.getToner());
    }

}
