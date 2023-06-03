//package demo;
//
//import dao.BookDAO;
//import dto.BookDTO;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class BookPresentation {
//    static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        System.out.println("Select mode of operation");
//        System.out.println("1. Add new books");
//        System.out.println("2. Delete books");
//        System.out.println("3. View books");
//        int choice =sc.nextInt();
//        switch (choice){
//            case 1:addBooks();
//            break;
//            case 2:deleteBooks();
//            break;
//            case 3:viewBooks();
//            break;
//            default:
//                System.out.println("Invalid choice");
//        }
//    }
//
//    private static void viewBooks() {
//
//        BookDAO ba = new BookDAO();
//        System.out.println("Id\t\tName\t\t\t\tPrice");
//        System.out.println("-------------------------------------------------");
//        ArrayList<BookDTO> list= ba.viewBooks();
//        for (BookDTO b:list) {
//            System.out.println(b);
//        }
//
//    }




























//    private static void viewBooks() {
//
//        BookDAO ba = new BookDAO();
//        ResultSet rs =null;
//         rs = ba.viewBooks();
//
//        System.out.println("Id\t\tName\t\t\t\tPrice");
//        System.out.println("-------------------------------------------------");
//
//            try {
//                while (rs.next()){
//                    System.out.println(rs.getInt(1)+"\t\t\t"
//                    +rs.getString(2)+"\t\t\t\t"
//                    +rs.getDouble(3));
//                }
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            }
//
//        }



























//    private static void deleteBooks() {
//        System.out.println("Enter id");
//        int id = sc.nextInt();
//        BookDTO d1= new BookDTO();
//        d1.setBookId(id);
//        BookDAO d2 = new BookDAO();
//        int count =d2.deleteBook(d1);
//        System.out.println(count+" Book deleted successfully");
//
//    }
//
//    private static void addBooks() {
//        System.out.println("Enter book id");
//        int id = sc.nextInt();
//        System.out.println("Enter book name");
//        String name=sc.next();
//        System.out.println("Enter book price");
//        double price =sc.nextDouble();
//        //add data into dto object
//        BookDTO d1 = new BookDTO();
//         d1.setBookId(id);
//        d1.setBookName(name);
//        d1.setBookPrice(price);
//        //call method from dao class
//        BookDAO b1 = new BookDAO();
//        int count=b1.insertBooks(d1);
//        System.out.println(count+" Book inserted successfully");
//
//    }
//}
