<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="Controleur.php" >
Mot de cle :<input type="text" name="Motcle">
<input type="submit" value="ok">
</form>
<table border="1" width="80%">
<tr> <th>ID </th><th>Nom produit </th><th>prix produit </th></tr>
<!-- on peut utiliser la liste des produits avec code java et boucle for -->
<!-- ou bien on utlise la biblio JSTL-->
 <c:forEach var="p" items="${modele.produits}">
 <tr>
<td>${p.id_produit}</td>
<td>${p.nom_produit}</td>
<td>${p.prix}</td>
</tr>
</c:forEach>
</table> 
</body>
</html>