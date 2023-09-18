import java.sql.*;
public class Jdbc_ResultSetMetaData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Yach@8604");
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select * from emp_info");
			ResultSetMetaData r=rs.getMetaData();
			System.out.println(r.getColumnCount());
			System.out.println(r.getColumnName(3));
			c.close();
		}catch (ClassNotFoundException | SQLException  e) {
			System.out.println(e);
		}
	}

}