package edu.week2_task1_1;

public class Game
{
    private String gameName;
    private String genre;
    private String price;
    
    //Конструктор по умолчанию

    public Game() {
        this.gameName = "Name";
        this.genre = "TBD";
        this.price = "Unknown";
    }

    //Конструктор с параметрами
    public Game(String gameName, String genre, String price) {
        this.gameName = gameName;
        this.genre = genre;
        this.price = price;
    }

    //Геттеры
    public String getName() {
        return gameName;
    }

    public String getGenre() {
        return genre;
    }

    public String getPrice() {
        return price;
    }

    //Сеттеры
    public void setName(String gameName) {
        this.gameName = gameName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    
    //Метод для вывода на экран
    public void displayInfo() {
        System.out.println("Название игры: " + gameName);
        System.out.println("Жанр: " + genre);
        System.out.println("Цена: " + price);
    }
}