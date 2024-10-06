package edu.week2_task1_1;

public class Game
{
    private String gamename;
    private String genre;
    private String price;
    
    //Конструктор по умолчанию

    public Game() {
        this.gamename = "Name";
        this.genre = "TBD";
        this.price = "Unknown";
    }

    //Конструктор с параметрами
    public Game(String gamename, String genre, String price) {
        this.gamename = gamename;
        this.genre = genre;
        this.price = price;
    }

    //Геттеры
    public String getName() {
        return gamename;
    }

    public String getGenre() {
        return genre;
    }

    public String getPrice() {
        return price;
    }

    //Сеттеры
    public void setName(String gamename) {
        this.gamename = gamename;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    
    //Метод для вывода на экран
    public void displayInfo() {
        System.out.println("Название игры: " + gamename);
        System.out.println("Жанр: " + genre);
        System.out.println("Цена: " + price);
    }
}