
package com.PersistentObject;
import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        
        // Creating a connection, adjust the database name, user, and password accordingly
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost/pbo", "root", "");
        
        // Execute the MySQL query
        String query = "INSERT INTO person(name) VALUES('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        
        // Close the database connection
        con.close();
    }
}