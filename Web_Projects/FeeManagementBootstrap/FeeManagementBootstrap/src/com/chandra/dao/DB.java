package com.chandra.dao;
import java.sql.*;
public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
		/*Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");*/
		  // Read RDS connection information from the environment
		/*Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://aws-mysql.cpo3smibuqql.us-east-2.rds.amazonaws.com:3306/online","admin","chandra123");*/
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3307/online","root","root");
	}catch(Exception ex){System.out.println(ex);}
	return con;
}
}
