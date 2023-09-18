import java.sql.*;
public class Jdbc_Delete {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Yach@8604");
			Statement st=c.createStatement();
			//int x =st.executeUpdate("delete from emp_info where eid='e105'");
			//int x=st.executeUpdate("delete from emp_info");
			/*int x=st.executeUpdate("drop testdb emp_info");
			if(x!=0) {
			System.out.println("Success");
			}
			else{
				System.out.println(" no record found");
			}
			Statement st=c.createStatement();*/
			//delete row
			//int x=st.executeUpdate("delete from emp_info where eid='e105'");
			
			//delete all rows
			//int x=st.executeUpdate("delete from emp_info");
			
			//delete table
			st.executeUpdate("drop table emp_info");
			System.out.println("Success");
			
			c.close();
		}catch (ClassNotFoundException | SQLException  e) {
			System.out.println(e);
		}
	}

}
