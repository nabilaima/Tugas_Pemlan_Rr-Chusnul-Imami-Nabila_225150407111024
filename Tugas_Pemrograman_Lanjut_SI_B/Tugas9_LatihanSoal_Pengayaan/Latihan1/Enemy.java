package Latihan1;

public class Enemy extends Character {
    public void move() {
        System.out.println("Enemy is moving.");
    }

    public void move(int step) {
        System.out.println("Enemy is moving " + step + " steps.");
    }
}
