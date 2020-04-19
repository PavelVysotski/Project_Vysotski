package com.company.tables;

import java.util.Date;

public class Orders {

    private int id;
    private int customerId;
    private int computerId;
    private int count;
    private int totalCost;
    private Date createdAt;
    private Date updatedAt;

    public Orders(int id, int customerId, int computerId, int count, int totalCost, Date createdAt, Date updatedAt) {
        this.id = id;
        this.customerId = customerId;
        this.computerId = computerId;
        this.count = count;
        this.totalCost = totalCost;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    private Orders(int customerId, int computerId, int count, int totalCost) {
        this.customerId = customerId;
        this.computerId = computerId;
        this.count = count;
        this.totalCost = totalCost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getComputerId() {
        return computerId;
    }

    public void setComputerId(int computerId) {
        this.computerId = computerId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
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

    public static Orders createNewItemOrders(int customerId, int computerId, int count, int totalCost){
        return new Orders(customerId, computerId, count, totalCost);
    }

    @Override
    public String toString() {
        return id + ". " + customerId + " " + computerId + " " + count + " " + totalCost + " " + createdAt + " " + updatedAt;
    }
}
