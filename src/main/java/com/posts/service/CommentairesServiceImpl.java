package com.posts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.posts.dao.CommentairesDao;
import com.posts.pojo.Commentaires;

@Service
@Transactional 
public class CommentairesServiceImpl implements CommentairesServices {
	
	@Autowired
	CommentairesDao commentairesdao;
	public CommentairesServiceImpl() {}	
	
	public boolean addCommentairesService(Commentaires commentaires) {
		
		return commentairesdao.addCommentairesDao(commentaires);
	}

}
