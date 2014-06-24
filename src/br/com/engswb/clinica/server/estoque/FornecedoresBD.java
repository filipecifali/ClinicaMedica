package br.com.engswb.clinica.server.estoque;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import br.com.engswb.clinica.client.estoque.FornecedoresReq;
import br.com.engswb.clinica.server.MySQLConnection;
import br.com.engswb.clinica.shared.estoque.FornecedoresED;


//public class MedicamentosBD extends MySQLConnection {
public class FornecedoresBD extends RemoteServiceServlet implements FornecedoresReq {
	private static final long serialVersionUID = 1L;   
	
	public List<FornecedoresED> consultaFornecedores()  {
		List<FornecedoresED> listFornecedores = new ArrayList<FornecedoresED>();
		FornecedoresED returnForn = null;
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet result = null;
	
	    try {
	    	MySQLConnection mysql = new MySQLConnection();
			conn = mysql.getConnection();
	        pstmt = conn.prepareStatement("SELECT * FROM Fornecedor ");
	        //pstmt.setString(1, username);
	        //pstmt.setString(2, password);
	        result = pstmt.executeQuery();
	        while (result.next()) {
	            returnForn = new FornecedoresED(result.getInt("IdFornecedor"), 
            		result.getString("Nome"), 
            		result.getString("Cnpj"),
            		result.getString("Endereco"),
            		result.getString("Bairro"),
            		result.getString("Pais"),
            		result.getString("Uf")
        		);
	            listFornecedores.add(returnForn);
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
	
	    return listFornecedores;
	}
	
}
