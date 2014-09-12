package com.mmall.solr.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mmall.solr.po.Shop;

@Repository
public class ShopDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public int save(final Shop shop) {
        final StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO shop SET");
        sql.append(" id=?");
        sql.append(",name=?");
        sql.append(",address=?");
        sql.append(",is_deleted=?");
        sql.append(",last_time=?");
        Object[] args = new Object[]{shop.getId(), shop.getName(), shop.getAddress(), shop.getIsDeleted(), shop.getLastTime()};
        return jdbcTemplate.update(sql.toString(), args);
    }
}
