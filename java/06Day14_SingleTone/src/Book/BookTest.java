package Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookTest {
    static List<Book> bookList = new ArrayList<Book>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        bookList.add(new Book("SQL Plus", 50000, 5));
        bookList.add(new Book("Java 2.0", 40000, 3));
        bookList.add(new Book("JSP Servlet", 60000, 6));

        System.out.println("책이름\t\t가격\t\t할인율\t할인후금액");
        System.out.println("-----------------------------------------------------");
        for(int i=0; i<bookList.size();i++){
            System.out.println(bookList.get(i).bookName + "\t" + bookList.get(i).bookPrice + "원\t\t"
                + bookList.get(i).bookDiscountRate + "%\t" + bookList.get(i).getDiscountBookPrice() + "원");
        scan.close();
        }
    }
}
