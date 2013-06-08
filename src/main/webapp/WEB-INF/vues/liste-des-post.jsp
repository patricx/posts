<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
		<title>Posts - liste des posts </title>
	</head>
	<body>
		<div class="cmenu">
			<ul>
				<li><a href="inserer-un-post.html">Ins&eacute;rer post</a></li>
				<li><a href="liste-des-post.html">Liste des posts</a></li>
			</ul>
		</div>
		<section id="wrapper">
		 <div class="listecommentaires">
		 	<div class="entete">
		 		<h2>
		 			<span>Commentaires</span>
		 		</h2>
		 	</div>
		 	<c:forEach items="${userandposts}" var="userpost" varStatus="status" >
		 		<div class="ligne lgn${(status.index)%2}">
		 			<div class="posts">
		 				<h3><a href="">${userpost.nom}</a> </h3>
		 				<c:forEach items="${userpost.commentaires}" var="posts" varStatus="status" >
		 					<p class="date"># ${posts.datecommentaire}</p>

		 					<h4>${posts.titre}</h4>
		 					<div class="post">
		 						${posts.commentaire}
		 					</div>
		 				</c:forEach>
		 			</div>
		 			<div class="imgs">
		 				&nbsp;
		 			</div>
		 		</div>
		 	</c:forEach >
		 </div>
		</section>
	</body>
</html>