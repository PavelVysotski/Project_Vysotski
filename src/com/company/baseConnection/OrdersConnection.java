package com.company.baseConnection;

import com.company.tables.Orders;
import com.company.util.CurrentDateUtil;
import com.company.util.OrdersUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrdersConnection {

    private static final String SELECT_ALL = "SELECT * FROM orders ORDER BY id ASC";
    private static final String SELECT_BY_ID = "SELECT * FROM orders WHERE id = ?";
    private static final String ADD = "INSERT INTO orders (customer_id, computer_id, count, total_cost) VALUES (?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE orders SET customer_id = ?, computer_id = ?, count = ?, total_cost = ?, updated_at = ? WHERE id = ?";
    private static final String DELETE_BY_ID = "DELETE FROM orders WHERE id = ?";

    public static List<Orders> selectAll() throws SQLException {
        List<Orders> result = new ArrayList<>();
        Connection connection = DbConnection.getConnection();
        try (
                PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
                ResultSet resultSet = statement.executeQuery();
        ) {
            while (resultSet.next()) {
                Orders orders = OrdersUtil.toObj(resultSet);
                result.add(orders);
            }
        }
        return result;
    }

    public static void add(Orders orders) throws SQLException {
        Connection connection = DbConnection.getConnection();
        try (
                PreparedStatement statement = connection.prepareStatement(ADD);
        ) {
            int customerId = orders.getCustomerId();
            int computerId = orders.getComputerId();
            int count = orders.getCount();
            int totalCost = orders.getTotalCost();


            statement.setInt(1, customerId);
            statement.setInt(2, computerId);
            statement.setInt(3, count);
            statement.setInt(4, totalCost);

            statement.executeUpdate();
        }
    }

    public static Orders selectFromId(int id) throws SQLException {
        Connection connection = DbConnection.getConnection();
        try (
                PreparedStatement statement = connection.prepareStatement(SELECT_BY_ID);
        ) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            Orders orders = OrdersUtil.toObj(resultSet);
            resultSet.close();
            return orders;
        }
    }

    public static void update(Orders orders) throws SQLException {
        Connection connection = DbConnection.getConnection();
        try (
                PreparedStatement statement = connection.prepareStatement(UPDATE);
        ) {
            statement.setInt(1, orders.getCustomerId());
            statement.setInt(2, orders.getComputerId());
            statement.setInt(3, orders.getCount());
            statement.setInt(4, orders.getTotalCost());
            statement.setDate(5, new Date(CurrentDateUtil.currentUnixTimastamp()));
            statement.setInt(6, orders.getId());

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
