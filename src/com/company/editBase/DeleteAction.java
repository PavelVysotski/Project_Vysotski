package com.company.editBase;

import com.company.CommandReader;
import com.company.baseConnection.ComputersConnection;
import com.company.baseConnection.CustomersConnection;
import com.company.baseConnection.OrdersConnection;
import com.company.showBase.ShowAllDb;

import java.sql.SQLException;

public class DeleteAction {
    public static void deleteComp() throws SQLException {
        ShowAllDb.showAllComp();
        int compId = CommandReader.readNumber("Введите порядковый номер компьютера, который небходимо удалить: ");
        ComputersConnection.deleteFromId(compId);
    }

    public static void deleteCustom() throws SQLException {
        ShowAllDb.showAllCustom();
        int customId = CommandReader.readNumber("Введите порядковый номер заказчика, который небходимо удалить: ");
      CustomersConnection.deleteFromId(customId);
    }

    public static void deleteOrders() throws SQLException {
        ShowAllDb.showAllOrders();
        int ordersId = CommandReader.readNumber("Введите порядковый номер заказа, который небходимо удалить: ");
        OrdersConnection.deleteFromId(ordersId);
    }
}
