package com.company.editBase;

import com.company.CommandReader;
import com.company.baseConnection.ComputersConnection;
import com.company.baseConnection.CustomersConnection;
import com.company.showBase.ShowAllDb;
import com.company.menuAction.MenuText;

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
