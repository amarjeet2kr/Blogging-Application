package com.technovateria.blog.post;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.technovateria.blog.category.CategoryDto;
import com.technovateria.blog.comment.CommentDto;
import com.technovateria.blog.user.UserDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PostDto {
	private Integer postId;
	private String postTitle;
	private String postContent;
	private String imageName;
	private Date addedDate;
	private CategoryDto category;
	private UserDto user;
	
	private Set<CommentDto> comments = new HashSet<>();
}
