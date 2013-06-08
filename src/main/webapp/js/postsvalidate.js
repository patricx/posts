$(function(){
	$("#enregistrer").validate({
	      rules: {
	    	  nom:{
	            "required": true,
	            "minlength": 2
	         },
	         mail: {
	            "email": true,
	            "required": true
	         },
	         titre: {
	            "required": true,
	            "minlength": 2
	         },
	         commentaire:{
	            "required": true,
	            "minlength": 2
	         },
	      },
	      messages:{
	    	  nom:{
		            required: "<p class='erreur'> Ce champ ne doit pas &ecirc;tre vide </p>",
		            minlength: "<p class='erreur'> Minimum deux (02 ) caract&egrave; requis </p>"
		         },
		      mail:{
		            required: "<p class='erreur'> Ce champ ne doit pas &ecirc;tre vide </p>",
		            email: "<p class='erreur'> Ce champ est de la forme mon@mail.xxxx </p>"
		         },
	         titre:{
		            required: "<p class='erreur'> Ce champ ne doit pas &ecirc;tre vide </p>",
		            minlength: "<p class='erreur'> Minimum deux (02 ) caract&egrave; requis </p>"
		         },
	         commentaire:{
		            required: "<p class='erreur'> Ce champ ne doit pas &ecirc;tre vide </p>",
		            minlength: "<p class='erreur'> Minimum deux (02 ) caract&egrave; requis </p>"
		         },
	      }
	  });
});