

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ManipulacaoMySQLServe {

	public void ConexaoBD() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/cadastrodealuno";

		try (Connection conn = DriverManager.getConnection(url, "root", "fael4190")) {
			System.out.println("conectou");
		}
	}
}
