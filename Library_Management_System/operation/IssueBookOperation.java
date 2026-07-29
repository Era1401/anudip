package operation;

import model.Issue;

import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class IssueBookOperation {
    Issue issue = new Issue();

    public void issueBook(Connection con, Scanner sc){
        System.out.print("Enter Issue ID: ");
        issue.setIssue_id(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Book ID: ");
        issue.setBook_id(sc.nextInt());
        System.out.print("Enter Member ID: ");
        issue.setMember_id(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Status: ");
        issue.setStatus(sc.nextLine());

        try {
            // Check Book Availability
            String checkBook = "SELECT quantity FROM books WHERE book_id=?";
            PreparedStatement ps1 = con.prepareStatement(checkBook);
            ps1.setInt(1, issue.getBook_id());

            ResultSet rs = ps1.executeQuery();

            if (!rs.next()) {
                System.out.println("Book not found.");
                return;
            }

            int quantity = rs.getInt("quantity");

            if (quantity <= 0) {
                System.out.println("Book is not available.");
                return;
            }
        }catch(Exception e){
                System.out.println(e);
            }




        try{
            String sql = "INSERT INTO issue_book VALUES(?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, issue.getIssue_id());
            ps.setInt(2, issue.getBook_id());
            ps.setInt(3, issue.getMember_id());
            ps.setObject(4, java.time.LocalDateTime.now());
            ps.setObject(5, null);
            ps.setString(6, issue.getStatus());


            int rows = ps.executeUpdate();

            if (rows > 0) {
                // Decrease Quantity
                String updateBook = "UPDATE books SET quantity = quantity - 1 WHERE book_id=?";
                PreparedStatement ps4 = con.prepareStatement(updateBook);
                ps4.setInt(1, issue.getBook_id());
                ps4.executeUpdate();

                System.out.println("Book Issued Successfully.");

            }

        }catch (Exception e) {
                System.out.println(e);
        }
    }

}
