import java.sql.*;

public class Jdbc_Update {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Yach@8604");
			Statement st=c.createStatement();
			int x =st.executeUpdate("update emp_info set name='kamlavti', age=25 where eid='e105'");
			if(x!=0) {
			System.out.println("Success");
			}
			else{
				System.out.println(" no record found");
			}
			c.close();
		}catch (ClassNotFoundException | SQLException  e) {
			System.out.println(e);
		}
	}

}
