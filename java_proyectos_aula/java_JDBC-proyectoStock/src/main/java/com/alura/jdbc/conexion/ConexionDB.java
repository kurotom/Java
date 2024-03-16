package com.alura.jdbc.conexion;

import java.sql.Connection;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;




// Creación de un Pool de Conexiones, permite crear un rango de cantidades de conexiones disponibles para evitar
// saturación en la base de datos a la alta cantidad de transacciones realizadas.
// 
// El pool debe crearse y se debe instanciar en un DataSource para ser entregado con un return.


public class ConexionDB {

	private DataSource sourceConnection = null;
	
	public Connection conexion;
	
	public Connection poolConexion = null;
	public Statement sentencia = null;
	public ResultSet resultado = null;

	
	
	public ConexionDB() {
		
		String url = "jdbc:postgresql://localhost/javadatabase?useTimeZone=true&serverTimeZone=UTC";
        String user = "testjdbc";
		String pass = "unapassword12#";
		
		ComboPooledDataSource poolConnection = new ComboPooledDataSource();
		
		poolConnection.setJdbcUrl(url);
		poolConnection.setUser(user);
		poolConnection.setPassword(pass);
			
			
		poolConnection.setMinPoolSize(5);
		poolConnection.setAcquireIncrement(3);
		poolConnection.setMaxPoolSize(10);
		
		this.sourceConnection = poolConnection;

	}
	
	
	public Connection getConnection() {
		try {
			return this.sourceConnection.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	
	public ResultSet operacion(Connection conexion, String query) {
		
		try {
			
			this.sentencia = conexion.createStatement();
			this.sentencia.execute(query, Statement.RETURN_GENERATED_KEYS);
					
			this.resultado = sentencia.getResultSet();

			
        	if (this.resultado == null) {
        		
        		this.resultado = sentencia.getGeneratedKeys();
        		return this.resultado;
        		
        	} else {
        		
        		return this.resultado;
        	}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException(e);
			
		}
		
	}
}
