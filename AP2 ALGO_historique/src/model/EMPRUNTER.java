package model;

import java.sql.Date;

public class EMPRUNTER {
	private Date dateD;
	private Date dateF;
	private ADHERENT adherent;
	private LIVRE livre;
	
	public Date getDateD() {
		return dateD;
	}
	public void setDateD(Date dateD) {
		this.dateD = dateD;
	}
	public Date getDateF() {
		return dateF;
	}
	public void setDateF(Date dateF) {
		this.dateF = dateF;
	}
	public ADHERENT getAdherent() {
		return adherent;
	}
	public void setAdherent(ADHERENT adherent) {
		this.adherent = adherent;
	}
	public LIVRE getLivre() {
		return livre;
	}
	public void setLivre(LIVRE livre) {
		this.livre = livre;
	}
	
	public EMPRUNTER(java.util.Date dateD, java.util.Date dateF, ADHERENT adherent, LIVRE livre) {
		super();
		this.dateD = (Date) dateD;
		this.dateF = (Date) dateF;
		this.adherent = adherent;
		this.livre = livre;
	}
	public EMPRUNTER(Date dateD, ADHERENT adherent, LIVRE livre) {
		super();
		this.dateD = dateD;
		this.adherent = adherent;
		this.livre = livre;
	}
	public EMPRUNTER(Date dateD, Date dateF) {
		super();
		this.dateD = dateD;
		this.dateF = dateF;
	}
	
}
