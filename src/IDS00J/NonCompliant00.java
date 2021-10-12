package IDS00J;
import java.sql.*;

public class NonCompliant00 {
    public final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/demodb";

    public static String doPrivilegedAction(String username, String password) throws SQLException {
        String result = "";
        Connection conn = DriverManager.getConnection(DB_URL, "admin", "MySQLpassword");
        if (conn == null) {
            // Handle error
            System.out.println("ERROR: Connection failed");
            result = "Connection failed";
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sqlString = "select * from db_user where username='" +
                    username + "' and password ='" + password + "'";
            PreparedStatement stmt = conn.prepareStatement(sqlString);

            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                throw new SecurityException("User name or password incorrect");
            }
            result = "Logged in";
            // Authenticated; proceed
        } catch(SQLException se){
            se.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (conn!=null)
                    conn.close();
            } catch(SQLException se) {
                se.printStackTrace();
            }
        }
        return result;
    }

}