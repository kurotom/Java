package com.JDBCbasedatos.tests;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteJDBC {
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:postgresql://localhost/javadatabase?useTimeZone=true&serverTimeZone=UTC";
		
		Connection conexion = DriverManager.getConnection(
				url, 
				"testjdbc", 
				"unapassword12#"
				);
		
		
		String create = "DELETE FROM datos WHERE id = 14";
		
		Statement sentencia = conexion.createStatement();
				
		sentencia.execute(create);
		
		int modificaciones = sentencia.getUpdateCount();
		
		System.out.println(modificaciones);
		

	
		
		
	
		conexion.close();
		
	}
}
