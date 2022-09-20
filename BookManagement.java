import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement implements Managable{

    List<Book> books;

    public BookManagement(){
        books = new ArrayList<>();
        //tao san 1 vai cuon sach:
        Book b1 = new Book("b001","Java", "Fahasa", 2015);
        Book b2 = new Book("b002","CSharp", "Kim Dong", 2015);
        Book b3 = new Book("b003","PHP", "NXB Tre", 2015);
        Book b4 = new Book("b004","JavaScript", "NXB Giao Duc", 2015);

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
    }

    public Book input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input Book ID: ");
        String bookID = scanner.next();
        System.out.println("Please input Book Title: ");
        String title = scanner.nextLine();
        System.out.println("Please input Book ID: ");
        String publisher = scanner.nextLine();
        System.out.println("Please input Book ID: ");
        int year = Integer.parseInt(scanner.next());

        Book newBook = new Book(bookID,title,publisher,year);

        return newBook;
    }

    @Override
    public void add() {
        //add tu ban phim:
        Book newBook = input();
        books.add(newBook);
    }

    public Book searchByID(String searchID){
        for(Book b : books){
            if(b.getBookID().equals(searchID))
                return b;
        }
        return null;
    }


    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input id to search: ");
        String searchID = scanner.next();

        Book searchBook = searchByID(searchID);

        if(searchBook != null)
            System.out.println(searchBook);
        else
            System.out.println("Book not found");

    }

    @Override
    public void update() {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Input id to update: ");
        String updateID = scanner.next();

        Book updateBook = searchByID(updateID);

        if(updateBook != null) {
            System.out.println("Please enter new title:  ");
            String newTitle = scanner.nextLine();
            updateBook.setTitle(newTitle);
            System.out.println(updateBook);
        }
        else
            System.out.println("Book not found");
    }

    @Override
    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input id to search: ");
        String searchID = scanner.next();

        Book searchBook = searchByID(searchID);

        if(searchBook != null)
            books.remove(searchBook);
        else
            System.out.println("Book not found");

    }

    @Override
    public void displayAll() {
        for(Book b : books){
            System.out.println(b);
        }
    }

    public void showMenu(){
        System.out.println("1. Add Book");
        System.out.println("2. Update Book");
        System.out.println("3. Search Book");
        System.out.println("4. Remove Book");
        System.out.println("5. Display All");
        System.out.println("0. exit");
        System.out.println("Enter option: ");
    }

    @Override
    public void menu() {
        String option = "";
        Scanner scanner = new Scanner (System.in);
        while (!option.equals("0")){
            showMenu();
            option = scanner.next();
            scanner.nextLine();
            switch (option) {
                case "1":
                    add();break;
                case "2":
                    update();break;
                case "3":
                    search();break;
                case "4":
                    remove();break;
                case "5":
                    displayAll();break;
                case "0":break;
                default:
                    System.out.println("The word entered is incorrect, please re-enter");
                    break;
            }
        }















    }
}
