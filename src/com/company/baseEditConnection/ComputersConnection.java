package com.company.baseEditConnection;

import com.company.tables.Computers;
import com.company.util.ComputersUtil;
import com.company.util.CurrentDateUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ComputersConnection {

    private static final String SELECT_ALL = "SELECT * FROM computers ORDER BY id ASC";
    private static final String SELECT_BY_ID = "SELECT * FROM computers WHERE id = ?";
    private static final String ADD = "INSERT INTO computers (option_numb, comp_type, processor, ram_gb, hdd_gb, ssd_gb, videocard, monitor_inch, price)" +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE computers SET option_numb = ?, comp_type = ?, processor = ?, ram_gb = ?, hdd_gb = ?, ssd_gb = ?, videocard = ?, " +
            "monitor_inch = ?, price = ?, updated_at = ? WHERE id = ?";
    private static final String DELETE_BY_ID = "DELETE FROM computers WHERE id = ?";

    public static List<Computers> selectAll() throws SQLException {
        List<Computers> result = new ArrayList<>();
        Connection connection = DbConnection.getConnection();
        try (
                PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
                ResultSet resultSet = statement.executeQuery();
        ) {
            while (resultSet.next()) {
                Computers computers = ComputersUtil.toObj(resultSet);
                result.add(computers);
            }
        }
        return result;
    }

    public static void add(Computers computers) throws SQLException {
        Connection connection = DbConnection.getConnection();
        try (
                PreparedStatement statement = connection.prepareStatement(ADD);
        ) {
            String optionNumb = computers.getOptionNumb();
            String compType = computers.getCompType();
            String processor = computers.getProcessor();
            int ramGb = computers.getRamGb();
            int hddGb = computers.getHddGb();
            int ssdGb = computers.getSsdGb();
            String videoCard = computers.getVideoCard();
            String monitorInch = computers.getMonitorInch();
            int price = computers.getPrice();

            statement.setString(1, optionNumb);
            statement.setString(2, compType);
            statement.setString(3, processor);
            statement.setInt(4, ramGb);
            statement.setInt(5, hddGb);
            statement.setInt(6, ssdGb);
            statement.setString(7, videoCard);
            statement.setString(8, monitorInch);
            statement.setInt(9, price);

            statement.executeUpdate();
        }
    }

    public static Computers selectFromId(int id) throws SQLException {
        Connection connection = DbConnection.getConnection();
        try (
                PreparedStatement statement = connection.prepareStatement(SELECT_BY_ID);
        ) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            Computers computers = ComputersUtil.toObj(resultSet);
            resultSet.close();
            return computers;
        }
    }

    public static void update(Computers computers) throws SQLException {
        Connection connection = DbConnection.getConnection();
        try (
                PreparedStatement statement = connection.prepareStatement(UPDATE);
        ) {
            statement.setString(1, computers.getOptionNumb());
            statement.setString(2, computers.getCompType());
            statement.setString(3, computers.getProcessor());
            statement.setInt(4, computers.getRamGb());
            statement.setInt(5, computers.getHddGb());
            statement.setInt(6, computers.getSsdGb());
            statement.setString(7, computers.getVideoCard());
            statement.setString(8, computers.getMonitorInch());
            statement.setInt(9, computers.getPrice());
            statement.setDate(10, new Date(CurrentDateUtil.currentUnixTimastamp()));
            statement.setInt(11, computers.getId());

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
