package br.com.engswb.clinica.server.estoque;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import br.com.engswb.clinica.client.estoque.MedicamentosReq;
import br.com.engswb.clinica.server.MySQLConnection;
import br.com.engswb.clinica.shared.estoque.MedicamentosED;


//public class MedicamentosBD extends MySQLConnection {
public class MedicamentosBD extends RemoteServiceServlet implements MedicamentosReq {
	private static final long serialVersionUID = 1L;   
	
	public MedicamentosED consultaMedicamentos()  {
	    MedicamentosED returnmed = null;
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet result = null;
	
	    try {
	    	MySQLConnection mysql = new MySQLConnection();
			conn = mysql.getConnection();
	        pstmt = conn.prepareStatement("SELECT * FROM Produto ");
	        //pstmt.setString(1, username);
	        //pstmt.setString(2, password);
	        result = pstmt.executeQuery();
	        while (result.next()) {
	            returnmed = new MedicamentosED(result.getInt("IdProduto"), 
            		result.getString("Nome"), 
            		result.getDate("DataVencimento"),
            		result.getInt("Quantidade"),
            		result.getInt("Tipo"),
            		result.getString("Localizacao"),
            		result.getInt("IdFornecedor")
        		);
	        }
	    } catch (Exception e) {
			e.printStackTrace();
	    
	    //catch (SQLException sqle) {
	    //    sqle.printStackTrace();
	        
	    } finally {
	        // Cleanup
	        try {
				result.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	    }
	
	    return returnmed;
	}
	
}
