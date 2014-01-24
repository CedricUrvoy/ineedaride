<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="pageSelectionnee" value="home" scope="request"></c:set>
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
		<div class="carrousel" id="carrousel">
			<ul>
				<c:forEach var="categorie" items="${categories}">
					<img src="${categorie.srcImgCar }" alt="Carrousel" title="Carrousel"/>
				</c:forEach>
			</ul>
			<div class="textImage">

			</div>	
		</div>
		<div class="choix-theme" id="blog">
			<ul>
				<c:forEach var="categorie" items="${categories}">
					<li>
						<img src="${categorie.srcImgCat}" alt="${categorie.libelle}" title="${categorie.libelle}"/>
						<h1>${categorie.libelle}</h1>
						<p>${categorie.text}</p>
						<a href="blog?idCategorie=${categorie.id}">Voir ce	Blog </a>		
					</li>
				</c:forEach>		
		</div>
		<div class="derniersArticles">
			<c:forEach var="article" items="${articles}">
					<li>
						<a href="article?id=${article.id}">${article.title}</h3>
			            <img src="${article.image}" alt="${article.title}" title="${article.title}"/>
					</li>
			</c:forEach>
		</div>
		<div class="contactGlobal" id="contact">
			<h1>Contact</h1>
			<div class="contact">
				<aside id="infosContact">
					<h3>Rester en contact</h3>
					<p>Site réaliser dans le cadre du projet de developpement web en HEI4</p><br/>
					<p>Copyright 2013 Cédric Urvoy</p>
					<p>- Tous droits réservés -</p>
					<ul class="reseaux" id="sociaux">
							<li class="reseauSociaux"><a href="http://www.facebook.com"><img src="img/blog/divers/Facebook.png" alt="facebook" title="facebook"/></a></li>
							<li class="reseauSociaux"><a href="http://www.twitter.com"><img src="img/blog/divers/Twitter.png" alt="twitter" title="twitter"/></a></li>
							<li class="reseauSociaux"><a href="http://www.google.com"><img src="img/blog/divers/Google+.png" alt="google" title="google"/></a></li>
					</ul>
					<p> Adresse email : cedric.urvoy@hei.fr </p>
					<p> Tel : 06 . 14 . 14 . 74 . 30  </p>
				</aside>
				<form action="mailto:cedric.urvoy@hei.fr" method="post" id="formContact" enctype="text/plain">
	                    <fieldset> 
		                    	<input  class="champText" type="text" name="titre" id="nom" required placeholder="   Nom" />
		                    	<input class="champText" type="text" name="titre" id="prenom" required placeholder="   Prenom" />
		                    <div> 
		                        <textarea class="champText" id="message" name="message" rows="10" cols="50" required placeholder="   Message"></textarea>
		                    </div> 
		                    <div>
		                    	<input id="boutonEnvoyer" type="submit" value="Envoyer" />
		                    </div>
	                    </fieldset>
	            </form>
            </div>
		</div>
	</body>