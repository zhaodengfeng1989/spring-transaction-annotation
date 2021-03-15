package com.zhaodf.service.impl;

import com.zhaodf.dao.LogDao;
import com.zhaodf.service.LogService;
import org.springframework.stereotype.Service;

/**
 * 类：EmpServiceImpl
 *
 * @author zhaodf
 * @date 2021/3/11
 */
@Service("logService")
public class LogServiceImpl implements LogService {
    LogDao logDao;
    public void setLogDao(LogDao logDao) {
        this.logDao = logDao;
    }

    @Override
    public void log() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logDao.log();
    }
}
