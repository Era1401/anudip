package org.example;
import collection.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertData {
    public static void insertInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the marks: ");
        double marks = sc.nextDouble();

        try{
            Connection con = MySQLConnection.getConnection();
            String sql = "INSERT INTO student VALUES(?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setDouble(3, marks);

            int rows = pst.executeUpdate();
            if(rows>0){
                System.out.println("Students updated successfully");
            }

        }catch(Exception e){
            System.out.println(e);

        }



    }

}
