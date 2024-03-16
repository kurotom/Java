package com.JDBCbasedatos.tests;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class SelectQueryJDBC {

	public static void main(String[] args) throws SQLException {
		
		
		String url = "jdbc:postgresql://localhost/javadatabase?useTimeZone=true&serverTimeZone=UTC";
		
		
		
		Connection conexion = DriverManager.getConnection(
				url, 
				"testjdbc", 
				"unapassword12#"
				);
		
		
		Statement sentencia = conexion.createStatement();

		String query = "SELECT * FROM datos";
		
		
//		Devuelve un objeto ResultSet
//		se puede iterar dentro de ResultSet usando while y el método
//		.next()
//		Se puede convertir en un List, esta List contendrá una lista de Map con una llave String y value String
//		Se crea un HashMap() para crear un mapa por cada entrada de la iteración
//		al final de la iteración se agrega a la lista.
		
		ResultSet resultSet = sentencia.executeQuery(query);

		List<Map<String, String>> listaDeMapas = new ArrayList<> (); 
		
		
		
				
		while (resultSet.next()) {
		
			System.out.println(resultSet.findColumn("id"));
			
			Map<String, String> mapearResultSet = new HashMap<> ();	
			
			mapearResultSet.put("ID", String.valueOf(resultSet.getInt("id")));
			mapearResultSet.put("NOMBRE", String.valueOf(resultSet.getString("nombre")));
			mapearResultSet.put("DESCRIPCION", String.valueOf(resultSet.getString("descripcion")));
			mapearResultSet.put("CANTIDAD", String.valueOf(resultSet.getInt("cantidad")));
			
			
			listaDeMapas.add(mapearResultSet);
			
		}
	
		
		conexion.close();
		
		
		
		listaDeMapas.forEach(item -> {
			System.out.println(item);
		});
		
		
		

	}
}
