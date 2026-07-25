package org.example;
import collection.MySQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateData {
    public static void updateInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the id of record to be updated: ");
        int record = sc.nextInt();
        System.out.print("Enter updated id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter updated name: ");
        String name = sc.nextLine();
        System.out.print("Enter updated marks: ");
        double marks = sc.nextDouble();


        try{
            Connection con = MySQLConnection.getConnection();
            String sql = "UPDATE student SET id = ?, name = ?, marks = ? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, marks);
            ps.setInt(4, record);

            int rows = ps.executeUpdate();
            if(rows>0){
                System.out.println("Students updated successfully");
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }

}
