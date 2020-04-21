package com.company.editBase;

import com.company.CommandReader;
import com.company.menuAction.MenuText;

import java.sql.SQLException;

public class UpdateCompChoice {
    public static void choiceUpdate() throws SQLException {
        boolean choiceLoop = true;
        while (choiceLoop) {
            MenuText.choiceUpdateCompMenu();
            int choiceUpdate = CommandReader.readNumber("Ваш выбор: ");
            switch (choiceUpdate) {
                case 1:
                    UpdateAction.updateCompFromId();
                    break;
                case 2:
                    UpdateAction.updateCompFromChoice();
                    break;
                case 3:
                    choiceLoop = false;
                    break;
                default:
                    System.out.println("Такого номера нет, повторите Ваш выбор:");
            }
        }
    }
}
