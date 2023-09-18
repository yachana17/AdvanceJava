
import java.sql.*;
public class Jdbc_PreparedStatement_Update {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Yach@8604");
			PreparedStatement p=c.prepareStatement("update emp_info set name=?,age=? where eid=?");
			p.setString(1, "Afsana Khan");
			p.setInt(2, 45);
			p.setString(3, "e102");
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