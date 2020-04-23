package com.company.base.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JoinConnection {
    private static final String JOIN = "select customer_id, company, option_numb, count, total_cost from orders o join customers c on o.customer_id=c.id join computers comp on o.computer_id=comp.id";
    private static final String JOIN_COMP_ID = "select option_numb, comp_type, processor, ram_gb, hdd_gb, ssd_gb, videocard, monitor_inch from computers comp join orders o on o.computer_id=comp.id";
    private static final String JOIN_CUSTOM_ID = "select company, contact_person, phone from customers c join orders o on o.customer_id=c.id";

    public static void ChoiceInfo() throws SQLException {
        Connection connection = DbConnection.getConnection();
        try (
                PreparedStatement statement = connection.prepareStatement(JOIN);
                ResultSet resultSet = statement.executeQuery();
        ) {
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("customer_id") + ". " + resultSet.getString("company") + ", " +
                        resultSet.getString("option_numb") + ", " + resultSet.getInt("count") + ", " + resultSet.getInt("total_cost"));
            }
        }
    }

    public static void infoCompId() throws SQLException {
        Connection connection = DbConnection.getConnection();
        try (
                PreparedStatement statement = connection.prepareStatement(JOIN_COMP_ID);
                ResultSet resultSet = statement.executeQuery();
        ) {
            while (resultSet.next()) {
                System.out.println(resultSet.getString("option_numb") + ", " + resultSet.getString("comp_type") + ", " + resultSet.getString("processor")
                        + ", " + resultSet.getInt("ram_gb") + ", " + resultSet.getInt("hdd_gb") + ", " + resultSet.getInt("ssd_gb")
                        + ", " + resultSet.getString("Videocard") + ", " + resultSet.getString("monitor_inch"));
            }
        }
    }

    public static void infoCustomId() throws SQLException {
        Connection connection = DbConnection.getConnection();
        try (
                PreparedStatement statement = connection.prepareStatement(JOIN_CUSTOM_ID);
                ResultSet resultSet = statement.executeQuery();
        ) {
            while (resultSet.next()) {
                System.out.println(resultSet.getString("company") + ", " + resultSet.getString("contact_person") + ", " + resultSet.getString("phone"));
            }
        }
    }
}
