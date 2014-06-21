package br.com.engswb.clinica.server;

import java.sql.Connection;
import java.sql.DriverManager;

public class db_conn 
{
    public Connection con;

    public db_conn()
    {

    }

    public String ConnectToDB()
    {
        try
        {
            String host         = "mysql.cifali.uni5.net";
            String db           = "cifali";
            String driver       = "com.mysql.jdbc.Driver";
            String user         = "cifali";
            String pass         = "c1f4l11111";
            
            
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(host+db, user, pass);

            return "Connected to Database";
        }
        catch(Exception ex)
        {
            return ex.toString();
        }

    }
}
