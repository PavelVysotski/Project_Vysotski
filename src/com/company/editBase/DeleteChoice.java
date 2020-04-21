package com.company.editBase;

import com.company.CommandReader;
import com.company.menuAction.MenuText;

import java.sql.SQLException;

public class DeleteChoice {

    public static void delete() throws SQLException {
        boolean choiceLoop = true;
        while (choiceLoop) {
            MenuText.deleteMenu();
            int choiceDelete = CommandReader.readNumber("Ваш выбор: ");
            switch (choiceDelete) {
                case 1:
                    DeleteAction.deleteComp();
                    break;
                case 2:
                    DeleteAction.deleteCustom();
                    break;
                case 3:
                    DeleteAction.deleteOrders();
                    break;
                case 4:
                    choiceLoop = false;
                    break;
                default:
                    System.out.println("Такого номера нет, повторите Ваш выбор:");
            }
        }
    }
}
