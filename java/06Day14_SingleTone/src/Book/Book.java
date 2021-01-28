package Book;

public class Book {
    String bookName;
    int bookPrice;
    double bookDiscountRate;
    public Book(){}
    public Book(String bookName, int bookPrice, double bookDiscountRate){
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookDiscountRate = bookDiscountRate;
    }
    public double getDiscountBookPrice(){
        return (double)bookPrice-(bookPrice*(bookDiscountRate/100));
    }

}
