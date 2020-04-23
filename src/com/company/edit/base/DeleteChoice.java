package com.company.edit.base;

import com.company.CommandReader;
import com.company.menu.action.MenuText;

import java.sql.SQLException;

public class DeleteChoice {

    public static void delete() throws SQLException {
        boolean choiceLoop = true;
        while (choiceLoop) {
            MenuText.deleteMenu();
            int choiceDelete = CommandReader.readNumber("Ваш выбор: ");
            switch (choiceDelete) {
                case 1:
                    try {
                        DeleteAction.deleteComp();
                    } catch (SQLException e) {
                        System.out.println("----------------");
                        System.out.println("Необходимо сначала удалить данный компьютер из таблицы Заказов");
                        System.out.println("----------------");
                    }
                    break;
                case 2:
                    try{
                    DeleteAction.deleteCustom();}
                    catch (SQLException e) {
                        System.out.println("----------------");
                        System.out.println("Необходимо сначала удалить данного заказчика из таблицы Заказов");
                        System.out.println("----------------");
                    }
                    break;
                case 3:
                    DeleteAction.deleteOrders();
                    System.out.println("--------------------------------");
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
