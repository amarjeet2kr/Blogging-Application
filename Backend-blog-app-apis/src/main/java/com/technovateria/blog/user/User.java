package com.technovateria.blog.user;

import java.util.ArrayList;
import java.util.List;

import com.technovateria.blog.comment.Comment;
import com.technovateria.blog.post.Post;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	private String password;
	private String about;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Post> users = new ArrayList<>();
	
	//comment user mapping
	@OneToMany(mappedBy = "user1", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Comment> users1 = new ArrayList<>();
}
