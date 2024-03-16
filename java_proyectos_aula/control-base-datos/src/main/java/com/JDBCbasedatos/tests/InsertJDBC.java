package com.JDBCbasedatos.tests;

import java.sql.*;

public class InsertJDBC {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:postgresql://localhost/javadatabase?useTimeZone=true&serverTimeZone=UTC";
		
		Connection conexion = DriverManager.getConnection(
				url, 
				"testjdbc", 
				"unapassword12#"
				);
		
		
		String create = "INSERT INTO datos (nombre, descripcion, cantidad) VALUES ('telefono', 'un telefono', 4)";
		
		Statement sentencia = conexion.createStatement();
		
		sentencia.execute(create, Statement.RETURN_GENERATED_KEYS);
		
		ResultSet insertData = sentencia.getGeneratedKeys();

		while (insertData.next()) {
			int numeroFila = insertData.getRow();
			System.out.println("Registro ingresado, ID: " + insertData.getInt(numeroFila));
		}
	
		
		
	
		conexion.close();
		
	}
}
