import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    public static void showMenu() {
        System.out.println("1. Book Management");
        System.out.println("2. Student Management");
        System.out.println("3. Borrow Management");
        System.out.println("0. exit");
        System.out.println("Enter option: ");
    }
    public static void menu() {

        Managable bookManagement = new BookManagement();
        Managable studentManagement = new StudentManagement();
        Managable borrowManagement = new BorrowManagent();

        String option = "";
        Scanner scanner = new Scanner(System.in);
        while (!option.equals("0")) {
            showMenu();
            option = scanner.next();
            scanner.nextLine();
            switch (option) {
                case "1":
                    bookManagement.menu();
                    break;
                case "2":
                    studentManagement.menu();
                    break;
                case "3":
                    borrowManagement.menu();
                    break;

                case "0":
                    System.exit(0);
                default:
                    System.out.println("The word entered is incorrect, please re-enter");
                    break;
            }
        }
    }
}