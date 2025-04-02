import java.io.Serializable;
public class Book implements Serializable 
{
    @SuppressWarnings("FieldMayBeFinal")
    private int id;
    @SuppressWarnings("FieldMayBeFinal")
    private String title;
    @SuppressWarnings("FieldMayBeFinal")
    private String author;
    private int quantity;

    public Book(int id, String title, String author, int quantity) 
    {
        this.id = id;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }
    public int getId() 
    {
        return id;
    }
    public String getTitle() 
    {
        return title;
    }
    public String getAuthor() 
    {
        return author;
    }
    public int getQuantity() 
    {
        return quantity;
    }
    public void issueBook()
    {
        if(quantity > 0)
        {
            quantity--;
            System.out.println("Book issued Successfully !");
        }
        else
        {
            System.out.println("Sorry, the book is out of stock.");
        }
    }
    public void returnBook()
    {
        quantity++;
        System.out.println("Book returned successfully!");
    }
    @Override
    public String toString() 
    {
        return "id=" + id + ", title='" + title + '\'' + ", author='" + author + '\'' + ", quantity=" + quantity;
    }
}