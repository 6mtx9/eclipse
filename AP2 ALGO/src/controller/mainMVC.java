package controller;
import java.sql.SQLException;
import model.model;
import view.accueil;


public class mainMVC {

	private static model m;
	
	public static model getM() {
		return m;
	}
	
	public static void main(String[] args) throws SQLException{
		System.out.println("main MVC");
		m= new model();
		// m.getAll();
		accueil window = new accueil();
		
		mainMVC.getM().getAll();
	}

}
