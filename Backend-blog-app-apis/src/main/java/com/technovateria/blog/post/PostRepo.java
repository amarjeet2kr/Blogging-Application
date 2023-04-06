package com.technovateria.blog.post;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technovateria.blog.category.Category;
import com.technovateria.blog.user.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	//custom finder query methods
	
	//get all posts of a particular user
	List<Post> findByUser(User user);
	
	//get all posts of a category
	List<Post> findByCategory(Category category);
	
	//get post by little containing keywords
	List<Post> findByPostTitleContaining(String title);
}
