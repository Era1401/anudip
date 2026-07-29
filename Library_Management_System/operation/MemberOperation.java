package operation;

import model.Member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MemberOperation {
    Member member = new Member();

    public MemberOperation(){

    }

    public void addMember(Connection con, Scanner sc){
        System.out.print("Enter Member ID: ");
        member.setMember_id(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Member Name: ");
        member.setMember_name(sc.nextLine());
        System.out.print("Enter Member Email: ");
        member.setEmail(sc.nextLine());
        System.out.print("Enter Member Mobile No.: ");
        member.setMobile(sc.nextLine());
        System.out.print("Enter Address: ");
        member.setAddress(sc.nextLine());


        try{
            String sql = "INSERT INTO members VALUES(?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, member.getMember_id());
            ps.setString(2, member.getMember_name());
            ps.setString(3, member.getEmail());
            ps.setString(4, member.getMobile());
            ps.setString(5, member.getAddress());

            int rows = ps.executeUpdate();
            if(rows>0){
                System.out.println("Inserted Member data.");
            }


        }catch(Exception e){
            System.out.println(e);
        }



    }

    public void displayMember(Connection con){

        try{
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM members";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                System.out.println("Member ID: " + rs.getInt("member_id"));
                System.out.println("Member Name: " + rs.getString("member_name"));
                System.out.println("Member Email: " + rs.getString("email"));
                System.out.println("Member Phone No.: " + rs.getString("mobile"));
                System.out.println("Member Address: " + rs.getString("address"));
                System.out.println("---------------------------");


            }

        }catch(Exception e){
            System.out.println(e);
        }

    }

    public void searchMember(Connection con, Scanner sc){
        System.out.print("Enter Member ID to search: ");
        int search_id = sc.nextInt();
        try{
            String sql = "SELECT * FROM members WHERE member_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, search_id);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                System.out.println("Member ID: " + rs.getInt("member_id"));
                System.out.println("Member Name: " + rs.getString("member_name"));
                System.out.println("Member Email: " + rs.getString("email"));
                System.out.println("Member Phone: " + rs.getString("mobile"));
                System.out.println("Member Address: " + rs.getString("address"));
            }

        }catch(Exception e){
            System.out.println(e);
        }

    }

    public void updateMember(Connection con, Scanner sc){
        System.out.print("Enter Member ID to update: ");
        int update_id = sc.nextInt();

        System.out.print("Enter Member ID: ");
        member.setMember_id(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Member Name: ");
        member.setMember_name(sc.nextLine());
        System.out.print("Enter Member Email: ");
        member.setEmail(sc.nextLine());
        System.out.print("Enter Member Phone: ");
        member.setMobile(sc.nextLine());
        System.out.print("Enter Member Address: ");
        member.setAddress(sc.nextLine());


        try{
            String sql = "UPDATE members SET member_id = ?, member_name = ?, email = ?, mobile = ?, address = ? WHERE member_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, member.getMember_id());
            ps.setString(2, member.getMember_name());
            ps.setString(3, member.getEmail());
            ps.setString(4, member.getMobile());
            ps.setString(5, member.getAddress());
            ps.setInt(6, update_id);

            int rows = ps.executeUpdate();
            if(rows>0){
                System.out.println("Member data updated.");
            }


        }catch(Exception e){
            System.out.println(e);
        }


    }

    public void deleteMember(Connection con, Scanner sc){
        System.out.print("Enter Member ID to delete: ");
        int delete_id = sc.nextInt();
        try{
            String sql = "DELETE FROM members WHERE member_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, delete_id);

            int rows = ps.executeUpdate();
            if(rows>0){
                System.out.println("Member data deleted.");
            }


        }catch(Exception e){
            System.out.println(e);
        }


    }
}
