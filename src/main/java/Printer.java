public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }


    public Object getPaper() {
        return this.paper;
    }

    public Object getToner() {
        return this.toner;
    }
}
