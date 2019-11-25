package com.briup.dao;

import com.briup.bean.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILinkDao extends JpaRepository<Link,Integer> {
}
