package br.com.engswb.clinica.server;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.engswb.clinica.shared.Fornecedor;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class MySQLConnection extends RemoteServiceServlet implements DBConnection {
	
	private static final long serialVersionUID = 1L;    

    private String _status;
    private String _url = "jdbc:mysql://localhost:3306/mydatabase";
    private String _user = "myusername";
    private String _pass = "mysecretpassword";
    
    /**
     * Constructor
     */
    public MySQLConnection() {
    }

    /**
     * Gets the connection for all of our commands
     * 
     * @return
     * @throws Exception
     */
    private Connection getConnection() throws Exception {
        //I like to use this setup where it converts datetimes of '00-00-0000' to null rather than error out.
        Properties props = new Properties();
        props.setProperty("user", _user);
        props.setProperty("password", _pass);
        props.setProperty("zeroDateTimeBehavior", "convertToNull");
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection(_url, props);
        return conn;
    }

    
    /**
     * Authenticates a user based on their username and password
     * @throws Exception
     */
    public Fornecedor authenticateUser(String username, String password) throws Exception {
    	Fornecedor returnuser = null;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet result = null;

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            result = pstmt.executeQuery();
            while (result.next()) {
                returnuser = new Fornecedor(1,"","","","","","");
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            // Cleanup
            result.close();
            pstmt.close();
            conn.close();
        }

        return returnuser;
    }

}
