package com.technovateria.blog.payloads;

import java.util.List;

import com.technovateria.blog.post.PostDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PostResponse {
	private List<PostDto> content;
	private int pageNumber;
	private int pageSize;
	private long totlaElements;
	private int totalPages;
	private boolean lastPage;
}
