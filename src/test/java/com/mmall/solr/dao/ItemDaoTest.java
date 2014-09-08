package com.mmall.solr.dao;

import java.sql.Timestamp;

import javax.annotation.Resource;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mmall.solr.po.Item;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring/applicationContext-*.xml")
public class ItemDaoTest {
    @Resource
    private ItemDao itemDao;

    @Test
    public void testSave() {
        int i = itemDao.save(new Item(null, 1,"沙发","三喜隆 多功能沙发床 皮艺沙发 折叠双人 带抽屉", 999.9D, new Timestamp(System.currentTimeMillis())));
        Assert.assertEquals(1, i);
    }
}
