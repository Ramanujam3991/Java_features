package com.B.week6.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.B.week6.model.Student;

public class StudentDao {

	/**
	 * Table-Student
	 * ID-int
	 * fistname-string
	 * lastname-string
	 * grade-string
	 * 
	 * */
	
	public int registerStudent(Student st) throws ClassNotFoundException{
		//Create sql statement
		String INSERT_USERS_SQL = ("INSERT INTO student"
				+ "(id,first_name,last_name, grade) VALUES"
				+ "(?,?,?,?)");
		int result = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/week6","root","root");
				
				PreparedStatement ps= con.prepareStatement(INSERT_USERS_SQL);
				
				ps.setInt(1, 102);
				ps.setString(2, st.getFirstName());
				ps.setString(3, st.getLastName());
				ps.setString(4, st.getGrade());
				
				System.out.println(ps);
				result = ps.executeUpdate();
				}
				catch (SQLException e) {
					// TODO: handle exception
					printSQLException(e);
				}
		return result;
	}
	
	public static void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                    e.printStackTrace(System.err);
                    System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                    System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                    System.err.println("Message: " + e.getMessage());
                    Throwable t = ex.getCause();
                    while (t != null) {
                        System.out.println("Cause: " + t);
                        t = t.getCause();
                    }
            }
        }
    }
}
