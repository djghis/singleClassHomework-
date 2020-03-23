public class Printer {

    private int sheets;

    public  Printer(int sheets){
        this.sheets = sheets;
    }

    public int hasSheets(){
        return this.sheets;
    }


    public int print(int pages, int copies) {
        return this.sheets -= pages * copies;
    }
}
