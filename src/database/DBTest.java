package database;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.*;
public class DBTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String URL ="jdbc:mysql://localhost:3306/ecommerce";
		String Username = "root";
		String Password ="root";
		
		DBConnection dbobj =new DBConnection(URL,Username,Password);
		Statement  statement= dbobj.getConnection().createStatement();
		CallableStatement statement1 = dbobj.getConnection().prepareCall("{call add_product(?,?)}");
		
		
		
		//statement.executeUpdate("insert into eproduct (name,price,date_added) values ('Mobile',9000.00,now())");		
		//statement.executeUpdate("create database mydatabase");
		//statement.executeUpdate("drop database mydatabase");
		//statement.executeUpdate("update eproduct set ID=4 where name='Mobile'");
		
		statement1.setString(1, "Washing Machine");
		statement1.setInt(2 ,5000);
		statement1.executeUpdate();
		
		ResultSet result = statement.executeQuery("select * from eproduct");
		while(result.next()) {
			//System.out.println("ID :-"+result.getDouble(ID));
			System.out.println("Name :-"+result.getString("name"));
		}
		
		dbobj.closeConnection();

	}
	

}
