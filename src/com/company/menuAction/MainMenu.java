package com.company.menuAction;

import com.company.CommandReader;
import com.company.baseConnection.JoinConnection;
import com.company.baseConnection.ShowAllDb;
import com.company.editBase.AddChoice;

import java.sql.SQLException;

public class MainMenu {

    public static void worker() throws SQLException {
    boolean mainLoop = true;
        while (mainLoop) {
        MenuText.mainMenu();
        int mainChoice = CommandReader.readNumber("Ваш выбор:");
        System.out.println(mainChoice);

        switch (mainChoice) {
            case 1:
                ShowAllDb.showAllComp();
                break;
            case 2:
                ShowAllDb.showAllCustom();
                break;
            case 3:
                ShowAllDb.showAllOrders();
                break;
            case 4:
                JoinConnection.ChoiceInfo();
                JoinAction.join();
                break;
            case 5:
                AddChoice.addAction();
                break;
            case 8:
                mainLoop = false;
                break;
            default:
                System.out.println("Такого номера нет, повторите Ваш выбор:");
        }
        }
    }
}
