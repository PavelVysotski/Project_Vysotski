package com.company.editBase;

import com.company.CommandReader;
import com.company.baseConnection.ComputersConnection;
import com.company.baseConnection.CustomersConnection;
import com.company.baseConnection.OrdersConnection;
import com.company.menuAction.MenuText;
import com.company.showBase.ShowAllDb;
import com.company.showBase.ShowFromID;
import com.company.tables.Computers;
import com.company.tables.Customers;
import com.company.tables.Orders;

import java.sql.SQLException;

public class UpdateAction {

    public static void updateCompFromId() throws SQLException {

        int compNumb = CommandReader.readNumber("Введите порядковый номер компьютера: ");
        Computers computers = ComputersConnection.selectFromId(compNumb);
        String option = CommandReader.readString("Введите новый вариант конфигурации: ");
        computers.setOptionNumb(option);
        String type = CommandReader.readString("Введите новый тип компьютера(HOME, WORK, GAMER)");
        computers.setCompType(type);
        String processor = CommandReader.readString("Введите новую модель процессора: ");
        computers.setProcessor(processor);
        int ram = CommandReader.readNumber("Введите новый объем памяти: ");
        computers.setRamGb(ram);
        int hdd = CommandReader.readNumber("Введите новый объем жесткого диска: ");
        computers.setHddGb(hdd);
        int ssd = CommandReader.readNumber("Введите новый объем SSD: ");
        computers.setSsdGb(ssd);
        String video = CommandReader.readString("Ввведите новую модель видеокарты: ");
        computers.setVideoCard(video);
        String monitor = CommandReader.readString("Введите новую модель монитора: ");
        computers.setMonitorInch(monitor);
        int price = CommandReader.readNumber("Введите новую цену компьютера: ");
        computers.setPrice(price);
        ComputersConnection.update(computers);

    }

    public static void updateCompFromChoice() throws SQLException {
        boolean updateLoop = true;
        int compNumb = CommandReader.readNumber("Введите порядковый номер компьютера: ");
        Computers computers = ComputersConnection.selectFromId(compNumb);
        while (updateLoop) {
            MenuText.choiceUpdateComp();
            int updateChoice = CommandReader.readNumber("Ваш выбор: ");
            switch (updateChoice) {
                case 1:
                    String option = CommandReader.readString("Введите новый вариант конфигурации: ");
                    computers.setOptionNumb(option);
                    ComputersConnection.update(computers);
                    break;
                case 2:
                    String type = CommandReader.readString("Введите новый тип компьютера(HOME, WORK, GAMER):");
                    computers.setCompType(type);
                    ComputersConnection.update(computers);
                    break;
                case 3:
                    String processor = CommandReader.readString("Введите новую модель процессора: ");
                    computers.setProcessor(processor);
                    ComputersConnection.update(computers);
                    break;
                case 4:
                    int ram = CommandReader.readNumber("Введите новый объем памяти: ");
                    computers.setRamGb(ram);
                    ComputersConnection.update(computers);
                    break;
                case 5:
                    int hdd = CommandReader.readNumber("Введите новый объем жесткого диска: ");
                    computers.setHddGb(hdd);
                    ComputersConnection.update(computers);
                    break;
                case 6:
                    int ssd = CommandReader.readNumber("Введите новый объем SSD: ");
                    computers.setSsdGb(ssd);
                    ComputersConnection.update(computers);
                    break;
                case 7:
                    String video = CommandReader.readString("Ввведите новую модель видеокарты: ");
                    computers.setVideoCard(video);
                    ComputersConnection.update(computers);
                    break;
                case 8:
                    String monitor = CommandReader.readString("Введите новую модель монитора: ");
                    computers.setMonitorInch(monitor);
                    ComputersConnection.update(computers);
                    break;
                case 9:
                    int price = CommandReader.readNumber("Введите новую цену компьютера: ");
                    computers.setPrice(price);
                    ComputersConnection.update(computers);
                    break;
                case 10:
                    updateLoop = false;
                    continue;
                default:
                    System.out.println("Такого номера нет, повторите Ваш выбор:");
            }
        }
    }

