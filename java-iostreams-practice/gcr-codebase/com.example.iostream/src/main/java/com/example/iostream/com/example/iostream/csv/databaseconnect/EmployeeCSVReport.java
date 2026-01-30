package com.example.iostream.com.example.iostream.csv.databaseconnect;

import java.io.*;
import java.sql.*;

public class EmployeeCSVReport {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company";
        String user = "root";
        String password = "root";

        String csvFile = "file/employee_report.csv";

        String query = "SELECT id, name, department, salary FROM employee";

        try (
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile))
        ) {

 
            writer.write("Employee ID,Name,Department,Salary");
            writer.newLine();

          
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String dept = rs.getString("department");
                double salary = rs.getDouble("salary");

                writer.write(id + "," + name + "," + dept + "," + salary);
                writer.newLine();
            }

            System.out.println("CSV Report Generated Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
