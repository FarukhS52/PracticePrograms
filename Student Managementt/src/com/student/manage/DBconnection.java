package com.student.manage;
import java.sql.*;

public class DBconnection {
    Connection connection;
    public  Connection createConnection()
    {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String URL = "jdbc:mysql://localhost:3306/student_management_app";
            String userID = "root";
            String Password = "Farookh@12345";

            connection = DriverManager.getConnection(URL,userID,Password);


        } catch (Exception e) {

            e.printStackTrace();
        }
        return connection;

    }

}
