package com.company.editBase;

import com.company.CommandReader;
import com.company.menuAction.MenuText;

public class UpdateChoice {
    public static void update() {
        boolean updateLoop = true;
        while (updateLoop) {
            MenuText.choiceUpdateMenu();
            int choiceUpdate = CommandReader.readNumber("Ваш выбор: ");
            switch (choiceUpdate) {
                case 1:
            }
        }

    }
}
