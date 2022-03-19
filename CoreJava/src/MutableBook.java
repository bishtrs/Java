import java.util.Date;

// mutable class	
public final class MutableBook { 
    private String bookName;
    private Date publishedDate;
      
    public MutableBook(String bookName, Date publishedDate) {
        this.bookName = bookName;
        this.publishedDate = publishedDate;
    }
            
    public String getBookName() {
        return this.bookName; 
    }
                    
    public Date getPublishedDate() {
        return this.publishedDate; 
    }
    
    public static void main(String[] args) {
        MutableBook book = new MutableBook("Lord of the Rings" , new Date(1997, 10, 01));
        System.out.println(book.getBookName());
        Date publishedDate = book.getPublishedDate();
        System.out.println("Actual published date " + publishedDate);
        publishedDate.setYear(2018);
        System.out.println("Modified published date " + book.getPublishedDate());
    }
}