import jp.ac.uryukyu.ie.e215706.library.*;

public class Main {
    public static void main(String[] args){
        RentalBook book1 = new RentalBook("何故ルートビアは美味いのか", 123);
        System.out.println(book1.title);
        book1.printSummary();

        RentalBook book2 = new RentalBook("ルートビア最高", 456);
        book2.printSummary();
    }
}
