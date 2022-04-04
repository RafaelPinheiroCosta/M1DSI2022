import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static final String USERNAME = "root";
	private static final String PASSWORD = "fael4190";
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/cadastrodealuno";
	
	public static Connection createConnectionToMySQL() throws SQLException {
		
		try(Connection connection = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD)){
			System.out.println("Conectou");
			return connection;
		}		
	}
}
