package com.technovateria.blog.post;

import java.util.List;

import com.technovateria.blog.payloads.PostResponse;

public interface PostService {

	//POST - create a post
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//PUT - update a post
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//DELETE
	void deletePost(Integer postId);
	
	//GET
	//get all post
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	
	//get single post
	PostDto getPostById(Integer postId);
	
	//get all post by category
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	//get all post of a user
	List<PostDto> getPostsByUser(Integer userId);
	
	//search post
	List<PostDto> searchPosts(String keyword);
}
