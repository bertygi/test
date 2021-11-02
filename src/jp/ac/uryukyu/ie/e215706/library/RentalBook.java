package jp.ac.uryukyu.ie.e215706.library;

public class RentalBook {
    public String title;
    public int barcode;

    public RentalBook(String _title, int _barcode){
        this.title = _title;
        this.barcode = _barcode;
    }
    
    public void printSummary(){
        System.out.println("title =" + this.title + ", barcode = " + this.barcode);
    }
}