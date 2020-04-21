package com.company.menuAction;

import com.company.CommandReader;
import com.company.baseConnection.JoinConnection;
import com.company.editBase.DeleteChoice;
import com.company.editBase.UpdateChoice;
import com.company.showBase.JoinChoice;
import com.company.showBase.ShowChoice;
import com.company.showBase.ShowAllDb;
import com.company.editBase.AddChoice;

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
