
import java.sql.*;
public class Jdbc_PreparedStatement_Insert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Yach@8604");
			PreparedStatement p=c.prepareStatement("insert into emp_info (eid,name,age,salary) values (?,?,?,?)");
			
			p.setString(1, "e104"); 
			p.setString(2, "JJ Gupta");
			p.setInt(3,45);
			p.setInt(4, 78000);
			p.executeUpdate();
			
			p.setString(1, "e105"); 
			p.setString(2, "Heera Lal");
			p.setInt(3,35);
			p.setInt(4, 98000);
			p.executeUpdate();
			
			p.setString(1, "e106"); 
			p.setString(2, "Panna Lal");
			p.setInt(3,75);
			p.setInt(4, 128000);
			p.executeUpdate();
			System.out.println("Success");
			c.close();
		}catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("Data Already Exist");
		}
		catch (ClassNotFoundException | SQLException  e) {
			System.out.println(e);
		}
	}

}