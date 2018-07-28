package narenPkg;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCPrg {

	public void connectToAndQueryDatabase(String username, String password) throws Exception{

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection(
	                         "jdbc:oracle:thin:@hostName:1521:EMP",
	                         "naren",
	                         "Test@123");
//jdbc:oracle:thin:@amrood:1521:EMP,"scott","tiger"
	   //"jdbc:oracle:thin:scott/tiger@amrood:1521:EMP";
	    	    
	    Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery("SELECT a, b, c FROM Table1");

	    while (rs.next()) {
	        int x = rs.getInt("a");
	        String s = rs.getString("b");
	        float f = rs.getFloat("c");
	    }
	}

}
