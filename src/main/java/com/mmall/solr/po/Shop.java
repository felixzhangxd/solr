package com.mmall.solr.po;

import java.sql.Timestamp;

import org.apache.solr.common.SolrInputDocument;

public class Shop {
    private Integer   id;
    private String    name;
    private String    address;
    private boolean   isDeleted;
    private Timestamp lastTime;

    public Shop() {}

    public Shop(Integer id, String name, String address, boolean isDeleted, Timestamp lastTime) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.isDeleted = isDeleted;
        this.lastTime = lastTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
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
        return String.format("id:%s, name:%s, address:%s, isDeleted:%s, lastTime:%s", this.id, this.name, this.address,this.isDeleted, this.lastTime);
    }

    public SolrInputDocument toDocument() {
        final SolrInputDocument doc = new SolrInputDocument();
        doc.addField("id", this.id);
        doc.addField("name", this.name);
        doc.addField("address", this.address);
        doc.addField("last_time", this.lastTime);
        return doc;
    }
}
