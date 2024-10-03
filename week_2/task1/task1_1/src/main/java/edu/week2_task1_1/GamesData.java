package edu.week2_task1_1;

public class GamesData 
{
    private String gamename;
    private String genre;
    private String price;
    
    //Конструктор по умолчанию

    public GamesData() {
        this.gamename = "Name";
        this.genre = "TBD";
        this.price = "Unknown";
    }

    //Конструктор с параметрами
    public GamesData(String gamename, String genre, String price) {
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



    public static void main( String[] args )
    {
        GamesData game1 = new GamesData();
        game1.displayInfo();
        
        System.out.println();

        // Создание экземпляра с использованием конструктора с параметрами
        GamesData game2 = new GamesData("Concord", "Heroic FPS", "60$");
        game2.displayInfo();

        System.out.println();

        // Изменение атрибутов с помощью сеттеров
        game1.setName("Team Fortress 2");
        game1.setGenre("Heroic FPS");
        game1.setPrice("Free To Play");
        game1.displayInfo();
    }
}
