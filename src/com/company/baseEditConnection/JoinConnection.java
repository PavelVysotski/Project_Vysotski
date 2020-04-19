package com.company.baseEditConnection;

import com.company.tables.Computers;
import com.company.util.ComputersUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JoinConnection {
    private static final String JOIN = "select customer_id, company, option_numb, count, total_cost from orders o join customers c on o.customer_id=c.id join computers comp on o.computer_id=comp.id";


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
}
