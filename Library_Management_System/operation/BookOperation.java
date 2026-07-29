package operation;
import model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class BookOperation {
    Book book = new Book();

    public BookOperation() {
    }

    public void addBooks(Connection con, Scanner sc){

        System.out.print("Enter Book ID: ");
        book.setBook_id(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Book Name: ");
        book.setBook_name(sc.nextLine());
        System.out.print("Enter Author Name: ");
        book.setAuthor_name(sc.nextLine());
        System.out.print("Enter Publisher Name: ");
        book.setPublisher(sc.nextLine());
        System.out.print("Enter Price: ");
        book.setPrice(sc.nextDouble());
        System.out.print("Enter Quantity: ");
        book.setQuantity(sc.nextInt());

        try{
            String sql = "INSERT INTO books VALUES(?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, book.getBook_id());
            ps.setString(2, book.getBook_name());
            ps.setString(3, book.getAuthor_name());
            ps.setString(4, book.getPublisher());
            ps.setDouble(5, book.getPrice());
            ps.setInt(6, book.getQuantity());

            int rows = ps.executeUpdate();
            if(rows>0){
                System.out.println("Inserted book data.");
            }


        }catch(Exception e){
            System.out.println(e);
        }


    }

    public void displayBooks(Connection con, Scanner sc){

        try{
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM books";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                System.out.println("Book ID: " + rs.getInt("book_id"));
                System.out.println("Book Name: " + rs.getString("book_name"));
                System.out.println("Author Name: " + rs.getString("author_name"));
                System.out.println("Publisher: " + rs.getString("publisher"));
                System.out.println("Price: " + rs.getDouble("price"));
                System.out.println("Quantity: " + rs.getInt("quantity"));
                System.out.println("---------------------------");

            }

        }catch(Exception e){
            System.out.println(e);
        }

    }

    public void searchBook(Connection con, Scanner sc){
        System.out.print("Enter Book ID to search: ");
        int search_id = sc.nextInt();
        sc.nextLine();

        try{
            String sql = "SELECT * FROM books WHERE book_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, search_id);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                System.out.println("Book ID: " + rs.getInt("book_id"));
                System.out.println("Book Name: " + rs.getString("book_name"));
                System.out.println("Author Name: " + rs.getString("author_name"));
                System.out.println("Publisher: " + rs.getString("publisher"));
                System.out.println("Price: " + rs.getDouble("price"));
                System.out.println("Quantity: " + rs.getInt("quantity"));
            }

        }catch(Exception e){
            System.out.println(e);
        }


    }

    public void updateBook(Connection con, Scanner sc){
        System.out.print("Enter Book ID to update: ");
        int update_id = sc.nextInt();

        System.out.print("Enter Book ID: ");
        book.setBook_id(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Book Name: ");
        book.setBook_name(sc.nextLine());
        System.out.print("Enter Author Name: ");
        book.setAuthor_name(sc.nextLine());
        System.out.print("Enter Publisher Name: ");
        book.setPublisher(sc.nextLine());
        System.out.print("Enter Price: ");
        book.setPrice(sc.nextDouble());
        System.out.print("Enter Quantity: ");
        book.setQuantity(sc.nextInt());

        try{
            String sql = "UPDATE books SET book_id = ?, book_name = ?, author_name = ?, publisher = ?, price = ?, quantity = ? WHERE book_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, book.getBook_id());
            ps.setString(2, book.getBook_name());
            ps.setString(3, book.getAuthor_name());
            ps.setString(4, book.getPublisher());
            ps.setDouble(5, book.getPrice());
            ps.setInt(6, book.getQuantity());
            ps.setInt(7, update_id);

            int rows = ps.executeUpdate();
            if(rows>0){
                System.out.println("Book data updated.");
            }


        }catch(Exception e){
            System.out.println(e);
        }

    }

    public void deleteBook(Connection con, Scanner sc){
        System.out.print("Enter Book ID to delete: ");
        int delete_id = sc.nextInt();
        try{
            String sql = "DELETE FROM books WHERE book_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, delete_id);

            int rows = ps.executeUpdate();
            if(rows>0){
                System.out.println("Book data deleted.");
            }


        }catch(Exception e){
            System.out.println(e);
        }

    }

}
