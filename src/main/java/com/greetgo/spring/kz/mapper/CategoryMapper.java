package com.greetgo.spring.kz.mapper;

import com.greetgo.spring.kz.bean.Category;

public interface CategoryMapper {
	public Category selectCategoryById(int id);
	public void insertCategory(Category category);
}
