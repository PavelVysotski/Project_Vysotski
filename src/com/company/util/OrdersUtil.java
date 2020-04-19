package com.company.util;

import com.company.tables.Orders;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class OrdersUtil {
    public static Orders toObj(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        int customerId = resultSet.getInt("customer_id");
        int computerId = resultSet.getInt("computer_id");
        int count = resultSet.getInt("count");
        int totalCost = resultSet.getInt("total_cost");
        Date createdAt = resultSet.getDate("created_at");
        Date updatedAt = resultSet.getDate("updated_at");

        return new Orders(id, customerId, computerId, count, totalCost, createdAt, updatedAt);
    }
}
