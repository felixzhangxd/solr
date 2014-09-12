package com.mmall.solr.po;

import java.sql.Timestamp;

import org.apache.solr.common.SolrInputDocument;

public class Item {
    private Integer   id;
    private Integer   shopId;
    private String    name;
    private String    remark;
    private Double    price;
    private Boolean   isDeleted;
    private Timestamp lastTime;

    public Item() {}

    public Item(Integer id, Integer shopId, String name, String remark, Double price, Boolean isDeleted, Timestamp lastTime) {
        this.id = id;
        this.shopId = shopId;
        this.name = name;
        this.remark = remark;
        this.price = price;
        this.isDeleted = isDeleted;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Timestamp getLastTime() {
        return lastTime;
    }

    public void setLastTime(Timestamp lastTime) {
        this.lastTime = lastTime;
    }

    @Override
    public String toString() {
        return String.format("id:%s, shopId:%s, name:%s, remark:%s, price:%s, isDeleted:%s, lastTime:%s", this.id, this.shopId, this.name, this.remark, this.price, this.isDeleted, this.lastTime);
    }

    public SolrInputDocument toDocument() {
        final SolrInputDocument doc = new SolrInputDocument();
        doc.addField("id", this.id);
        doc.addField("shopId", this.shopId);
        doc.addField("name", this.name);
        doc.addField("remark", this.remark);
        doc.addField("price", this.price);
        doc.addField("last_time", this.lastTime);
        return doc;
    }
}
