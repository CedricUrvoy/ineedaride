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
		<div class="articles">
			<article class="pres-article">
				<aside class="bloc-date">
		           <p>22 Janv 2014</p>
		        </aside>
		        <div class="presentation">
		            <h3>Lorem Ipsum is simply dummy text of the printing .</h3>
		            <img src="img/blog/articles/apohutch/apohutch.jpg" alt="apo hutch" title="apo hutch"/>
		            <div class="pres">
			            <p>"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."</p>
			            <a href="article" title="article" target="_self">Lire l'article</a>
		            </div>
		        </div>
		        <div class="bloc-infos">
		        	<p class="infosAuthor"> By : <a href="cedpilou">Cedpilou</a></p>
		        	<p class="infosCategorie">Categorie : <a href="ski">Ski</a></p>
		        	<a href="http://www.facebook.com"><img src="img/blog/divers/PartagerFacebook.png" alt="facebook" title="facebook"/></a>
					<a href="http://www.twitter.com"><img src="img/blog/divers/PartagerTwitter.png" alt="twitter" title="twiter"/></a>		
		        </div>
			</article>
			<article class="pres-article">
				<aside class="bloc-date">
		           <p>22 Janv 2014</p>
		        </aside>
		        <div class="presentation">
		            <h3>Lorem Ipsum is simply dummy text of the printing .</h3>
		            <img src="img/blog/articles/apohutch/apohutch.jpg" alt="apo hutch" title="apo hutch"/>
		            <div class="pres">
			            <p>"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."</p>
			            <a href="article" title="article" target="_self">Lire l'article</a>
		            </div>
		        </div>
		        <div class="bloc-infos">
		        	<p class="infosAuthor"> By : <a href="cedpilou">Cedpilou</a></p>
		        	<p class="infosCategorie">Categorie : <a href="ski">Ski</a></p>
		        	<a href="http://www.facebook.com"><img src="img/blog/divers/PartagerFacebook.png" alt="facebook" title="facebook"/></a>
					<a href="http://www.twitter.com"><img src="img/blog/divers/PartagerTwitter.png" alt="twitter" title="twiter"/></a>		
		        </div>
			</article>
			<article class="pres-article">
				<aside class="bloc-date">
		           <p>22 Janv 2014</p>
		        </aside>
		        <div class="presentation">
		            <h3>Lorem Ipsum is simply dummy text of the printing .</h3>
		            <img src="img/blog/articles/apohutch/apohutch.jpg" alt="apo hutch" title="apo hutch"/>
		            <div class="pres">
			            <p>"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."</p>
			            <a href="article" title="article" target="_self">Lire l'article ></a>
		            </div>
		        </div>
		        <div class="bloc-infos">
		        	<p class="infosAuthor"> By : <a href="cedpilou">Cedpilou</a></p>
		        	<p class="infosCategorie">Categorie : <a href="ski">Ski</a></p>
		        	<a href="http://www.facebook.com"><img src="img/blog/divers/PartagerFacebook.png" alt="facebook" title="facebook"/></a>
					<a href="http://www.twitter.com"><img src="img/blog/divers/PartagerTwitter.png" alt="twitter" title="twiter"/></a>		
		        </div>
			</article>
		</div>
		<aside class="sidebar">
			<div class="recherche">
				<form method="post" action="recherche" class="form-horizontal">
					<input type="text" name="recherche" id="recherche" placeholder="   Search">
				</form>
			</div>
			<div class="follow">
				<h2>Follow Us</h2>
				<ul class="reseaux">
					<li class="reseauSociaux"><a href="http://www.facebook.com"><img src="img/blog/divers/Facebook.png" alt="facebook" title="facebook"/></a></li>
					<li class="reseauSociaux"><a href="http://www.twitter.com"><img src="img/blog/divers/Twitter.png" alt="twitter" title="twitter"/></a></li>
					<li class="reseauSociaux"><a href="www.google.com"><img src="img/blog/divers/Google+.png" alt="google" title="google"/></a></li>
				</ul>
				<form method="post" action="inscription" class="inscription">
					<input type="text" name="inscription" id="emailInscription" placeholder="Email">
					<input class="boutonInscription" type="submit" value="S'incrire">
				</form>
			</div>
			<div class="categorie">
				<h2>Categories</h2>
				<ul>
					<li class="activeCategorie">><a href="ski">SKI</a></li>
					<li>><a href="snow">SNOW</a></li>
					<li>><a href="fixie">FIXIE</a></li>
					<li>><a href="kyte">KYTE</a></li>
				</ul>
			</div>
		</aside>
	</body>