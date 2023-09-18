
import java.sql.*;
public class Jdbc_Transaction {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//optional
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","Yach@8604");
			c.setAutoCommit(false);
			Statement st=c.createStatement();
			st.executeUpdate("update emp_info set salary=60000 where eid='e103'");
			int x=st.executeUpdate("update emp_info set age=20 where eid='e108'");
			if(x!=0) {
				c.commit();
			}else {
				c.rollback();
			}
			ResultSet rs=st.executeQuery("select * from emp_info where eid='e103'");
			if(rs.next()) {
				String n=rs.getString("name");
				String e=rs.getString("eid");
				int s=rs.getInt("salary");
				int a=rs.getInt("age");
				System.out.println("Name: "+n);
				System.out.println("Eid: "+e);
				System.out.println("Salary: "+s);
				System.out.println("Age: "+a);
			}else {
				System.out.println("No Record Found!");
			}
			
			c.close();
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
	}
}