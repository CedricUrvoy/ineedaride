<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="pageSelectionnee" value="admin" scope="request"></c:set>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>NeedaRide</title>
		<meta name="description" content="WebSite Ski/FixedGear/Kyte" />
		<link rel="stylesheet" type="text/css" href="css/reset.css"/>
		<link rel="stylesheet" type="text/css" href="css/style.css"/>
		<script type="text/javascript" src="js/jquery-1.10.2.js"></script>
		<script type="text/javascript" src="js/needaride.js"></script>
	</head>

	<body>
	<jsp:include page="header.jsp" />
		<figure class = bloc-img>
			<img src="img/blog/pres/Admin.jpg" alt="Admin" title="Admin"/>
			<figcaption>Admin</figcaption>
		</figure>
		<div class="listeArticle">
			<div class="bloc-commentaire"">
				<p>Liste des articles</p>
			</div>
			<table class="tableau">
				<tr class="entete">
						<th>Id Article</th>
						<th>Titre Article</th>
						<th>Date Article</th>
						<th>Lien Image</th>
						<th>Categorie</th>
						<th>Auteur</th>
						<th>Nombres de commentaires</th>
						<th>Supprimer</th>
				</tr>
				<c:forEach var="article" items="${articles}">
				<tr class="ligne">
					<td>${article.id}</td>
					<td>${article.title}</td>
					<td><fmt:formatDate value="${article.date}" pattern="dd/MM/yy"/></td>
					<td>${article.image}</td>
					<td>${article.nameCategorie}</td>
					<td>${article.nameAuthor}</td>
					<td><a href="article?id=${article.id}#commentaires">${article.nbrCommentaire}</td>
					<td><a href="supprimerarticle?id=${article.id}" title="supprimer" >X</a></td>
				</tr>
				</c:forEach>
			</table>
		</div>
		<div class="blocAjout">
			<div class="bloc-commentaire"">
				<a title="AjouterArticle" id="ajouterArticle">Ajouter un Article  +</a>
			</div>
				<form method="post" action="ajouterarticle" class="formAjouter">
					<input  class="ajoutArticle" type="text" name="titreArticle" id="titreArticle" required placeholder="   Titre" />
                    <div> 
                        <textarea class="ajoutArticle" id="descriptionArticle" name="descriptionArticle" rows="10" cols="50" required placeholder="   Contenu de l'article"></textarea>
                    </div> 
                    <input  class="ajoutArticle" type="file" name="imageArticle" id="imageArticle" required placeholder="  Chemin image" />
                    <select  class="ajoutArticle" name="idCategorie" id="idCategorie" >
                    	<c:forEach var="categorie" items="${categories}">
				      		<option>${categorie.libelle}</option>
				      	</c:forEach>
   					</select>
                    <select  class="ajoutArticle" name="champAuteur" >
                    	<c:forEach var="auteur" items="${auteurs}">
				      		<option>${auteur.firstname}</option>
				      	</c:forEach>
   					</select>
                    <div>
                    	<input id="boutonEnvoyer" type="submit" value="Ajouter l'article" />
                    </div>
				</form>
		</div>
	<div class="listeAuteur">
			<div class="bloc-commentaire"">
				<p>Liste des auteurs</p>
			</div>
			<table class="tableau" id="tableauAuteur">
				<tr class="entete">
						<th>Id Auteur</th>
						<th>Prenom</th>
						<th>Nom</th>
						<th>Infos</th>
				</tr>
				<c:forEach var="auteur" items="${auteurs}">
				<tr class="ligne">
					<td>${auteur.id}</td>
					<td>${auteur.firstname}</td>
					<td>${auteur.surname}</td>
					<td>${auteur.infos}</td>
				</tr>
				</c:forEach>
			</table>
		</div>
		<div class="listeCategorie">
			<div class="bloc-commentaire"">
				<p>Liste des categories</p>
			</div>
			<table class="tableau">
				<tr class="entete">
						<th>Id Categorie</th>
						<th>Libelle</th>
						<th>Lien img Cat</th>
						<th>Lien img Car</th>
						<th>Lien img Blog</th>
						<th>Description</th>
				</tr>
				<c:forEach var="categorie" items="${categories}">
				<tr class="ligne">
					<td>${categorie.id}</td>
					<td>${categorie.libelle}</td>
					<td>${categorie.srcImgCat}</td>
					<td>${categorie.srcImgCar}</td>
					<td>${categorie.srcImgBlog}</td>
					<td>${categorie.text}</td>
				</tr>
				</c:forEach>
			</table>
		</div>
	</body>
</html>