import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import connection.MySqlConnection;

import operation.*;


public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner in = new Scanner(System.in);
        System.out.println("Select an operation to run: ");
        System.out.println("1. Book operations ");
        System.out.println("2. Member operations ");
        System.out.println("3. Issue operations ");
        int choice = in.nextInt();
        in.nextLine();

        if(choice == 1){
            Connection con = MySqlConnection.getConnection();
            BookOperation bo = new BookOperation();
            Scanner sc = new Scanner(System.in);
            System.out.println("Book operations: ");
            System.out.println("1. Add Book ");
            System.out.println("2. Display Books ");
            System.out.println("3. Search Book ");
            System.out.println("4. Update Book ");
            System.out.println("5. Delete Book ");

            System.out.println("Enter operation no: ");
            int option = sc.nextInt();


            switch (option){
                case 1:
                    bo.addBooks(con, sc);
                    break;
                case 2:
                    bo.displayBooks(con, sc);
                    break;
                case 3:
                    bo.searchBook(con, sc);
                    break;
                case 4:
                    bo.updateBook(con, sc);
                    break;
                case 5:
                    bo.deleteBook(con, sc);
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }

            con.close();

        }else if(choice == 2){
            Connection con = MySqlConnection.getConnection();

            MemberOperation mo = new MemberOperation();
            Scanner scm = new Scanner(System.in);
            System.out.println("Member operations: ");
            System.out.println("1. Add Member ");
            System.out.println("2. Display Member ");
            System.out.println("3. Search Member ");
            System.out.println("4. Update Member ");
            System.out.println("5. Delete Member ");

            System.out.println("Enter operation no: ");
            int option = scm.nextInt();


            switch (option){
                case 1:
                    mo.addMember(con, scm);
                    break;
                case 2:
                    mo.displayMember(con);
                    break;
                case 3:
                    mo.searchMember(con, scm);
                    break;
                case 4:
                    mo.updateMember(con, scm);
                    break;
                case 5:
                    mo.deleteMember(con, scm);
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }

            con.close();

        }else if (choice == 3){
            Connection con = MySqlConnection.getConnection();

            IssueBookOperation io = new IssueBookOperation();
            DisplayOperation dobj = new DisplayOperation();
            ReturnBookOperation robj = new ReturnBookOperation();
            Scanner sci = new Scanner(System.in);
            System.out.println("Issue operations: ");
            System.out.println("1. Issue Book ");
            System.out.println("2. Display Issued Books ");
            System.out.println("3. Display Available Books ");
            System.out.println("4. Display Returned Books ");
            System.out.println("5. Return Books ");


            System.out.println("Enter operation no: ");
            int option = sci.nextInt();


            switch (option){
                case 1:
                    io.issueBook(con, sci);
                    break;
                case 2:
                    dobj.displayIssuedBook(con);
                    break;
                case 3:
                    dobj.displayAvailableBook(con);
                    break;
                case 4:
                    dobj.displayReturnedBook(con);
                    break;
                case 5:
                    robj.returnBook(con, sci);
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }

            con.close();



        }else{
            System.out.println("Please enter a valid option.");
        }
    }

}




