package com.company.editBase;

import com.company.CommandReader;
import com.company.baseConnection.ComputersConnection;
import com.company.baseConnection.CustomersConnection;
import com.company.baseConnection.OrdersConnection;
import com.company.tables.Computers;
import com.company.tables.Customers;
import com.company.tables.Orders;

import java.sql.SQLException;

public class AddAction {
    public static void addComputers() throws SQLException {

        String option = CommandReader.readString("Введите номер конфигурации: ");
        String processor = CommandReader.readString("Введите модель процессора: ");
        String type = CommandReader.readString("Введите тип компьютера (HOME, WORK, GAMER): ");
        int ram = CommandReader.readNumber("Введите объем памяти: ");
        int hdd = CommandReader.readNumber("Введите объем жесткого диска: ");
        int ssd = CommandReader.readNumber("Введите объем SSD: ");
        String video = CommandReader.readString("Введите модель видеокарты: ");
        String monitor = CommandReader.readString("Введите модель мониора и его размер: ");
        int price = CommandReader.readNumber("Введите цену за единицу: ");

        Computers computers = Computers.createNewItemComp(option, processor, type, ram, hdd, ssd, video, monitor, price);
        ComputersConnection.add(computers);

    }
    public static void addCustomers() throws SQLException {
        String company = CommandReader.readString("Введите название компании: ");
        String contact = CommandReader.readString("Введите контактное лицо: ");
        String phone = CommandReader.readString("Введите контактный телефон: ");

        Customers customers = Customers.createNewItemCustom(company, contact, phone);
        CustomersConnection.add(customers);
    }

    public static void addOrders() throws SQLException {
        int customer = CommandReader.readNumber("Введите порядковый номер Заказчика: ");
        int computer = CommandReader.readNumber("Введите порядковый номер конфигурации Компьютера: ");
        int count = CommandReader.readNumber("Введите количество закупленных Компьютеров: ");
        int total_cost = CommandReader.readNumber("Введите суму заказа итого: ");

        Orders orders = Orders.createNewItemOrders(customer, computer, count, total_cost);
        OrdersConnection.add(orders);
    }
}
