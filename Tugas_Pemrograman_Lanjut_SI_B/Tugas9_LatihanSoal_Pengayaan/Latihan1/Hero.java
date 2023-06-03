package Latihan1;

public class Hero extends Character{
    public void move() {
        System.out.println("Hero is moving.");
    }

    public void move(String direction) {
        System.out.println("Hero is moving towards " + direction);
    }
}
