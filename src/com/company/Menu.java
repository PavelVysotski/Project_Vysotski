package com.company;

public class Menu {
    public static void mainMenu() {

        System.out.println("Введите номер необходимого действия");
        System.out.println("1. Посмотреть все данные таблицы Компьютеры");
        System.out.println("2. Посмотреть все данные таблицы Заказчики");
        System.out.println("3. Посмотреть все данные таблицы Заказы");
        System.out.println("4. Посмотреть сортировку данных");
        System.out.println("5. Изменить данные");
        System.out.println("6. Добавить данные");
        System.out.println("7. Удалить данные");
        System.out.println("8. Выход");
    }

    public static void joinMenu() {
        System.out.println("1. Показать какие компьютеры приобрел определенный заказчик.");
        System.out.println("2. Показать контактные данные заказчика.");
        System.out.println("3. Вернуться в главное меню.");
    }
}
