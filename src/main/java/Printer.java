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

    public String Print(int pages, int copies) {
        int total = (pages * copies);
        if (total <= this.paper) {
            this.paper -= pages;
            return "Print Successful";
        } else {
            return "Not Enough Paper";
        }
    }
}
