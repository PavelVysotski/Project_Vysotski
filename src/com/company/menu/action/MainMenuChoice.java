package com.company.menu.action;

import com.company.CommandReader;
import com.company.base.connection.JoinConnection;
import com.company.edit.base.DeleteChoice;
import com.company.edit.base.UpdateChoice;
import com.company.show.base.JoinChoice;
import com.company.show.base.ShowChoice;
import com.company.show.base.ShowAllDb;
import com.company.edit.base.AddChoice;

import java.sql.SQLException;

public class MainMenuChoice {

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
                    ShowChoice.show();
                    break;
                case 5:
                    JoinConnection.ChoiceInfo();
                    JoinChoice.join();
                    break;
                case 6:
                    AddChoice.addAction();
                    break;
                case 7:
                    UpdateChoice.update();
                    break;
                case 8:
                    DeleteChoice.delete();
                    break;
                case 9:
                    mainLoop = false;
                    break;
                default:
                    System.out.println("Такого номера нет, повторите Ваш выбор:");
            }
        }
    }
}
