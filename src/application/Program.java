package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		// O objeto conn do tipo Connection recebe o retorno do método DB.getConnection().
		Connection conn = DB.getConnection(); // Cria uma conexão com o BD.
		
		DB.closeConnection(); // Fecha a conexão com o BD.
	}
}