    public static void updateCustomFromId() throws SQLException {
        int customNumb = CommandReader.readNumber("Введите порядковый номер заказчика: ");
        Customers customers = CustomersConnection.selectFromId(customNumb);
        String company = CommandReader.readString("Введите новое название компании: ");
        customers.setCompany(company);
        String contact = CommandReader.readString("Введите новое имя контактного лица: ");
        customers.setCompany(contact);
        String phone = CommandReader.readString("Введите новый телефон контактного лица: ");
        customers.setCompany(phone);
        CustomersConnection.update(customers);
    }

    public static void updateCustomFromChoice() throws SQLException {
        boolean updateLoop = true;
        int customNumb = CommandReader.readNumber("Введите порядковый номер заказчика: ");
        Customers customers = CustomersConnection.selectFromId(customNumb);
        while (updateLoop) {
            int updateChoice = CommandReader.readNumber("Ваш выбор: ");
            switch (updateChoice) {
                case 1:
                    String company = CommandReader.readString("Введите новое название компании: ");
                    customers.setCompany(company);
                    CustomersConnection.update(customers);
                    break;
                case 2:
                    String contact = CommandReader.readString("Введите новое имя контактного лица: ");
                    customers.setCompany(contact);
                    CustomersConnection.update(customers);
                    break;
                case 3:
                    String phone = CommandReader.readString("Введите новый телефон контактного лица: ");
                    customers.setCompany(phone);
                    CustomersConnection.update(customers);
                    break;
                default:
                    System.out.println("Такого номера нет, повторите Ваш выбор:");
            }
        }
    }

    public static void updateOrdersFromId() throws SQLException {
        int ordersNumb = CommandReader.readNumber("Ваш порядковый номер заказа: ");
        Orders orders = OrdersConnection.selectFromId(ordersNumb);
        int customer = CommandReader.readNumber("Введите новый номер заказчика из таблицы Заказчики:");
        orders.setCustomerId(customer);
        int computer = CommandReader.readNumber("Введите новый номер компьютера из таблица Компьютеры: ");
        orders.setComputerId(computer);
        int count = CommandReader.readNumber("Введите новыое количество приобретенных компьютеров: ");
        orders.setCount(count);
        int total_cost = CommandReader.readNumber("Введите новую сумму итого: ");
        orders.setTotalCost(total_cost);
        OrdersConnection.update(orders);
    }

    public static void updateOrdersFromChoice() throws SQLException {
        boolean updateLoop = true;
        int ordersNumb = CommandReader.readNumber("Ваш порядковый номер заказа: ");
        Orders orders = OrdersConnection.selectFromId(ordersNumb);
        while (updateLoop) {
            int updateChoice = CommandReader.readNumber("Ваш выбор");
            switch (updateChoice) {
                case 1:
                    int customer = CommandReader.readNumber("Введите новый номер заказчика из таблицы Заказчики:");
                    orders.setCustomerId(customer);
                    OrdersConnection.update(orders);
                    break;
                case 2:
                    int computer = CommandReader.readNumber("Введите новый номер компьютера из таблица Компьютеры: ");
                    orders.setComputerId(computer);
                    OrdersConnection.update(orders);
                    break;
                case 3:
                    int count = CommandReader.readNumber("Введите новое количество приобретенных компьютеров: ");
                    orders.setCount(count);
                    OrdersConnection.update(orders);
                    break;
                case 4:
                    int total_cost = CommandReader.readNumber("Введите новую сумму итого: ");
                    orders.setTotalCost(total_cost);
                    OrdersConnection.update(orders);
                    break;
                default:
                    System.out.println("Такого номера нет, повторите Ваш выбор:");
            }
        }
    }
}
