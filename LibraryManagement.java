import java.io.*;
import java.util.*;
public class LibraryManagement 
{
    private List<Book> books = new ArrayList<>();
    private final String FILE_NAME = "library.txt";

    public LibraryManagement() 
    {
        loadFromFile();
    }
    public void addBook(int id,String title,String author,int quantity) 
    {
        books.add(new Book(id, title, author, quantity));
        System.out.println("Book added successfully");
    }
    public void displayBooks()
    {
        if(books.isEmpty())
        {
            System.out.println("No books available");
        }
        else 
        {
            for (Book b : books) 
            {
                System.out.println(b);
            }
        }
    }
    public Book searchBookById(int id) 
    {
        for (Book b : books) 
        {
            if (b.getId() == id) 
            {
                return b;
            }
        }
        return null;
    }
    public Book searchBookByTitle(String title) 
    {
        for (Book b : books) 
        {
            if (b.getTitle().equalsIgnoreCase(title)) 
            {
                return b;
            }
        }
        return null;
    }

    public void issueBook(int id) 
    {
        Book book = searchBookById(id);
        if (book!= null) 
        {
            book.issueBook();
        }
        else 
        {
            System.out.println("Book not found");
        }
    }
    public void returnBook(int id) 
    {
        Book book = searchBookById(id);
        if (book!= null) 
        {
            book.returnBook();
        } 
        else 
        {
            System.out.println("Book not found");
        }
    }
    public void saveToFile() 
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) 
        {
            oos.writeObject(books);
            System.out.println("Library data saved successfully");
        } 
        catch (IOException e) 
        {
            System.err.println("Error saving library data: " + e.getMessage());
        }
    }

    private void loadFromFile() 
    {
        File file = new File(FILE_NAME);
        if (file.exists()) return;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) 
        {
            books = (List<Book>) ois.readObject();
        }
        catch (IOException | ClassNotFoundException e) 
        {
            System.err.println("Error loading data: " + e.getMessage());
        }
    }
}
