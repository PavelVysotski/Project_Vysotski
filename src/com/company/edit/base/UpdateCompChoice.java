package com.company.edit.base;

import com.company.CommandReader;
import com.company.menu.action.MenuText;

import java.sql.SQLException;

public class UpdateCompChoice {
    public static void choiceUpdate() throws SQLException {
        boolean choiceLoop = true;
        while (choiceLoop) {
            MenuText.choiceUpdateCompMenu();
            int choiceUpdate = CommandReader.readNumber("Ваш выбор: ");
            switch (choiceUpdate) {
                case 1:
                    try {
                        UpdateAction.updateCompFromId();
                    } catch (SQLException e) {
                        System.out.println("----------------");
                        System.out.println("Вариант конфигурации не должен повторяться, повторите ввод:");
                        System.out.println("----------------");
                    }
                    break;
                case 2:
                    try {
                        UpdateAction.updateCompFromChoice();
                    } catch (SQLException e) {
                        System.out.println("----------------");
                        System.out.println("Вариант конфигурации не должен повторяться, повторите ввод:");
                        System.out.println("----------------");
                    }
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
