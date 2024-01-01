package com.mywalletdatabase.mywalletdatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<User> getAll() {
        List<User> query = jdbcTemplate.query("SELECT * FROM user", BeanPropertyRowMapper.newInstance(User.class));
        return query;
    };
}
