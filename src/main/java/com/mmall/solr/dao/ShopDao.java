package com.mmall.solr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.mmall.solr.po.Shop;

@Repository
public class ShopDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public int save(final Shop shop) {
        final StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO shop SET");
        sql.append(" name=?");
        sql.append(",address=?");
        sql.append(",last_time=?");
        KeyHolder keyHolder = new GeneratedKeyHolder();
        int affect = jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, shop.getName());
                ps.setString(2, shop.getAddress());
                ps.setTimestamp(3, shop.getLastTime());
                return ps;
            }
        }, keyHolder);
        shop.setId(keyHolder.getKey().intValue());
        return affect;
    }
}
