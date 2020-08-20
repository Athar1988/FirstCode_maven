package org.projet.FirstCode;

import java.io.Serializable;

public class Produit implements Serializable{
	private long id_produit;
	private String nom_produit;
	private double prix;
	public long getId_produit() {
		return id_produit;
	}
	public void setId_produit(long id_produit) {
		this.id_produit = id_produit;
	}
	public String getNom_produit() {
		return nom_produit;
	}
	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Produit(String nom_produit, double prix) {
		super();
		this.nom_produit = nom_produit;
		this.prix = prix;
	}
	public Produit() {
		super();
	}
	

}
