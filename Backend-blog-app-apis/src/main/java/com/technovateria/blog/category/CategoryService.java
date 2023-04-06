package com.technovateria.blog.category;

import java.util.List;

public interface CategoryService {
	
	//create a category
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//update a category
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	//delete a category
	void deleteCategory(Integer categoryId);
	
	//get a single category
	CategoryDto getCategory(Integer categoryId);
	
	//get all category
	List<CategoryDto> getAllCategories();
}
