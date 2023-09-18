import java.sql.*;
public class Jdbc_PreparedStatement_ReadMultipleRow {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Yach@8604");
			PreparedStatement p=c.prepareStatement("select * from emp_info");
			ResultSet rs=p.executeQuery();
			int x=0;
			while(rs.next()) {
				System.out.println(rs.getString("eid"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("salary"));
				System.out.println(rs.getInt("age"));
				x++;
			}
			if(x==0) {
				System.out.println("No record Found");
			}
			c.close();
		}catch (ClassNotFoundException | SQLException  e) {
			System.out.println(e);
		}
	}

}