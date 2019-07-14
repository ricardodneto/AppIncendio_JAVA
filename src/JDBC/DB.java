/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DB {
//Criando objeto para conexao 
private static Connection conn = null	;
	// metodo para conexao 
public static Connection getConnection() throws ClassNotFoundException{
	if(conn == null){
		try{
                    
            
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		// Instanciando a URL da conexao, chamando DBURL devido ao nome que esta dentro do arquivo TXT
		String url ="jdbc:sqlserver://localhost:1433;databaseName=APS;user=sa;password=sa;";
		//Carregando drive do banco
		conn = DriverManager.getConnection(url);
		}
		catch(SQLException e){
			throw new dbException(e.getMessage()) ;
		}
	}
	return conn;
}
// Criando metodo para fechamento da conexao	
public static void closeConnection(){
	if(conn != null){
		try{
			conn.close();
		}
		catch(SQLException e){
			throw new dbException(e.getMessage());
		}
	}
}

	// metodo auxiliar para nao ficar criando TRY-CATCH nos CLOSE ()
	public static void closeStatement(Statement st){
		if (st != null){
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new dbException(e.getMessage());
			}
		}
	}
	public static void closeResulSet(ResultSet rs){
		if (rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new dbException(e.getMessage());
			}
		}
	}
}

