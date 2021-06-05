package Airline_project;
import java.sql.*;

public class Conn {

	Connection c;
	Statement s;

	public Conn()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","AkAsH5432");
			s=c.createStatement();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
	}

}
