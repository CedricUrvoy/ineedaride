<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="pageSelectionnee" value="blog" scope="request"></c:set>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>NeedaRide</title>
		<meta name="description" content="WebSite Ski/FixedGear/Kyte" />
		<link rel="stylesheet" type="text/css" href="css/reset.css"/>
		<link rel="stylesheet" type="text/css" href="css/style.css"/>
	</head>

	<body>
	<jsp:include page="header.jsp" />
		<figure class = bloc-img>
			<img src="img/blog/pres/SkiBlog.jpg" alt="Blog" title="Blog"/>
			<figcaption>SKI</figcaption>
		</figure>
		<div class="articles">
			<c:forEach var="article" items="${articles}">
				<article class="pres-article">
					<aside class="bloc-date">
			           <p><fmt:formatDate value="${article.date}" pattern="dd MMMM yyyy"/></p>
			        </aside>
			        <div class="presentation">
			            <h3>${article.title}</h3>
			            <img src="${article.image}" alt="${article.title}" title="${article.title}"/>
			            <div class="pres">
				            <p>${article.description}</p>
				            <a href="article" title="${article.title}" target="_self">Lire l'article</a>
			            </div>
			        </div>
			        <div class="bloc-infos">
			        	<p class="infosAuthor"> By : <a href="cedpilou">Cedpilou</a></p>
			        	<p class="infosCategorie">Categorie : <a href="ski">Ski</a></p>
			        	<p><a href="comments">[25] Commentaires	</a></p>
			        	<a href="http://www.facebook.com"><img src="img/blog/divers/PartagerFacebook.png" alt="facebook" title="facebook"/></a>
						<a href="http://www.twitter.com"><img src="img/blog/divers/PartagerTwitter.png" alt="twitter" title="twiter"/></a>		
			        </div>
				</article>
			 </c:forEach>
		</div>
		<jsp:include page="sidebar.jsp" />
	</body>
</html>