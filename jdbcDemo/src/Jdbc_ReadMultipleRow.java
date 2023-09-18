import java.sql.*;
public class Jdbc_ReadMultipleRow {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Yach@8604");
			Statement st=c.createStatement();
			//ResultSet rs=st.executeQuery("select * from emp_info where salary>66000");
			//ResultSet rs=st.executeQuery("select * from emp_info");
			//ResultSet rs=st.executeQuery("select * from emp_info where name='Priya Patel'");
			ResultSet rs=st.executeQuery("select * from emp_info where name like '%Priya%'");
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