package com.technovateria.blog.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	private Integer id;
	
	@NotEmpty
	private String name;
	
	@Email
	private String email;
	
	@NotEmpty
	@Size(min = 5, max = 16, message = "Password length must be between 5 - 16 chars !")
	private String password;
	
	@NotEmpty
	private String about;
	
}
