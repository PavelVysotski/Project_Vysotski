package com.company.menu.action;

public class MenuText {
    public static void mainMenu() {

        System.out.println("Введите номер необходимого действия.");
        System.out.println("1. Посмотреть все данные таблицы Компьютеры.");
        System.out.println("2. Посмотреть все данные таблицы Заказчики.");
        System.out.println("3. Посмотреть все данные таблицы Заказы.");
        System.out.println("4. Посмотреть данные по выбору.");
        System.out.println("5. Посмотреть сортировку данных.");
        System.out.println("6. Добавить новые данные.");
        System.out.println("7. Изменить данные по запросу.");
        System.out.println("8. Удалить данные по запросу.");
        System.out.println("9. Выход.");
    }

    public static void joinMenu() {
        System.out.println("1. Показать какие компьютеры приобрел каждый заказчик.");
        System.out.println("2. Показать контактные данные заказчика.");
        System.out.println("3. Вернуться в главное меню.");
    }

    public static void addMenu(){
        System.out.println("1. Добавить новую конфигруацию Компьютера.");
        System.out.println("2. Добавить нового Заказчика.");
        System.out.println("3. Добавить новые данные в Заказы.");
        System.out.println("4. Вернуться в главное меню.");
    }

    public static void showMenu(){
        System.out.println("1. Показать Компьютер по порядковому номеру.");
        System.out.println("2. Показать Заказчика по порядковому номеру.");
        System.out.println("3. Показать Заказ по порядковому номеру.");
        System.out.println("4. Вернуться в главное меню.");
    }
    public static void updateMenu(){
        System.out.println("1. Изменить данные в Компьютерах.");
        System.out.println("2. Изменить данные в Заказчиках.");
        System.out.println("3. Изменить данные в Заказах.");
        System.out.println("4. Вернуться в главное меню.");
    }

    public static void choiceUpdateCompMenu() {
        System.out.println("1. Изменить все данные по порядковому номеру компьютера.");
        System.out.println("2. Изменить выборочные данные по порядковому номеру компьютера.");
        System.out.println("3. Вернуться в главное меню.");

    }

    public static void choiceUpdateComp(){
        System.out.println("1. Изменить вариант конфигурации.");
        System.out.println("2. Изменить тип компьютера.");
        System.out.println("3. Изменить модель процессора.");
        System.out.println("4. Изменить объем памяти.");
        System.out.println("5. Изменить объем жесткого диска.");
        System.out.println("6. Изменить объем SSD.");
        System.out.println("7. Изменить модель видеокарты.");
        System.out.println("8. Изменить модель монитора.");
        System.out.println("9. Изменить стоимость компьютера.");
        System.out.println("10. Вернуться в главное меню.");
    }

    public static void choiceUpdateCustomMenu (){
        System.out.println("1. Изменить все данные по порядковому номеру заказчика.");
        System.out.println("2. Изменить выборочные данные по порядковому номеру заказчика.");
        System.out.println("3. Вернуться в главное меню.");
    }

    public static void choiceUpdateCustom () {
        System.out.println("1. Изменить название компании.");
        System.out.println("2. Изменить контактное лицо.");
        System.out.println("3. Изменить контактный телефон.");
        System.out.println("4. Вернуться в главное меню.");

    }

    public static void choiceUpdateOrdersMenu (){
        System.out.println("1. Изменить все данные по порядковому номеру заказа.");
        System.out.println("2. Изменить выборочные данные по порядковому номеру заказа.");
        System.out.println("3. Вернуться в главное меню.");
    }

    public static void choiceUpdateOrders () {
        System.out.println("1. Изменить номер заказчика.");
        System.out.println("2. Изменить вариант компьютера.");
        System.out.println("3. Изменить количество приобретенных компьютеров.");
        System.out.println("4. Изменить сумму итого.");
        System.out.println("5. Вернуться в главное меню.");
    }

    public static void deleteMenu () {
        System.out.println("1. Удалить компьютер из таблицы Компьютеры по порядковому номеру.");
        System.out.println("2. Удалить заказчика из таблицы Заказчики по порядковому номеру.");
        System.out.println("3. Удалить заказ из таблицы Заказы по порядковому номеру.");
        System.out.println("4. Вернуться в главное меню.");
    }
}
