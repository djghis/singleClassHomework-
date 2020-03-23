public class Printer {

    private int sheets;

    public Printer(int sheets) {
        this.sheets = sheets;
    }

    public int hasSheets() {
        return this.sheets;
    }


    public String print(int pages, int copies) {
        if (this.sheets >= pages * copies) {
            return String.valueOf(this.sheets -= pages * copies);
        } else {
            return "Not enough paper";
        }
    }
}
