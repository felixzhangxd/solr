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

import com.mmall.solr.po.Item;

@Repository
public class ItemDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public int save(final Item item) {
        final StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO item SET");
        sql.append(" shop_id=?");
        sql.append(",name=?");
        sql.append(",desc=?");
        sql.append(",price=?");
        sql.append(",last_time=?");
        KeyHolder keyHolder = new GeneratedKeyHolder();
        int affect = jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, item.getShopId());
                ps.setString(2, item.getName());
                ps.setString(3, item.getDesc());
                ps.setDouble(4, item.getPrice());
                ps.setTimestamp(5, item.getLastTime());
                return ps;
            }
        }, keyHolder);
        item.setId(keyHolder.getKey().intValue());
        return affect;
    }
}
