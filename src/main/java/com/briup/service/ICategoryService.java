package com.briup.service;

import com.briup.bean.Category;
import com.briup.exception.CustomerException;

import java.util.List;


public interface ICategoryService {

    void saveOrUpdateCategory(Category category) throws CustomerException;

    void deleteById(int id) throws CustomerException;

    Category findById(int id) throws CustomerException;

    List<Category> findAll() throws CustomerException;

}
