package com.briup.service;

import com.briup.bean.Link;
import com.briup.exception.CustomerException;

public interface ILinkService {

    void addLink(Link link) throws CustomerException;

    void deleteLink(int id) throws CustomerException;
}
