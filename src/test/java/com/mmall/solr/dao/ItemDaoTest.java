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
        int i=5;
        while(true) {
            itemDao.save(new Item(i, 1, "沙发", "三喜隆 多功能沙发床 皮艺沙发 折叠双人 带抽屉", 999.99D, false, new Timestamp(System.currentTimeMillis())));
            i++;
        }
//        Assert.assertEquals(1, i1);
//        int i2 = itemDao.save(new Item(2, 1, "空调", "大金 操蛋的空调", 4999D, false, new Timestamp(System.currentTimeMillis())));
//        Assert.assertEquals(1, i2);
//        int i3 = itemDao.save(new Item(3, 1, "电脑", "神舟笔记本超牛", 3999D, false, new Timestamp(System.currentTimeMillis())));
//        Assert.assertEquals(1, i3);
//        int i4 = itemDao.save(new Item(4, 1, "电视机", "海信电视机就是牛B", 3999D, false, new Timestamp(System.currentTimeMillis())));
//        Assert.assertEquals(1, i4);
    }
//    @Test
//    public void testModify() {
//        int i1 = itemDao.modify(new Item(2, 1, "空调", "大金 操蛋的空调", 4999D, true, new Timestamp(System.currentTimeMillis())));
//        Assert.assertEquals(1, i1);
//    }
}
