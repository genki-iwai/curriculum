package example5_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example5_2 {
	private static final String POSTGRE_DRIVER = "org.postgresql.Driver";
	private static final String JDBC_CONNECTION = "jdbc:postgresql://locaohost:5432/lesson_bd";
	private static final String USER = "postgres";
	private static final String PASS = "postgres";

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;

		try{
			Class.forName(POSTGRE_DRIVER);
			connection = DriverManager.getConnection(JDBC_CONNECTION,USER,PASS);
			statement = connection.createStatement();

			String SQL = "INSERT INTO TB_SHOHIN( SHOHIN_ID, SHOHIN_NAME, TANKA)"
					+ " VALUES('021', 'SHOHIN021', '2100')";
			statement.executeUpdate(SQL);

		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try{

				if (statement != null) {
					statement.close();
				}
				if (connection != null) {
					connection.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
