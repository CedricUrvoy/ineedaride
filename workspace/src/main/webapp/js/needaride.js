

$(document).ready( function () {

	/*** Fonction pour gerer l'affichage d'un ajout d'article ***/
		  $(".formAjouter").hide();    

		  $(".bloc-commentaire a").click( function () {
			 if($('.formAjouter').is(":hidden")){
				 $(".formAjouter").show();
			 }else{
				 $(".formAjouter").hide();   
			 }
			  event.preventDefault();
		  });   
  
	/*** Fonction pour gerer le defilement du carrousel ***/
  var  $img = $('#carrousel img'),indexImg = $img.length - 1, i = 0,$currentImg = $img.eq(i); 

  $img.css('display', 'none');
  $currentImg.css('display', 'block');

function slideImg(){
  setTimeout(function(){				
      if(i < indexImg){i++;
      }else{ 
		i = 0;}
	$img.css('display', 'none');
	$currentImg = $img.eq(i);
	$currentImg.css('display', 'block');
	slideImg();
  }, 5000);
}

slideImg();


	/**** Fonction pour refresh apres un ajout ****/



$("#boutonEnvoyer").click(function(event) {
	var idArticle = $(".ajoutComment").attr("id");
	 $.post("ajoutercommentaire",{
		 email:$("#email").val(),
		 name:$("#name").val(),
		 text:$("#text").val(),
		 idArticle:idArticle
		 }).done(function(data){
	 $("#listeCommentaires").append('<li class="commentaire"><h4 class="nom">'+data.name+'</h4><h4>'+data.email+'  :</h4><p>'+ data.text+'</p></li>' );
	 });
	 event.preventDefault();
	});

});
