package Latihan1;

public class App {
    public static void main(String[] args) {
        // Static Polymorphism
        Hero hero = new Hero();
        hero.move("North"); // Hero is moving towards North.

        Enemy enemy = new Enemy();
        enemy.move(5); // Enemy is moving 5 steps.

        // Dynamic Polymorphism
        Character character1 = new Hero();
        character1.move(); // Hero is moving.

        Character character2 = new Enemy();
        character2.move(); // Enemy is moving.

        Character character3 = new Witch();
        character3.move(); // Witch is moving.

        // Dynamic Polymorphism with casting
        Character character4 = new Witch();
        if (character4 instanceof Fighter) {
            Fighter fighter = (Fighter) character4;
            fighter.move();
        } else {
            System.out.println("Cannot cast Witch to Fighter.");
        }
    }
}
