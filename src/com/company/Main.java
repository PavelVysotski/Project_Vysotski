package com.company;

//create at 17.04.2020 by Vysotski Pavel

import com.company.baseEditConnection.*;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
                ShowAllDb.showAllComp();
        //Добавляем новый объект в Computers
//        ShowAllDb.showAllComp();

//        Computers computers = Computers.createNewItemComp("Вариант 8", "Intel Core i3-6100", "HOME", 8, 1000, 0, "встроенная", "AOC 21.4", 730);
//        ComputersConnection.add(computers);

        //показываем по ID в Computers
//        System.out.println(ComputersConnection.selectFromId(3));

        //Изменяем поле по ID в Computers
//        showAllComp();
//        Computers computers = ComputersConnection.selectFromId(8);
//        computers.setSsdGb(512);
//
//        ComputersConnection.update(computers);
//        showAllComp();

        //Удаляем строку в таблице в Computers
//        showAllComp();
//        ComputersConnection.deleteFromId(10);
//
//        showAllComp();

        //Добавляем новый объект в Customers
//        showAllCustom();
//        Customers customers = Customers.createNewItemCustom("ООО \"Парфюмстандарт\"", "Валера", "8-029-555-55-55");
//        CustomersConnection.add(customers);
//        showAllCustom();

        //показываем по ID в Customers
//        System.out.println(CustomersConnection.selectFromId(5));

        //Изменяем поле по ID в Customers
//        showAllCustom();
//        Customers customers= CustomersConnection.selectFromId(5);
//        customers.setContactPerson("Андрей");
//
//        CustomersConnection.update(customers);
//        showAllCustom();

        //Удаляем строку в таблице в Customers
//        showAllCustom();
//        CustomersConnection.deleteFromId(10);
//
//        showAllCustom();


        //Добавляем новый объект в Orders
//        showAllOrders();
//        Orders orders = Orders.createNewItemOrders(4, 6, 8, 31200);
//        OrdersConnection.add(orders);
//        showAllOrders();

        //показываем по ID в Orders
//        System.out.println(OrdersConnection.selectFromId(5));

        //Изменяем поле по ID в Orders
//        showAllOrders();
//        Orders orders= OrdersConnection.selectFromId(5);
//        orders.setComputerId(5);
//
//        OrdersConnection.update(orders);
//        showAllOrders();

        //Удаляем строку в таблице в Orders
//        showAllOrders();
//        OrdersConnection.deleteFromId(5);

//        showAllOrders();

        //Выводим Join
//        JoinConnection.ChoiceInfo();
//        JoinConnection.infoCompId();
//        JoinConnection.infoCustomId();
    }
}

