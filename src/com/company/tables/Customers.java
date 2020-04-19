package com.company.tables;

import java.util.Date;

public class Customers {

    private int id;
    private String company;
    private String contactPerson;
    private String phone;
    private Date createdAt;
    private Date updatedAt;

    public Customers(int id, String company, String contactPerson, String phone, Date createdAt, Date updatedAt) {
        this.id = id;
        this.company = company;
        this.contactPerson = contactPerson;
        this.phone = phone;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Customers(String company, String contactPerson, String phone) {
        this.company = company;
        this.contactPerson = contactPerson;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public static Customers createNewItemCustom(String company, String contactPerson, String phone){
        return new Customers(company, contactPerson, phone);
    }

    @Override
    public String toString() {
        return id + ". Компания: " + company + ", контакное лицо: " + contactPerson + ", телефон: " + phone + ", " + createdAt + ", " + updatedAt;
    }

}
