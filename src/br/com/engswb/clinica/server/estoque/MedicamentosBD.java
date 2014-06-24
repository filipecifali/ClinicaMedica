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

	@Override
	public String insereMedicamentos(String nome, String localizacao, String dataVencimento, String qtdEstoque, String qtdMinima, String tipo, String idFornecedor, String idProduto) {
		Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet result = null;
	    int idmax = 0;
	    try {
	    	MySQLConnection mysql = new MySQLConnection();
			conn = mysql.getConnection();
			if ( (idProduto == null) || (idProduto.equals("")) ){
				pstmt = conn.prepareStatement("SELECT MAX(IdProduto) as idmax FROM Produto ");
				result = pstmt.executeQuery();
				result.next();
				idmax = result.getInt("idmax") + 1;
			}
	        pstmt = conn.prepareStatement("INSERT INTO Produto (IdProduto, Nome, DataVencimento, Quantidade, QuantidadeMinima, Tipo, Localizacao, IdFornecedor) "
	        		+ "VALUES (? , ? , ? , ? , ? , ? , ? , ?)" );
	        if ( (idProduto == null) || (idProduto.equals("")) ){
	        	pstmt.setInt(1, idmax);
	        }else{
	        	pstmt.setInt(1, Integer.parseInt(idProduto));
	        }
	        pstmt.setString(2, nome);
	        pstmt.setString(3, dataVencimento);
	        pstmt.setInt(4, Integer.parseInt(qtdEstoque));
	        pstmt.setInt(5, Integer.parseInt(qtdMinima));
	        pstmt.setInt(6, Integer.parseInt(tipo));
	        pstmt.setString(7, localizacao);
	        pstmt.setInt(8, Integer.parseInt(idFornecedor));
	        
	        pstmt.executeUpdate();
	        return idmax+"OK";
	        
	    } catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
	    } finally {
	        try {
				result.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	    }
	}
	
}
