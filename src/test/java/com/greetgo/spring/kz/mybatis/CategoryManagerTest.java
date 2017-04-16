package com.greetgo.spring.kz.mybatis;

import org.junit.Test;

import com.greetgo.spring.kz.bean.Category;
import com.greetgo.spring.kz.util.CatgegoryManager;

public class CategoryManagerTest {

	
	@Test
	public void testSelectUser() {
		Category category = CatgegoryManager.selectCategoryById(1);
		assert(category != null);
		assert(category.getCategoryName().equals("Apparel"));
		
	}

	@Test
	public void testInsertUser() {
		Category category = new Category();
		category.setCategoryName("Shoes");
		CatgegoryManager.insertCategory(category);
		Category insertedCategory = CatgegoryManager.selectCategoryById(category.getCategoryId());
		
		assert(insertedCategory != null);
		assert(insertedCategory.getCategoryName().equals("Shoes"));
		
	}	
	
}
