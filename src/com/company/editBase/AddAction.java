package com.company.editBase;

import com.company.CommandReader;
import com.company.baseConnection.ComputersConnection;
import com.company.tables.Computers;

import java.sql.SQLException;

public class AddAction {
    public static void addComputers() throws SQLException {

        String option = CommandReader.readString("Введите номер конфигурации:");
        String processor = CommandReader.readString("Введите модель процессора:");
        String type = CommandReader.readString("Введите тип компьютера (HOME, WORK, GAMER):");
        int ram = CommandReader.readNumber("Введите объем памяти:");
        int hdd = CommandReader.readNumber("Введите объем жесткого диска:");
        int ssd = CommandReader.readNumber("Введите объем SSD:");
        String video = CommandReader.readString("Введите модель видеокарты");
        String monitor = CommandReader.readString("Введите модель мониора и его размер");
        int price = CommandReader.readNumber("Введите цену за единицу");

        Computers computers = Computers.createNewItemComp(option, processor, type, ram, hdd, ssd, video, monitor, price);
        ComputersConnection.add(computers);
    }
}
