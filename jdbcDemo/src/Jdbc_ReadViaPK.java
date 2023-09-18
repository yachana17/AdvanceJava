import java.sql.*;
public class Jdbc_ReadViaPK {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Yach@8604");
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select * from emp_info where eid='e101'");
			if(rs.next()) {
				//get data via column number
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
				System.out.println(rs.getInt(4));
				//or
				//get data via column name
				System.out.println(rs.getString("eid"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("salary"));
				System.out.println(rs.getInt("age"));
			}else {
				System.out.println("No record found");
			}
			c.close();
		}catch (ClassNotFoundException | SQLException  e) {
			System.out.println(e);
		}
	}

}