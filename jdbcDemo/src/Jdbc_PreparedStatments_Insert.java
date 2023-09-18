import java.sql.*;
public class Jdbc_PreparedStatments_Insert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Yach@8604");
			Statement st =c.createStatement();
			PreparedStatement p=c.prepareStatement("insert into emp_info (eid,name,age,salary) values ('?','?',?,?)");
			p.setString(1,"e104");
			p.setString(2,"jj Gupta");
			p.setInt(3,45);
			p.setInt(4,98000);
			
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
