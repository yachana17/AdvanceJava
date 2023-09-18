import java.sql.*;
public class Jdbc_Oracle_Insert {
	public static void main(String[]args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "textdata", "8604");
			Statement st=c.createStatement();
			st.executeUpdate("insert into emp_info (eid,name,age,salary) values ('e105','Jitesh Patel',26,65000)");
			System.out.println("Success");
			c.close();
		}catch (ClassNotFoundException | SQLException  e) {
			System.out.println(e);
		}
	}

}
