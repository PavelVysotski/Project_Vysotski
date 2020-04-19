package com.company.tables;

import java.util.Date;
import java.util.Objects;

public class Computers {
    private int id;
    private String optionNumb;
    private String compType;
    private String processor;
    private int ramGb;
    private int hddGb;
    private int ssdGb;
    private String videoCard;
    private String monitorInch;
    private int price;
    private Date createdAt;
    private Date updatedAt;

    public Computers(int id, String optionNumb, String compType, String processor, int ramGb, int hddGb, int ssdGb,
                     String videoCard, String monitorInch, int price, Date createdAt, Date updatedAt) {
        this.id = id;
        this.optionNumb = optionNumb;
        this.processor = compType;
        this.compType = processor;
        this.ramGb = ramGb;
        this.hddGb = hddGb;
        this.ssdGb = ssdGb;
        this.videoCard = videoCard;
        this.monitorInch = monitorInch;
        this.price = price;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    private Computers(String optionNumb, String compType, String processor, int ramGb, int hddGb, int ssdGb, String videoCard, String monitorInch, int price) {
        this.optionNumb = optionNumb;
        this.processor = compType;
        this.compType = processor;
        this.ramGb = ramGb;
        this.hddGb = hddGb;
        this.ssdGb = ssdGb;
        this.videoCard = videoCard;
        this.monitorInch = monitorInch;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOptionNumb() {
        return optionNumb;
    }

    public void setOptionNumb(String optionNumb) {
        this.optionNumb = optionNumb;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getCompType() {
        return compType;
    }

    public void setCompType(String compType) {
        this.compType = compType;
    }

    public int getRamGb() {
        return ramGb;
    }

    public void setRamGb(int ramGb) {
        this.ramGb = ramGb;
    }

    public int getHddGb() {
        return hddGb;
    }

    public void setHddGb(int hddGb) {
        this.hddGb = hddGb;
    }

    public int getSsdGb() {
        return ssdGb;
    }

    public void setSsdGb(int ssdGb) {
        this.ssdGb = ssdGb;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public String getMonitorInch() {
        return monitorInch;
    }

    public void setMonitorInch(String monitorInch) {
        this.monitorInch = monitorInch;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public static Computers createNewItemComp(String optionNumb, String compType, String processor, int ramGb, int hddGb, int ssdGb,
                                              String videoCard, String monitorInch, int price) {
        return new Computers(optionNumb, compType, processor, ramGb, hddGb, ssdGb, videoCard, monitorInch, price);
    }

    @Override
    public String toString() {
        return id + ". Характеристики комп: " + optionNumb + ", тип: " + compType + ", проц.:" + processor + ", память: " + ramGb + ", HDD: " + hddGb + ", SSD: " +
                ssdGb + ", видео: " + videoCard + ", монитор: " + monitorInch + ", цена: " + price + ", " + createdAt + ", " + updatedAt;
    }

}

