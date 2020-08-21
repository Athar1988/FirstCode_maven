package org.projet.web;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.projet.FirstCode.IMetierCatalogue;
import org.projet.FirstCode.MetierImp;
import org.projet.FirstCode.Produit;
@WebServlet(name = "cs", urlPatterns = { "/fs", "*.php" })
public class ControleurServlet extends HttpServlet {
	private IMetierCatalogue metier;
	public void init() throws ServletException {
		metier = new MetierImp();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mc = req.getParameter("Motcle");// lire les donner saisie dans zone texte a travers
		// requeste de post- lire le contenu de la requete
		PoduitModele mod = new PoduitModele();// creer un instance du modele pour stocké les donner
		// saisie dans la requete
		mod.setMotCle(mc);// recupere les donnes arrivant a partir de la requete par la methode
		// set pour la stocké dans le modele
		List<Produit> prods = metier.getProduitsParMc(mc);// lister les produits qu'ils contient
		// la motclé mc- recupere les resultats
		mod.setProduits(prods);// stocké les produits renvoye dans le modele
		// il faut creer un nom pour le modele pour l'envoyer au vue
		req.setAttribute("modele", mod);
		// affichage de la liste
		req.getRequestDispatcher("ProduitsVieu.jsp").forward(req, resp);
		// creation de la vus- la formulaire ou on doit saisie le motcle
	}
}
