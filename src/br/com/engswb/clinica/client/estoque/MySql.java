package br.com.engswb.clinica.client.estoque;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/* referencia: http://artofcoding.wordpress.com/2008/03/21/java-conectando-se-ao-mysql/ */
public class MySql {

    private String host;
    private String user;
    private String pass;
    private String database;
    
    public Connection c;
    
    /**
     * Construtor da classe
     * 
     * @param host Host em que se deseja conectar 
     * @param database Nome do database em que se deseja conectar
     * @param user Nome do usuário
     * @param pass Senha do usuário
     */
    public MySql( String host, String database, String user, String pass ) {
        this.pass = pass;
        this.user = user;
        this.host = host;
        this.database = database;
    }
    
    /**
     * Método que estabelece a conexão com o banco de dados
     * 
     * @return True se conseguir conectar, falso em caso contrário.
     */
    public boolean connect() {
        boolean isConnected = false;
        String url;
        
        url = "jdbc:mysql://"+this.host+"/"
              +this.database+"?"
              +"user="+this.user
              +"&password="+this.pass;
              
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println(url);
            this.c = DriverManager.getConnection(url);
            isConnected = true;
        } catch( SQLException e ) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            isConnected = false;
        } catch ( ClassNotFoundException e ) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            isConnected = false;
        } catch ( InstantiationException e ) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            isConnected = false;
        } catch ( IllegalAccessException e ) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            isConnected = false;
        }
        
        return isConnected;
    }
}
