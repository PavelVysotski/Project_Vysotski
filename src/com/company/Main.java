package com.company;

//create at 17.04.2020 by Vysotski Pavel

import com.company.base.ComputersConnection;
import com.company.tables.Computers;

import java.sql.*;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {

        //Добавляем новый объект
//        showAll();
//
//        Computers computers = Computers.createNewItem("Вариант 8", "Intel Core i3-6100", "HOME", 8, 1000, 0, "встроенная", "AOC 21.4", 730);
//        ComputersConnection.add(computers);
//
//        showAll();

        //показываем по ID
//        System.out.println(ComputersConnection.selectFromId(3));


        //Изменяем поле по ID
//        showAll();
//        Computers computers = ComputersConnection.selectFromId(8);
//        computers.setSsdGb(512);
//
//        ComputersConnection.update(computers);
//        showAll();

        //Удаляем строку в таблице
        showAll();
        ComputersConnection.deleteFromId(10);

        showAll();
    }

    public static void showAll() throws SQLException {
        List<Computers> result = ComputersConnection.selectAll();

        for ( Computers computers : result ) {
            System.out.println(computers);
        }

        System.out.println();
        System.out.println();
        System.out.println();
    }
}

