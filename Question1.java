import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class Question1 {
    public static void main(String[] args) {
        final String DB_URL = "jdbc:mysql://localhost/himanshu";
        final String USER = "root";
        final String Pass = "1234";

        try(Connection conn = DriverManager.getConnection(DB_URL, USER, Pass);
         Statement stmt = conn.createStatement();)
        {
            String query1="create table employee(RollNo int,Name varchar(20), Age int(3))";
		    statement.executeUpdate(query1);
		    System.out.println("Table created :");
            String query2="insert into Student values(1,'ABHISHEK',18)";
		    String query3="insert into Student values(2,'MAYANK',19)";
		    String query4="insert into Student values(3,'VIKAS',20)";
		    statement.executeUpdate(query2);
		    statement.executeUpdate(query3);
		    statement.executeUpdate(query4);
            
		System.out.println("inserted a row");

        }
    
    }
}
