package com.company.show.base;

import com.company.CommandReader;
import com.company.menu.action.MenuText;

import java.sql.SQLException;

public class ShowChoice {
    public static void show() throws SQLException {
        boolean showLoop = true;
        while (showLoop) {

            MenuText.showMenu();
            int showChoice = CommandReader.readNumber("Ваш выбор:");
            System.out.println(showChoice);
            switch (showChoice) {
                case 1:
                    ShowFromID.showComputerFromId();
                    System.out.println("-----------------");
                    break;
                case 2:
                    ShowFromID.showCustomerFromId();
                    System.out.println("-----------------");
                    break;
                case 3:
                    ShowFromID.showOrderFromId();
                    System.out.println("-----------------");
                    break;
                case 4:
                    showLoop = false;
                    break;
                default:
                    System.out.println("Такого номера нет, повторите Ваш выбор:");
            }
        }
    }
}
