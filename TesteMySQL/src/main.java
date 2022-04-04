import java.sql.SQLException;

public class main {

	public static void main(String[] args) throws SQLException {
		
		ManipulacaoMySQLServe mms = new ManipulacaoMySQLServe();
		
		//mms.ConexaoBD();
		
		ConnectionFactory.createConnectionToMySQL();

	}

}
