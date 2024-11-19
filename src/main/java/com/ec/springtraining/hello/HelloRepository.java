package com.ec.springtraining.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class HelloRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Map<String, Object> findById(String id) {
        String query = "select * "
                + "from employee "
                + "where id = ?";

        //検索実行
        Map<String, Object> employee = jdbcTemplate.queryForMap(query, id);

        return employee;
    }
}
