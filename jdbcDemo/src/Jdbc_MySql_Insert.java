import java.sql.*;
public class Jdbc_MySql_Insert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Yach@8604");
			Statement st=c.createStatement();
			st.executeUpdate("insert into emp_info (eid,name,age,salary) values ('e107','Jitesh Patel',26,65000)");
			System.out.println("Success");
			c.close();
		}catch (ClassNotFoundException | SQLException  e) {
			System.out.println(e);
		}
	}

}