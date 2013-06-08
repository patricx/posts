package com.posts.dao;

import java.util.List;

import com.posts.pojo.Commentaires;

public interface CommentairesDao {
	boolean addCommentairesDao(Commentaires commentaires);
	List<Commentaires> listCommentairesDao();
}