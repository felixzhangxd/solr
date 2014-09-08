package com.mmall.solr.po;

import java.sql.Timestamp;

import org.apache.solr.common.SolrInputDocument;

public class Item {
    private Integer   id;
    private Integer   shopId;
    private String    name;
    private String    desc;
    private Double    price;
    private Timestamp lastTime;

    public Item() {}

    public Item(Integer id, Integer shopId, String name, String desc, Double price, Timestamp lastTime) {
        this.id = id;
        this.shopId = shopId;
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.lastTime = lastTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Timestamp getLastTime() {
        return lastTime;
    }

    public void setLastTime(Timestamp lastTime) {
        this.lastTime = lastTime;
    }

    @Override
    public String toString() {
        return String.format("id:%s, shopId:%s, name:%s, desc:%s, price:%s, lastTime:%s", this.id, this.shopId, this.name, this.desc, this.price,
                this.lastTime);
    }

    public SolrInputDocument toDocument() {
        final SolrInputDocument doc = new SolrInputDocument();
        doc.addField("id", this.id);
        doc.addField("shopId", this.shopId);
        doc.addField("name", this.name);
        doc.addField("desc", this.desc);
        doc.addField("price", this.price);
        doc.addField("last_time", this.lastTime);
        return doc;
    }
}
