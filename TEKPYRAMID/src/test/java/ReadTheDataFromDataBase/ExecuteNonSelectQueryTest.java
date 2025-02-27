package ReadTheDataFromDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteNonSelectQueryTest {

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
				
                int result = stat.executeUpdate("insert into employee values('suraj',8,'Delhi',10000);");
                int result1 = stat.executeUpdate("insert into employee values('pankaj',7,'surat',10000);");
				System.out.println(result+" "+result1);
				
				//step5:close the connection
				conn.close();


	}

}
