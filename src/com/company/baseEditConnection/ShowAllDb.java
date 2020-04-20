package com.company.baseEditConnection;

import com.company.tables.Computers;
import com.company.tables.Customers;
import com.company.tables.Orders;

import java.sql.SQLException;
import java.util.List;

public class ShowAllDb {
    public static void showAllComp() throws SQLException {
        List<Computers> result = ComputersConnection.selectAll();

        for ( Computers computers : result ) {
            System.out.println(computers);
        }
        System.out.println("--------------------------------");
    }

    public static void showAllCustom() throws SQLException {
        List<Customers> result = CustomersConnection.selectAll();

        for ( Customers customers : result ) {
            System.out.println(customers);
        }
        System.out.println("--------------------------------");
    }

    public static void showAllOrders() throws SQLException {
        List<Orders> result = OrdersConnection.selectAll();

        for ( Orders orders : result ) {
            System.out.println(orders);
        }
        System.out.println("--------------------------------");
    }
}


