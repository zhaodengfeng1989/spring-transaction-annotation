package com.zhaodf.dao.impl;

import com.zhaodf.dao.LogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * 类：EmpDaoImpl
 *
 * @author zhaodf
 * @date 2021/3/11
 */
@Repository
public class LogDaoImpl implements LogDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(DataSource source){
        jdbcTemplate = new JdbcTemplate(source);
    }

    @Override
    public void log() {
        long mills = System.currentTimeMillis();
        String content = "日志插入"+mills;
        String sql = "insert into log(content) values(?)";
        jdbcTemplate.update(sql,content);
    }
}
