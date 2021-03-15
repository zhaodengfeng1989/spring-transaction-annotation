package com.zhaodf.service.impl;

import com.zhaodf.dao.EmpDao;
import com.zhaodf.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 类：EmpServiceImpl
 *
 * @author zhaodf
 * @date 2021/3/11
 */
@Service("empService")
public class EmpServiceImpl implements EmpService {
    @Autowired
    EmpDao empDao;

    @Override
    public void transf() {
        sub();
        int i = 1/0;
        save();
    }

    @Override
    public void sub() {
        empDao.sub();
    }

    @Override
    public void save() {
        empDao.save();
    }
}
