package com.company.showBase;

import com.company.CommandReader;
import com.company.baseConnection.JoinConnection;
import com.company.menuAction.MenuText;

import java.sql.SQLException;

public class JoinAction {
    public static void join() throws SQLException {
        boolean joinLoop = true;
        while (joinLoop) {

            MenuText.joinMenu();
            int joinChoice = CommandReader.readNumber("Ваш выбор:");
            System.out.println(joinChoice);
            switch (joinChoice) {
                case 1:
                    JoinConnection.infoCompId();
                    break;
                case 2:
                    JoinConnection.infoCustomId();
                    break;
                case 3:
                    joinLoop = false;
                    break;
                default:
                    System.out.println("Такого номера нет, повторите Ваш выбор:");
            }
        }

    }
}
