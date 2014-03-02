

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


	/**** Fonction pour ajouter un commentaire sur le dom****/



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

	$("#infosArticle").on("click",".boutonSupprimer",function(event){
		var idArticle = this.id;
		var validation = window.confirm("Voulez vous supprimer l'article ?"); 
		if(validation==true){
			$.post("supprimerarticle?idArticle="+idArticle).done(function(data){
				$("#" + idArticle).parent().remove();
				});	
		}
		
		event.preventDefault();
	});
	
	/*$("#administration").click(function(event){
		var mdp = window.prompt("Quel est le mot de passe ?", "mot de passe");
		$.get("admin").done(function(data){
		});
		event.preventDefault();
	});*/
});


