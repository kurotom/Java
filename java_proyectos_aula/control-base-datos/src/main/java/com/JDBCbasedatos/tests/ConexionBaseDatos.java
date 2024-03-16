package com.JDBCbasedatos.tests;



import java.sql.*;





public class ConexionBaseDatos {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:postgresql://localhost/javadatabase?useTimeZone=true&serverTimeZone=UTC";
		
		Connection conexion = DriverManager.getConnection(
				url, 
				"testjdbc", 
				"unapassword12#"
				);
		
		
		
		System.out.println("Conexion establecida");
		System.out.println("Cerrando Conexion");
		
		
		conexion.close();
		
		
		

	}

}
