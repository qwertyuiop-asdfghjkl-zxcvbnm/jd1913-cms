package com.briup.service.Impl;

import com.briup.bean.Category;
import com.briup.dao.ICategoryDao;
import com.briup.exception.CustomerException;
import com.briup.service.ICategoryService;
import com.briup.urtil.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private ICategoryDao categoryDao;

    @Override
    public void saveOrUpdateCategory(Category category) throws CustomerException {
        if (category == null) {
            throw new CustomerException(CodeUtil.PARAM_NULL,"参数为空");
        }
        categoryDao.save(category);
    }

    @Override
    public void deleteById(int id) throws CustomerException {
        categoryDao.deleteById(id);
    }

    @Override
    public Category findById(int id) throws CustomerException {
        return categoryDao.queryById(id);
    }

    @Override
    public List<Category> findAll() throws CustomerException {
        return categoryDao.findAll();
    }
}
