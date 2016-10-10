package drexel.dui.dao;

import java.sql.DriverManager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;


import drexel.dui.exception.ChefOracleException;



/*public class DBUtil {
	static Connection connection;
		public static Connection obtainConnection() throws ChefOracleException
		{
		System.out.println("-------- PostgreSQL "
				+ "JDBC Connection Testing ------------");

		try {

			Class.forName("org.postgresql.Driver");//its in the slides DRIVER

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your PostgreSQL JDBC Driver? "
					+ "Include in your library path!");
			e.printStackTrace();
			

		}
		System.out.println("PostgreSQL JDBC Driver Registered!");

		 connection = null;

		try {

			connection = DriverManager.getConnection(
					"jdbc:postgresql://127.0.0.1:5432/testdb", "mkyong",
					"123456");// URL 

		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();


		}
		return connection;
		
	}

		public static void releaseConnection() {
			// TODO Auto-generated method stub
			
			try 
			{
				connection.close();// CLose connection
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
				if (connection != null) {
					System.out.println("You made it, take control your database now!");
				} else {
					System.out.println("Failed to make connection!");
				}
			}
			
		}
		
		
		
	}*/





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 
 * An implementation of some basic database utilities.
 * 
 * @author Julia Stoyanovich (stoyanovich@drexel.edu) 
 * 
 */
public class DBUtil {

  /**
   * Open a database connection.
   * 
   * @param user
   * @param pass
   * @param dbSID
   * @param host
   * @return
   * @throws SQLException
   * @throws ClassNotFoundException
   */
  public static Connection openDBConnection(String user, String pass,
      String dbSID, String host, int port) throws SQLException,
      ClassNotFoundException {
	  
    String driver = "org.postgresql.Driver";
    Class.forName(driver);
    
    String url = "jdbc:postgresql://" + host + "/" + dbSID;
    String username = user;
    String password = pass;
   
    return DriverManager.getConnection(url, username, password);
  }
  
  //author pranati
  
  public static Connection openDBConnectionSQL() throws SQLException {
/*	  Properties props = new Properties();
	   FileInputStream in;
	try {
		in = new FileInputStream("/ChefOracle/PgBundle.properties");
		props.load(in);
		in.close();
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
*/	 
	String url ="jdbc:mysql://localhost:3306/";
	String dbName ="cheforacle";
    String driver ="com.mysql.jdbc.Driver";
    String userName ="root";
    String password ="root123";
	    
	/* String url = props.getProperty("url");//"jdbc:mysql://localhost:3306/";
	 String dbName =props.getProperty("dbName"); //"form";
     String driver =props.getProperty("driver"); //"com.mysql.jdbc.Driver";
     String userName = props.getProperty("userName");//"root";
     String password = props.getProperty("password");//"root123";*/
	  
	 
      try {
		Class.forName(driver).newInstance();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	    return DriverManager.getConnection(url + dbName, userName, password);
	  }

  /**
   * Test the connection.
   * @param conn
   * @return current date and time if the connection is open.  Otherwise an exception will be thrown.
   * @throws SQLException
   */
  public static String testConnection(Connection conn) throws SQLException {
    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery("select now() as res");
    String res = "";
    while (rs.next()) {
      res = "Servus: " + rs.getString("res");
    }
    rs.close();
    st.close();
    return res;
  }
  

  /**
   * Close the database connection.
   * @param conn
   * @throws SQLException if connection is already closed.
   */
  public static void closeDBConnection(Connection conn) {
    try {
		conn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }

  /**
   * Get an integer that is returned as a result of a query.
   * @param conn
   * @param query
   * @return result
   * @throws SQLException
   */
  public static int getIntFromDB(Connection conn, String query)
      throws SQLException {

    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery(query);
    int ret = Integer.MIN_VALUE;
    if (rs.next()) {
      ret = rs.getInt(1);
    }
    rs.close();
    st.close();
    return ret;
  }

  /**
   * Execute an update or a delete query.
   * @param conn
   * @param query
   * @throws SQLException
   */
  public static void executeUpdate(Connection conn, String query)
      throws SQLException {

    Statement st = conn.createStatement();
    st.executeUpdate(query);
    st.close();
  }

  /**
   * Execute an update or a delete query using a prepared statement.
   * @param conn
   * @param query
   * @throws SQLException
   */
  public static void executeUpdate(Connection conn, String query, String[] bindValues )
      throws SQLException {

    PreparedStatement pst = conn.prepareStatement(query);
    
    for (int i=0; i<bindValues.length; i++) {
    	String val = bindValues[i];
      pst.setString(1, val);
      pst.executeUpdate();
    }
    pst.close();
  }

}
 