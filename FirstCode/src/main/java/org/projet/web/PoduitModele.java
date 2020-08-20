package org.projet.web;

import java.util.ArrayList;
import java.util.List;
import org.projet.FirstCode.Produit;
public class PoduitModele {

	private String MotCle;
	private List<Produit> produits= new ArrayList<>();
	public String getMotCle() {
		return MotCle;
	}
	public void setMotCle(String motCle) {
		MotCle = motCle;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
}
