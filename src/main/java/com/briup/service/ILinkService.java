package com.briup.service;

import com.briup.bean.Link;
import com.briup.exception.CustomerException;

import java.util.List;

public interface ILinkService {

    void saveOrUpdateLink(Link link) throws CustomerException;

    void deleteLink(int id) throws CustomerException;

    Link queryById(int id) throws CustomerException;

    List<Link> getAllLink() throws CustomerException;
}
