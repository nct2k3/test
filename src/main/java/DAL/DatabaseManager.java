package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseManager {
    private Connection connection;

    public DatabaseManager(String url, String user, String password){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, user, password);
            

            if (connection != null) {
                System.out.println("Connected");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("No Driver Found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed");
            e.printStackTrace();
        }
    }

	//thuc hien cac truy van lay du lieu
    public ResultSet executeQuery(String query) {
        try {
            if (connection != null) {

                PreparedStatement preparedStatement = connection.prepareStatement(query);

                ResultSet resultSet = preparedStatement.executeQuery();

                return resultSet;
            }
        } catch (SQLException e) {
            System.out.println("Query execution failed");
            e.printStackTrace();
        }
        return null;
    }
    
	//thuc hien cac tuy van them sua xoa
    public int executeNonQuery(String query) {
        try {
            if (connection != null) {
                PreparedStatement preparedStatement = connection.prepareStatement(query);

                int rowsAffected = preparedStatement.executeUpdate();

                preparedStatement.close();

                return rowsAffected;
            }
        } catch (SQLException e) {
            System.out.println("Non-query execution failed");
            e.printStackTrace();
        }
        return -1; //loi
    }
    
    public Connection getConnection() {
        return this.connection;
    }
}
