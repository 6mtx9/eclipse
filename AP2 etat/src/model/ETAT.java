package model;

import java.util.ArrayList;

public class ETAT {
	private int num;
	private String etat;
	private ArrayList<ETAT> Listeetat;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public ETAT(int num, String etat) {
		super();
		this.num = num;
		this.etat = etat;
		Listeetat = new ArrayList<ETAT>();
	}
	public ArrayList<ETAT> getListetat() {
		return Listeetat;
	}
	public void setListetat(ArrayList<ETAT> listetat) {
		Listeetat = listetat;
	}
	public void ajouetat(ETAT entree) {
		Listeetat.add(entree);
	}
}
