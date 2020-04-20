package com.company;

import com.company.baseConnection.JoinConnection;

import java.sql.SQLException;

public class JoinAction {
    public static void join() throws SQLException {
        boolean joinLoop = true;
        while (joinLoop) {

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
                    continue;

            }
        }

    }
}
