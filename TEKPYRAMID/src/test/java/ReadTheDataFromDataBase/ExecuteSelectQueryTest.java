package ReadTheDataFromDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteSelectQueryTest {

	public static void main(String[] args) throws SQLException {
		//Step1:load/register the database driver
		Driver driver=new Driver();//it is coming from com.mysql.jdbc(jar file)
		DriverManager.registerDriver(driver);//It is coming from java.sql package
		
		//Step2:connect to database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProjectDemo","root","Anand@123");//coming from java.sq
		System.out.println("=====Done=====");
		
		//Step3:create sql statement
		Statement stat = conn.createStatement();//it is coming from java.sql package
	
		//step4:execute select query And get result
		ResultSet resultset = stat.executeQuery("select * from employee");//use iterator
		while(resultset.next()){
	    System.out.println(resultset.getString(1)+"\t"+ resultset.getString(2)+"\t"+resultset.getString(3));
		}
		
		//step5:close the connection
		conn.close();

	}

}
