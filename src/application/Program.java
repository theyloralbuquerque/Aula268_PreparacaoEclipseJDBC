package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		// O objeto conn do tipo Connection recebe o retorno do m�todo DB.getConnection().
		Connection conn = DB.getConnection(); // Cria uma conex�o com o BD.
		
		DB.closeConnection(); // Fecha a conex�o com o BD.
	}
}