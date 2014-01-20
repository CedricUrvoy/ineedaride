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
			<img src="img/blog/pres/blog_ski.jpg" alt="Blog" title="Blog"/>
			<figcaption>SKI</figcaption>
		</figure>
		<div class="article">
			<article class="contenu">
					<aside class="bloc-date">
			           <p>22 Janv 2014</p>
			        </aside>
			        <div class="titre">
			            <h3>Lorem Ipsum is simply dummy text of the printing .</h3>
			            <div class="bloc-infos-article">
				        	<p class="infosAuthor"> By : <a href="cedpilou">Cedpilou</a></p>
				        	<p class="infosCategorie">Categorie : <a href="ski">Ski</a></p>
				        	<p><a href="comments">[25] Commentaires	</a></p>
				        	<a href="http://www.facebook.com"><img src="img/blog/divers/PartagerFacebook.png" alt="facebook" title="facebook"/></a>
							<a href="http://www.twitter.com"><img src="img/blog/divers/PartagerTwitter.png" alt="twitter" title="twiter"/></a>		
			       		 </div>
			            <img src="img/blog/articles/apohutch/apohutch.jpg" alt="apo hutch" title="apo hutch"/>
			            <div class="text">
				            <p>"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."</p>
			            </div>
			        </div> 
			</article>
		</div>
		<jsp:include page="sidebar.jsp" />
	</body>
</html>