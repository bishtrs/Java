import java.util.Date;
        
// immutable class	
public final class ImmutableBook { 
    private String bookName;
    private Date publishedDate;
      
    public ImmutableBook(String bookName, Date publishedDate) {
        this.bookName = bookName;
        this.publishedDate = publishedDate;
    }
            
    public String getBookName() {
        return this.bookName; 
    }
                    
    public Date getPublishedDate() {
        return  new Date(publishedDate.getTime());
    }
    
    public static void main(String[] args) {
        ImmutableBook book = new ImmutableBook("Lord of the Rings" , new Date(1997, 10, 01));
        System.out.println(book.getBookName());
        Date publishedDate = book.getPublishedDate();
        System.out.println("Actual published date " + publishedDate);
        publishedDate.setYear(2018);
        System.out.println("Modified published date " + book.getPublishedDate());
    }
}
      