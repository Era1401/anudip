package operation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayOperation {
    public DisplayOperation() {
    }

    public void displayIssuedBook(Connection con){
        try{
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM issue_book";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                System.out.println("Issue ID: " + rs.getInt("issue_id"));
                System.out.println("Book ID: " + rs.getInt("book_id"));
                System.out.println("Member ID: " + rs.getInt("member_id"));
                System.out.println("Issued Date: " + rs.getObject("issue_date"));
                System.out.println("Return Date: " + rs.getObject("return_date"));
                System.out.println("Status: " + rs.getString("status"));
                System.out.println("---------------------------");


            }

        }catch(Exception e){
            System.out.println(e);
        }


    }

    public void displayAvailableBook(Connection con){

        try{
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM books WHERE quantity >= 1";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                System.out.println("Book ID: " + rs.getInt("book_id"));
                System.out.println("Book Name: " + rs.getString("book_name"));
                System.out.println("Book Author: " + rs.getString("author_name"));
                System.out.println("Quantity: " + rs.getObject("quantity"));
                System.out.println("-------------------------");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void displayReturnedBook(Connection con){
        try{
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM issue_book WHERE return_date IS NOT NULL";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                System.out.println("Issue ID: " + rs.getInt("issue_id"));
                System.out.println("Book ID: " + rs.getInt("book_id"));
                System.out.println("Member ID: " + rs.getInt("member_id"));
                System.out.println("Return date: " + rs.getObject("return_date"));
                System.out.println("-------------------------");
            }

        }catch(Exception e){
            System.out.println(e);
        }



    }
}
