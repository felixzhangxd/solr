package com.mmall.solr.dao;

import java.sql.Timestamp;

import javax.annotation.Resource;

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
        itemDao.truncate();
        itemDao.save(new Item(1, 1, "飞利浦 刮胡刀", "格力 牛B的1P空调", 4999D, false, new Timestamp(System.currentTimeMillis())));
        itemDao.save(new Item(2, 1, "飞利浦 剃须刀", "格力 牛B的2P空调", 4999D, false, new Timestamp(System.currentTimeMillis())));
        itemDao.save(new Item(3, 1, "飞利浦 空调", "格力 牛B的3P空调", 4999D, false, new Timestamp(System.currentTimeMillis())));
        itemDao.save(new Item(4, 1, "飞利浦 电视机", "格力 牛B的4P空调", 4999D, false, new Timestamp(System.currentTimeMillis())));
    }
//    @Test
//    public void testModify() {
//        int i1 = itemDao.modify(new Item(2, 1, "空调", "大金 操蛋的空调", 4999D, true, new Timestamp(System.currentTimeMillis())));
//        Assert.assertEquals(1, i1);
//    }
}
