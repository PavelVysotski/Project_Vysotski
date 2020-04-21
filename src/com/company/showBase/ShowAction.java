package com.company.showBase;

import com.company.CommandReader;
import com.company.baseConnection.ComputersConnection;
import com.company.baseConnection.JoinConnection;
import com.company.menuAction.MenuText;
import com.company.showBase.ShowFromID;

import java.sql.SQLException;

public class ShowAction {
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
                    continue;
                default:
                    System.out.println("Такого номера нет, повторите Ваш выбор:");
            }
        }
    }
}
