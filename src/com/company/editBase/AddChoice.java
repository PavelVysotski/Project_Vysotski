package com.company.editBase;

import com.company.CommandReader;
import com.company.baseConnection.ComputersConnection;
import com.company.menuAction.MenuText;
import com.company.tables.Computers;

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
                    break;
            }
        }
        MenuText.addMenu();
    }
}
