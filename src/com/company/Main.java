package com.company;

import com.company.baseConnection.JoinConnection;
import com.company.baseConnection.ShowAllDb;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {


        boolean mainLoop = true;
        while (mainLoop) {
            Menu.mainMenu();
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
                    Menu.joinMenu();
                    JoinAction.join();
                    break;
                case 8:
                    mainLoop=false;
                    break;
                default:
                    System.out.println("Такого номера нет, повторите Ваш выбор:");
            }
        }
    }

}
