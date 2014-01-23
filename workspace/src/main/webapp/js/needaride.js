






$(document).ready( function () {

	// On cache le formulaire d'ajour d'article
  $(".formAjouter").hide();    
  
  // On modifie l'évènement "click" sur les liens dans les items de liste
  // qui portent la classe "toggleSubMenu" :
  $(".bloc-commentaire a").click( function () {
	  $(".formAjouter").show();
	  event.preventDefault();
  });    
} ) ;