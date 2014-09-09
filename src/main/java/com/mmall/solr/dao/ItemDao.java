package com.mmall.solr.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mmall.solr.po.Item;

@Repository
public class ItemDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public int save(final Item item) {
        final StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO item SET");
        sql.append(" id=?");
        sql.append(",shop_id=?");
        sql.append(",name=?");
        sql.append(",remark=?");
        sql.append(",price=?");
        sql.append(",is_deleted=?");
        sql.append(",last_time=?");
        Object[] args = new Object[]{item.getId(),item.getShopId(), item.getName(),item.getRemark(), item.getPrice(), item.getIsDeleted(), item.getLastTime()};
        return jdbcTemplate.update(sql.toString(), args);
    }
    
    public int modify(final Item item) {
        final StringBuilder sql = new StringBuilder();
        sql.append("UPDATE item SET");
        sql.append(" shop_id=?");
        sql.append(",name=?");
        sql.append(",remark=?");
        sql.append(",price=?");
        sql.append(",is_deleted=?");
        sql.append(",last_time=?");
        sql.append(" WHERE id=?");
        Object[] args = new Object[]{item.getShopId(), item.getName(),item.getRemark(), item.getPrice(), item.getIsDeleted(), item.getLastTime(),item.getId()};
        return jdbcTemplate.update(sql.toString(), args);
    }
}
