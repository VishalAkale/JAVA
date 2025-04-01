import java.util.*;
public class Main 
{
    @SuppressWarnings("UnnecessaryContinue")
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LibraryManagement manager = new LibraryManagement();

        while (true) 
        {
            System.out.println("\n1. Add Book");
            System.out.println("\n2. Viee Books");
            System.out.println("\n3. Search Book by Id");
            System.out.println("\n4. Search Book by Title");
            System.out.println("\n5. Issue Book");
            System.out.println("\n6. Return Book");
            System.out.println("\n7. Save & Exit");
            System.out.println("Enter your choice: ");

            try 
            {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) 
                {
                    case 1 -> {
                        System.out.println("Enter Book ID: ");
                        int id=Integer.parseInt(sc.nextLine());
                        System.out.println("Enter Book Title: ");
                        String title = sc.nextLine();
                        System.out.println("Enter Book Author: ");
                        String author = sc.nextLine();
                        System.out.println("Enter Quantity: ");
                        int quantity = Integer.parseInt(sc.nextLine());
                        manager.addBook(id, title, author, quantity);
                    }
                    case 2 -> manager.displayBooks();
                    
                    case 3 -> {
                        System.out.println("Enter Book ID: ");
                        int searchId = Integer.parseInt(sc.nextLine());
                        Book foundById= manager.searchBookById(searchId);
                        System.out.println(foundById != null ? foundById : "Book not found");
                    }

                    case 4 -> {
                        System.out.println("Enter Book Title: ");
                        String searchTitle = sc.nextLine();
                        Book foundByTitle=manager.searchBookByTitle(searchTitle);
                        System.out.println(foundByTitle != null ? foundByTitle : "Book not found");
                    }

                    case 5 -> {
                        System.out.println("Enter Book ID to issue: ");
                        int issueId = Integer.parseInt(sc.nextLine());
                        manager.issueBook(issueId);
                    }

                    case 6 -> {
                        System.out.println("Enter Book ID to return: ");
                        int returnId = Integer.parseInt(sc.nextLine());
                        manager.returnBook(returnId);
                    }

                    case 7 -> {
                        manager.saveToFile();
                        System.out.println("Exiting....");
                        sc.close();
                        return;
                    }
                    
                    default -> System.out.println("Invalid choice! Please try again.");

                }
            } 
            
            catch (NumberFormatException e) 
            {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }

        }
    }
}
