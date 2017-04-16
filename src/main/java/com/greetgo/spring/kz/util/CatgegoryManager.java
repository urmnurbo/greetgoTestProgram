package com.greetgo.spring.kz.util;

import org.apache.ibatis.session.SqlSession;

import com.greetgo.spring.kz.bean.Category;
import com.greetgo.spring.kz.mapper.CategoryMapper;

public class CatgegoryManager {
	public static Category selectCategoryById(int id) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory()
				.openSession();
		try {
			CategoryMapper categoryMapper = sqlSession
					.getMapper(CategoryMapper.class);
			return categoryMapper.selectCategoryById(id);
		} finally {
			sqlSession.close();
		}
	}
	
	public static void insertCategory(Category category){
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory()
				.openSession();
		try {
			CategoryMapper categoryMapper = sqlSession
					.getMapper(CategoryMapper.class);
			categoryMapper.insertCategory(category);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}		
	}
}
