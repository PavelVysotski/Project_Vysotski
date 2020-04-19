package com.company;

//create at 17.04.2020 by Vysotski Pavel

import com.company.base.ComputersConnection;
import com.company.base.CustomersConnection;
import com.company.tables.Computers;
import com.company.tables.Customers;

import java.sql.*;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {

        //Добавляем новый объект в Computers
//        showAllComp();

//        Computers computers = Computers.createNewItemComp("Вариант 8", "Intel Core i3-6100", "HOME", 8, 1000, 0, "встроенная", "AOC 21.4", 730);
//        ComputersConnection.add(computers);

        //Добавляем новый объект в Customers
//        showAllCustom();
//        Customers customers = Customers.createNewItemCustom("ООО \"Парфюмстандарт\"", "Валера", "8-029-555-55-55");
//        CustomersConnection.add(customers);
//        showAllCustom();

        //показываем по ID в Computers
//        System.out.println(ComputersConnection.selectFromId(3));

        //показываем по ID в Customers
//        System.out.println(CustomersConnection.selectFromId(5));

        //Изменяем поле по ID в Computers
//        showAllComp();
//        Computers computers = ComputersConnection.selectFromId(8);
//        computers.setSsdGb(512);
//
//        ComputersConnection.update(computers);
//        showAllComp();

        //Изменяем поле по ID в Customers
//        showAllCustom();
//        Customers customers= CustomersConnection.selectFromId(5);
//        customers.setContactPerson("Андрей");
//
//        CustomersConnection.update(customers);
//        showAllCustom();

        //Удаляем строку в таблице в Computers
//        showAllComp();
//        ComputersConnection.deleteFromId(10);
//
//        showAllComp();

        //Удаляем строку в таблице в Computers
        showAllCustom();
        CustomersConnection.deleteFromId(5);

        showAllCustom();
    }

    public static void showAllComp() throws SQLException {
        List<Computers> result = ComputersConnection.selectAll();

        for ( Computers computers : result ) {
            System.out.println(computers);
        }

        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void showAllCustom() throws SQLException {
        List<Customers> result = CustomersConnection.selectAll();

        for ( Customers customers : result ) {
            System.out.println(customers);
        }

        System.out.println();
        System.out.println();
        System.out.println();
    }
}

