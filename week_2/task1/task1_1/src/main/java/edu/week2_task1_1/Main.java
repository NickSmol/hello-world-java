package edu.week2_task1_1;

public class Main {
    public static void main( String[] args )
    {
        Game game1 = new Game();
        game1.displayInfo();
        
        System.out.println();

        // Создание экземпляра с использованием конструктора с параметрами
        Game game2 = new Game("Concord", "Heroic FPS", "60$");
        game2.displayInfo();

        System.out.println();

        // Изменение атрибутов с помощью сеттеров
        game1.setName("Team Fortress 2");
        game1.setGenre("Heroic FPS");
        game1.setPrice("Free To Play");
        game1.displayInfo();
    }
}
