package IDS00J;
import java.sql.*;

public class NonCompliant00 {
    private System PropertyManager;

    public Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        // Can hold some value like
        // "jdbc:microsoft:sqlserver://<HOST>:1433,<UID>,<PWD>"
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","admin","MySQLpassword");
    }

    String hashPassword(char[] password) {
        // Create hash of password
        return "password";
    }

    public void doPrivilegedAction(
            String username, char[] password
    ) throws SQLException {
        Connection connection = getConnection();
        if (connection == null) {
            // Handle error
        }
        try {
            String pwd = hashPassword(password);
            String sqlString = "select * from db_user where username=" +
                    username + " and password =" + pwd;
            PreparedStatement stmt = connection.prepareStatement(sqlString);

            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                throw new SecurityException("User name or password incorrect");
            }

            // Authenticated; proceed
        } finally {
            try {
                connection.close();
            } catch (SQLException x) {
                // Forward to handler
            }
        }
    }
}