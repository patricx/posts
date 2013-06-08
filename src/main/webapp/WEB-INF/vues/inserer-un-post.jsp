<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet/less" type="text/css" href="css/styles.less" />

		<script type='text/javascript' src='js/jquery-ui-1.10.2.custom.min.js'></script>
		<script type='text/javascript' src='js/jquery-1.9.1.min.js'></script>
		<script type='text/javascript' src='js/jquery.validate.min.js'></script>
		<script src="js/less.js" type="text/javascript"></script>
		<script src="js/posts.js" type="text/javascript"></script>
		<script src="js/postsvalidate.js" type="text/javascript"></script>
		<title>Posts - insertion </title>
	</head>
	<body>
		<div class="cmenu">
			<ul>
				<li><a href="inserer-un-post.html">Ins&eacute;rer post</a></li>
				<li><a href="liste-des-post.html">Liste des posts</a></li>
			</ul>
		</div>
		<section id="wrapper">
			
			<fieldset>
				<legend> Votre Post </legend>
				<div id="formulaire">
					<form  action="enregistrer-le-post.html" id="enregistrer" method="post">
					<div class="cligne">
							<p class='label'>Nom <em>*</em></p>
							<input type="text" class="rounded"  name="nom" id="nom"/>
						</div>
						<div class="cligne">
							<p class='label'>Mail<em>*</em></p>
							<input type="text" name="mail" class="rounded" id="mail" />
						</div>
						<div class="cligne">
							<p class='label'>Titre<em>*</em></p>
							<input type="text" name="titre" class="rounded" id="titre" />
						</div>
						<div class="cligne">
							<p class='label'>Commentaire<em>*</em></p>
							<textarea rows="10" name="commentaire" class="rounded" id="commentaire" ></textarea>
							<input type="hidden" name="datecommentaire" class="rounded" id="datecommentaire" />
						</div>
						<div class="valider">
							<input  type="submit" value="Valider" class="rounded"  name="valider" id="valider"/>
						</div>
					</form>
				</div>
			</fieldset>
			
		</section>
	</body>
</html>