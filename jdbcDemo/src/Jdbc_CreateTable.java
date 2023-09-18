import java.sql.*;

public class Jdbc_CreateTable{
	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Yach@8604");
		Statement st=c.createStatement();
		st.executeUpdate("create table emp_info (eid varchar(50) NOT NULL,name varchar(100) NOT NULL,salary int NOT NULL,age int NOT NULL, PRIMARY KEY (eid))");
		st.executeUpdate("insert into emp_info (eid,name,age,salary) values ('e101','Jitesh Patel',26,65000)");
		st.executeUpdate("insert into emp_info (eid,name,age,salary) values ('e102','Priya Patel',23,75000)");
		System.out.println("Success");
		c.close();
	}catch (ClassNotFoundException | SQLException  e) {
		System.out.println(e);
	}
	}

}
