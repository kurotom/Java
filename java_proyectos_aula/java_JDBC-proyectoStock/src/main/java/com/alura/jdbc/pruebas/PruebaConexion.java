package com.alura.jdbc.pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost/javadatabase?useTimeZone=true&serverTimeZone=UTC",
				"testjdbc", 
				"unapassword12#"
			);

        System.out.println("Cerrando la conexión");

        con.close();
    }

}
