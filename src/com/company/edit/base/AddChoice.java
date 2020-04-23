package com.company.edit.base;

import com.company.CommandReader;
import com.company.base.connection.ComputersConnection;
import com.company.base.connection.CustomersConnection;
import com.company.show.base.ShowAllDb;
import com.company.menu.action.MenuText;

import java.sql.SQLException;

public class AddChoice {
    public static void addAction() throws SQLException {
        boolean addLoop = true;
        while (addLoop) {
            MenuText.addMenu();
            int addChoice = CommandReader.readNumber("Ваш выбор:");
            System.out.println(addChoice);
            switch (addChoice) {
                case 1:
                    AddAction.addComputers();
                    ComputersConnection.selectAll();
                    System.out.println("--------------------------------");
                    break;
                case 2:
                    AddAction.addCustomers();
                    CustomersConnection.selectAll();
                    System.out.println("--------------------------------");
                    break;
                case 3:
                    ShowAllDb.showAllComp();
                    ShowAllDb.showAllCustom();
                    AddAction.addOrders();
                    System.out.println("--------------------------------");
                    break;
                case 4:
                    addLoop = false;
                    break;
                default:
                    System.out.println("Такого номера нет, повторите Ваш выбор:");
            }
        }
    }
}
