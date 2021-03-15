package com.zhaodf.dao.impl;

import com.zhaodf.dao.EmpDao;
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
public class EmpDaoImpl implements EmpDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(DataSource source){
        jdbcTemplate = new JdbcTemplate(source);
    }

    @Override
    public void sub() {
        jdbcTemplate.update("update emp set salary=salary-200 where empno=1");
    }

    @Override
    public void save() {
        jdbcTemplate.update("update emp set salary=salary+200 where empno=2");
    }
}
