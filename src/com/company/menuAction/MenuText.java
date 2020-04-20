package com.company.menuAction;

public class MenuText {
    public static void mainMenu() {

        System.out.println("Введите номер необходимого действия");
        System.out.println("1. Посмотреть все данные таблицы Компьютеры");
        System.out.println("2. Посмотреть все данные таблицы Заказчики");
        System.out.println("3. Посмотреть все данные таблицы Заказы");
        System.out.println("4. Посмотреть сортировку данных");
        System.out.println("5. Добавить новые данные");
        System.out.println("6. Изменить данные");
        System.out.println("7. Удалить данные");
        System.out.println("8. Выход");
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
        System.out.println("4. Вернуться в глаыное меню.");
    }

}
