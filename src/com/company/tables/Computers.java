package com.company.tables;

import java.util.Date;
import java.util.Objects;

public class Computers {
    private int id;
    private String optionNumb;
    private String processor;
    private String compType;
    private int ramGb;
    private int hddGb;
    private int ssdGb;
    private String videoCard;
    private String monitorInch;
    private int price;
    private Date createdAt;
    private Date updatedAt;

    public Computers(int id, String optionNumb, String processor, String compType, int ramGb, int hddGb, int ssdGb,
                     String videoCard, String monitorInch, int price, Date createdAt, Date updatedAt) {
        this.id = id;
        this.optionNumb = optionNumb;
        this.processor = processor;
        this.compType = compType;
        this.ramGb = ramGb;
        this.hddGb = hddGb;
        this.ssdGb = ssdGb;
        this.videoCard = videoCard;
        this.monitorInch = monitorInch;
        this.price = price;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    private Computers(String optionNumb, String processor, String compType, int ramGb, int hddGb, int ssdGb, String videoCard, String monitorInch, int price) {
        this.optionNumb = optionNumb;
        this.processor = processor;
        this.compType = compType;
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

public static Computers createNewItem(String optionNumb, String processor, String compType, int ramGb, int hddGb, int ssdGb,
                                      String videoCard, String monitorInch, int price){
        return new Computers(optionNumb, processor, compType, ramGb, hddGb, ssdGb, videoCard, monitorInch, price);
}

    @Override
    public String toString() {
        return id + ". " + optionNumb + " " + processor + " " + compType + " " + ramGb + " " + hddGb + " " +
                ssdGb + " " + videoCard + " " + monitorInch + " " + price + " " + createdAt + " " + updatedAt;
    }



}

