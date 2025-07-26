/** ----- Задача № 1 ----- **/
//написать конструктор (со всеми полями) +
//написать геттеры сеттеры +
//переопределить метод toString()

//потом идем в метод main

//поведение книги (методы) пока не пишем
/** ----- Задача № 1 ----- **/
package model;

public class Book {
    /** ----- Поля класса: ----- **/
    private String title;
    private String author;
    private int year;

   /* public static void main(String[] args) {
        Book voinaIMir = new Book();

        voinaIMir.title = "Война и мир";
        voinaIMir.author = "Лев Николаевич Толстой";
        voinaIMir.year = "1863";
    }*/
    /** ----- Конструктор (со всеми полями) ----- **/
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    /** ----- Геттеры и сеттеры ----- **/
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /** ----- Переопределение метода toString() ----- **/
    @Override
    public String toString() {
        return
                "Название произведения: \"" + title +"\" " +
                        "\nАвтор произведения: " + author +
                        "\nГод произведения: " + year + " г.";

    }
}