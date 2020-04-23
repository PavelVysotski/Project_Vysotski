package com.company.show.base;

import com.company.CommandReader;
import com.company.base.connection.ComputersConnection;
import com.company.base.connection.CustomersConnection;
import com.company.base.connection.OrdersConnection;

import java.sql.SQLException;

public class ShowFromID {
    public static void showComputerFromId() throws SQLException {
        int compId = CommandReader.readNumber("Введите порядковый номер Компьютера к просмотру: ");
        System.out.println(ComputersConnection.selectFromId(compId));
    }

    public static void showCustomerFromId() throws SQLException {
        int customId = CommandReader.readNumber("Введите порядковый номер Заказчика: ");
        System.out.println(CustomersConnection.selectFromId(customId));
    }

    public static void showOrderFromId() throws SQLException {
        int orderId = CommandReader.readNumber("Введите порядковый номер Заказа: ");
        System.out.println(OrdersConnection.selectFromId(orderId));
    }
}
