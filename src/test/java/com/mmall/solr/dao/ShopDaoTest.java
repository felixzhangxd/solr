package com.mmall.solr.dao;

import java.sql.Timestamp;

import javax.annotation.Resource;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mmall.solr.po.Shop;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring/applicationContext-*.xml")
public class ShopDaoTest {
    @Resource
    private ShopDao shopDao;

    @Test
    public void testSave() {
        int i = shopDao.save(new Shop(1, "红星美凯龙星易家线下折扣馆", "普陀区真北路1263号新长征商务大厦17楼",false, new Timestamp(System.currentTimeMillis())));
        Assert.assertEquals(1, i);
    }
}
