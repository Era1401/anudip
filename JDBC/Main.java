//Maven Project
//main->java->package:collection, package:org.example
//collection: MySQLConnection.java
//org.example: InsetData.java, Main.java
//pom.xml: mysql connector java dependency
package org.example;
import collection.MySQLConnection;
import java.sql.Connection;

public class Main {
    public static void main(String[] args){
        Connection con = MySQLConnection.getConnection();
        InsertData obj = new InsertData();
        obj.insertInfo();
    }
}
