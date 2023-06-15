/*
Student Name: Alex Hulford
Student Number: 041066068
Course & Section #: 22S_CST8288_014
Declaration:
This is my own original work and is free from Plagiarism.
Modified by Alex Hulford, author George Kriger.
References: http://ramj2ee.blogspot.in/2013/08/data-access-object-design-pattern-or.html
*/

package dataaccesslayer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource {
	private Connection connection = null;
	
	public DataSource(){}
/*
 * Only use one connection for this application, prevent memory leaks.
 */
	public Connection createConnection(){
           
            Properties props = new Properties();

		try (InputStream in = Files.newInputStream(Paths.get("src/hulfordalexlab2/database.properties"));) {
			props.load(in);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	    String url = props.getProperty("jdbc.url");
	    String username = props.getProperty("jdbc.username");
	    String password = props.getProperty("jdbc.password");
		try {
			if(connection != null){
				System.out.println("Cannot create new connection, one exists already");
			}
			else{
				connection = DriverManager.getConnection(url, username, password);
			}
		}
		catch(SQLException ex){
                    ex.printStackTrace();
		}
		return connection;
	}
}