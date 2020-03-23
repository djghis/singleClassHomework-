public class Printer {

    private int sheets;
    private int toner;

    public Printer(int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }

    public int hasSheets() {
        return this.sheets;
    }


    public String print(int pages, int copies) {
        if (this.sheets >= pages * copies) {
            return String.valueOf(this.sheets -= pages * copies);
            return String.valueOf(this.toner -= pages * copies);
        } else {
            return "Not enough paper";
        }
    }

    public int hasToner() {
        return this.toner;
    }


}
