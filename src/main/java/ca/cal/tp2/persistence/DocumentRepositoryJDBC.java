package tp1.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DocumentRepositoryJDBC {
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:mem:tp2samuel;DB_CLOSE_DELAY=-1";
    static final String USER = "sa";
    static final String PASS = "";
    static Connection conn;

    static {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();

            String sql = "CREATE TABLE CLIENT " +
                    "(id INTEGER NOT NULL AUTO_INCREMENT, " +
                    " first VARCHAR(255), " +
                    " last VARCHAR(255), " +
                    " PRIMARY KEY (id))";
            statement.executeUpdate(sql);

            sql = "CREATE TABLE LIVRE " +
                    "(id INTEGER AUTO_INCREMENT PRIMARY KEY, " +
                    " ISBN VARCHAR(255) NOT NULL, " +
                    " titre VARCHAR(255), " +
                    " auteur VARCHAR(255), " +
                    " nombrePages INTEGER)";
            statement.executeUpdate(sql);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
