package com.briup.service.Impl;

import com.briup.bean.Link;
import com.briup.dao.ILinkDao;
import com.briup.exception.CustomerException;
import com.briup.service.ILinkService;
import com.briup.urtil.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkServiceImpl implements ILinkService {

    @Autowired
    private ILinkDao linkDao;

    @Override
    public void addLink(Link link) throws CustomerException {
        if(link == null){
            throw new CustomerException(CodeUtil.PARAM_NULL,"参数为空");
        }
        linkDao.save(link);
    }

    @Override
    public void deleteLink(int id) throws CustomerException {

    }
}
