package pl.sudoljola;

import java.sql.*;

/**
 * Created by RENT on 2017-05-13.
 */
public class MySQLService {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public MySQLService() {
        connect();


        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM customer");
            System.out.println(resultSet.getMetaData().getColumnCount());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/sakila?user=root");
            System.out.println("Połączyłem się");
        } catch (SQLException e) {
            connection = null;
            e.printStackTrace();
        }
    }
}
