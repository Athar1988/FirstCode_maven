package org.projet.FirstCode;

import java.util.List;



public interface IMetierCatalogue {

	
	public List<Produit> getProduitsParMc(String mc);
	public void addProduit(Produit P);

}
