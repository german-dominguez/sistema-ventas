package com.tix.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

	private static Connection databaseConnection;
	private static final String CONEXION = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USUARIO = "SISTEMA_VENTAS";
	private static final String CLAVE = "ventas";

	static {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Se encontró el driver\n");

			try {
				databaseConnection = DriverManager.getConnection(CONEXION, USUARIO, CLAVE);
				System.out.println("Conexión creada con éxito\n");

			} catch (SQLException e) {
				System.out.println("No se logró iniciar la conexión\n");
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			System.out.println("No se encontró el driver\n");
			e.printStackTrace();
		}

	}

	public static void close() {
		try {
			databaseConnection.close();
			System.out.println("\nConexión cerrada con éxito");

		} catch (SQLException e) {
			System.out.println("\nError al cerrar la conexión");
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return databaseConnection;
	}
}
