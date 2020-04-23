package com.company.edit.base;

import com.company.CommandReader;
import com.company.menu.action.MenuText;
import com.company.show.base.ShowAllDb;

import java.sql.SQLException;

public class UpdateChoice {
    public static void update() throws SQLException {
        boolean updateLoop = true;
        while (updateLoop) {
            MenuText.updateMenu();
            int choiceUpdate = CommandReader.readNumber("Ваш выбор: ");
            switch (choiceUpdate) {
                case 1:
                    UpdateCompChoice.choiceUpdate();
                    System.out.println("-----------------");
                    ShowAllDb.showAllComp();
                    break;
                case 2:
                    UpdateCustomChoice.choiceUpdate();
                    System.out.println("-----------------");
                    ShowAllDb.showAllCustom();
                    break;
                case 3:
                    UpdateOrdersChoice.choiceUpdate();
                    System.out.println("-----------------");
                    ShowAllDb.showAllOrders();
                    break;
                case 4:
                    updateLoop = false;
                    break;
                default:
                    System.out.println("Такого номера нет, повторите Ваш выбор:");
            }
        }
    }
}
