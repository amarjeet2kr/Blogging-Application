package com.technovateria.blog.comment;

import com.technovateria.blog.user.UserDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CommentDto {
	private Integer commentId;
	private String content;
	
	private UserDto user = new UserDto();
}
