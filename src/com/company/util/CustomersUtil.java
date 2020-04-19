package com.company.util;

import com.company.tables.Customers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class CustomersUtil {
    public static Customers toObj(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String company = resultSet.getString("company");
        String contactPerson = resultSet.getString("contact_person");
        String phone = resultSet.getString("phone");
        Date createdAt = resultSet.getDate("created_at");
        Date updatedAt = resultSet.getDate("updated_at");

        return new Customers(id, company, contactPerson, phone, createdAt, updatedAt);
    }
}
