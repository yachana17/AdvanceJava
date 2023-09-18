import java.sql.*;
public class Jdbc_PreparedStatement_Delete {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Yach@8604");
			PreparedStatement p=c.prepareStatement("delete from emp_info where eid=?");
			p.setString(1, "e105");
			int x=p.executeUpdate();
			if(x!=0) {
				System.out.println("Success");
			}else {
				System.out.println("No record found");
			}
			
			c.close();
		}catch (ClassNotFoundException | SQLException  e) {
			System.out.println(e);
		}
	}
}