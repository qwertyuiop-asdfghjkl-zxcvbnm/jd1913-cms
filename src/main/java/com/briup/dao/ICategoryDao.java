package com.briup.dao;

import com.briup.bean.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryDao extends JpaRepository<Category,Integer> {

    Category queryById(int id);


}
