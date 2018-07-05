

import java.sql.*;

public class JDBCdemo  {

	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false";
		String uname = "root";
		String password = "root";
		String query = "select sname from student1 where rollno = '2'";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,password);
		
		Statement st = con.createStatement();
        
		ResultSet rs = st.executeQuery(query);
        rs.next();
		
		String name = rs.getString("sname");
		
		System.out.print(name);
		st.close();
		con.close();
   
        
        
        
        
	}

}
