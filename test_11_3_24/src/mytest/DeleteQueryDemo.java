package mytest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteQueryDemo {
 public static void main(String[] args) {
	
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 try {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exampledb","root","12345");
		Statement st = conn.createStatement();
		
		int a = st.executeUpdate("DELETE FROM student where id = 2"); 

		
		System.out.println("Done");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
}
}


// explain the purpose of join keyword in mysql queries provide an example 

// discuss the importance of foreign key  im database performance optimization . how can foreign key be created amd utilized effectivelu in mysql

// 8 explain the concept of inheritance in java. provide an exmple illustrating single and multiple inheritancd 

// 9)  implement a java class 'Employee' with attributes : 'name'(String),'age'(int),and 'salary'(dobule) . inlcude appropriate constructor and getter/setter methods.


// 10) discuss the java collection framework in detail . explain different types of collections available in java, their characteristics , and scenarios where each type is best suited for usage . additionally, draw a diagram illustrating the heirarchy of java collections framework, showing the relationship between diffrent interfaces and classes. 







//
