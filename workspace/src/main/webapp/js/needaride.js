






$(document).ready( function () {

	// On cache le formulaire d'ajour d'article
  $(".formAjouter").hide();    
  
  // On modifie l'�v�nement "click" sur les liens dans les items de liste
  // qui portent la classe "toggleSubMenu" :
  $(".bloc-commentaire a").click( function () {
	 if($('.formAjouter').is(":hidden")){
		 $(".formAjouter").show();
	 }else{
		 $(".formAjouter").hide();   
	 }
	  event.preventDefault();
  });   
  
  
  var $carrousel = $('#carrousel'), // on cible le bloc du carrousel
  $img = $('#carrousel img'), // on cible les images contenues dans le carrousel
  indexImg = $img.length - 1, // on d�finit l'index du dernier �l�ment
  i = 0, // on initialise un compteur
  $currentImg = $img.eq(i); // enfin, on cible l'image courante, qui poss�de l'index i (0 pour l'instant)

$img.css('display', 'none'); // on cache les images
$currentImg.css('display', 'block'); // on affiche seulement l'image courante

$carrousel.append('<div class="controls"> <span class="prev">Precedent</span> <span class="next">Suivant</span> </div>');

$('.next').click(function(){ // image suivante

  i++; // on incr�mente le compteur

  if( i <= indexImg ){
      $img.css('display', 'none'); // on cache les images
      $currentImg = $img.eq(i); // on d�finit la nouvelle image
      $currentImg.css('display', 'block'); // puis on l'affiche
  }
  else{
      i = indexImg;
  }

});

$('.prev').click(function(){ // image pr�c�dente

  i--; // on d�cr�mente le compteur, puis on r�alise la m�me chose que pour la fonction "suivante"

  if( i >= 0 ){
      $img.css('display', 'none');
      $currentImg = $img.eq(i);
      $currentImg.css('display', 'block');
  }
  else{
      i = 0;
  }

});

function slideImg(){
  setTimeout(function(){ // on utilise une fonction anonyme
						
      if(i < indexImg){ // si le compteur est inf�rieur au dernier index
	    i++; // on l'incr�mente
	}
	else{ // sinon, on le remet � 0 (premi�re image)
	    i = 0;
	}

	$img.css('display', 'none');

	$currentImg = $img.eq(i);
	$currentImg.css('display', 'block');

	slideImg(); // on oublie pas de relancer la fonction � la fin

  }, 7000); // on d�finit l'intervalle � 7000 millisecondes (7s)
}

slideImg(); // enfin, on lance la fonction une premi�re fois

});

