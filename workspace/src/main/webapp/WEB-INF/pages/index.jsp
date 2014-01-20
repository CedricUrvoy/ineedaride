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
		<div class="carroussel">
			<img src="img/blog/pres/SkiCarroussel.jpg" alt="Ski" title="Ski"/>
			<div class="textImage">
				<h1>Ski & Snow</h1>
			</div>	
		</div>
		<div class="choix-theme">
			<ul>
				<li>
					<img src="img/blog/pres/Ski.png" alt="Ski" title="Ski"/>
					<h1>Ski & Snow</h1>
					<p>Tout sur le ski et le snow : Test, video ...</p>
					<a href="blog">	 Voir ce thème </a>		
				</li>
				<li>
					<img src="img/blog/pres/Fixie.png" alt="Ski" title="Ski"/>
					<h1>Fixie</h1>
					<p>Tout sur le fixie et le singlespeed : Test, video ...</p>
					<a href="blog">	 Voir ce thème </a>		
				</li>
				<li>
					<img src="img/blog/pres/Kite.png" alt="Ski" title="Ski"/>
					<h1>Kite & Surf</h1>
					<p>Tout sur le kyte et le surf : Test, video ...</p>
					<a href="blog">	 Voir ce thème </a>		
				</li>				
		</div>
		<div class="contactGlobal" id="contact">
			<h1>Contact</h1>
			<div class="contact">
				<aside id="infosContact">
					<h3>Rester en contact</h3>
					<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's </p>
					<ul class="reseaux">
							<li class="reseauSociaux"><a href="http://www.facebook.com"><img src="img/blog/divers/Facebook.png" alt="facebook" title="facebook"/></a></li>
							<li class="reseauSociaux"><a href="http://www.twitter.com"><img src="img/blog/divers/Twitter.png" alt="twitter" title="twitter"/></a></li>
							<li class="reseauSociaux"><a href="www.google.com"><img src="img/blog/divers/Google+.png" alt="google" title="google"/></a></li>
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