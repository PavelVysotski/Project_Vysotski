package com.company.base;

import com.company.tables.Customers;
import com.company.util.CurrentDateUtil;
import com.company.util.CustomersUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomersConnection {

    private static final String SELECT_ALL = "SELECT * FROM customers ORDER BY id ASC";
    private static final String SELECT_BY_ID = "SELECT * FROM customers WHERE id = ?";
    private static final String ADD = "INSERT INTO customers (company, contact_person, phone) VALUES (?, ?, ?)";
    private static final String UPDATE = "UPDATE customers SET company = ?, contact_person = ?, phone = ?, updated_at = ? WHERE id = ?";
    private static final String DELETE_BY_ID = "DELETE FROM customers WHERE id = ?";

    public static List<Customers> selectAll() throws SQLException {
        List<Customers> result = new ArrayList<>();
        Connection connection = DbConnection.getConnection();
        try (
                PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
                ResultSet resultSet = statement.executeQuery();
        ) {
            while (resultSet.next()) {
                Customers customers = CustomersUtil.toObj(resultSet);
                result.add(customers);
            }
        }
        return result;
    }

    public static void add(Customers customers) throws SQLException {
        Connection connection = DbConnection.getConnection();
        try (
                PreparedStatement statement = connection.prepareStatement(ADD);
        ) {
            String company = customers.getCompany();
            String contactPerson = customers.getContactPerson();
            String phone = customers.getPhone();

            statement.setString(1, company);
            statement.setString(2, contactPerson);
            statement.setString(3, phone);

            statement.executeUpdate();
        }
    }

    public static Customers selectFromId(int id) throws SQLException {
        Connection connection = DbConnection.getConnection();
        try (
                PreparedStatement statement = connection.prepareStatement(SELECT_BY_ID);
        ) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            Customers customers = CustomersUtil.toObj(resultSet);
            resultSet.close();
            return customers;
        }
    }

    public static void update(Customers customers) throws SQLException {
        Connection connection = DbConnection.getConnection();
        try (
                PreparedStatement statement = connection.prepareStatement(UPDATE);
        ) {
            statement.setString(1, customers.getCompany());
            statement.setString(2, customers.getContactPerson());
            statement.setString(3, customers.getPhone());
            statement.setDate(4, new Date(CurrentDateUtil.currentUnixTimastamp()));
            statement.setInt(5, customers.getId());

            statement.executeUpdate();
        }
    }

    public static void deleteFromId(int id) throws SQLException {
        Connection connection = DbConnection.getConnection();
        try (
                PreparedStatement statement = connection.prepareStatement(DELETE_BY_ID);
        ) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
}


