package operation;

import model.Issue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ReturnBookOperation {

    public void returnBook(Connection con, Scanner sc){
        Issue issue = new Issue();
        System.out.println("Enter issue_id: ");
        int issue_id = sc.nextInt();

        try{
            String sql = "UPDATE issue_book SET return_date = CURRENT_TIMESTAMP WHERE issue_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, issue_id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                // Decrease Quantity
                String updateBook = "UPDATE books SET quantity = quantity + 1 WHERE book_id=?";
                PreparedStatement ps4 = con.prepareStatement(updateBook);
                ps4.setInt(1, issue.getBook_id());
                ps4.executeUpdate();

                System.out.println("Book Issued Successfully.");

            }
        }catch(Exception e){
            System.out.println(e);

        }





    }

}
