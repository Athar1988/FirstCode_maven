package org.projet.FirstCode;

import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class MetierImp implements IMetierCatalogue{
	@Override
	public List<Produit> getProduitsParMc(String mc) {
		List<Produit> prod= new ArrayList<Produit>();
		Connection con= SingletonConnection.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("select * from produits where " +
					"NOM_PRODUIT like ?");
			ps.setString(1, "%"+mc+"%");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Produit p= new Produit();
				p.setId_produit(rs.getLong("ID_PRODUIT"));
				p.setNom_produit(rs.getString("NOM_PRODUIT"));
				p.setPrix(rs.getDouble("PRIX"));
				prod.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	}
		return prod;}
	@Override
	public void addProduit(Produit P) {
		// TODO Auto-generated method stub
	}
	public String affiche() {
	return "aaaaaaaa";
	}
}
