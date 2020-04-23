package com.company.show.base;

import com.company.CommandReader;
import com.company.base.connection.JoinConnection;
import com.company.menu.action.MenuText;

import java.sql.SQLException;

public class JoinChoice {
    public static void join() throws SQLException {
        boolean joinLoop = true;
        while (joinLoop) {

            MenuText.joinMenu();
            int joinChoice = CommandReader.readNumber("Ваш выбор:");
            System.out.println(joinChoice);
            switch (joinChoice) {
                case 1:
                    JoinConnection.infoCompId();
                    System.out.println("--------------------------------");
                    break;
                case 2:
                    JoinConnection.infoCustomId();
                    System.out.println("--------------------------------");
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
