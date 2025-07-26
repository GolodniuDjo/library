package org.example;

import model.Book;

public class Main {

    /** ----- Идем в метод Main ----- **/
    public static void main(String[] args) {
        // Создаем объект класса Book
        Book voinaImir = new Book("Война и мир", "Лев Толстой", 1863);

        // Выводим информацию о книге
        System.out.println("Информация о выбранном произведении:");
        System.out.println(voinaImir);
    }
}