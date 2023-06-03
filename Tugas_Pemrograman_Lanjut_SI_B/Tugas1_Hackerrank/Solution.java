package simple_game_simulation;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        game g1 = new game();
        g1.input();
        g1.proses(g1.attack, g1.hlth);
        g1.output();
    }
}

class game {
    String nama;
    double attack;
    double hlth; 

    void input() {
        Scanner input = new Scanner(System.in);
        this.nama = input.nextLine();
        this.attack = input.nextDouble();
        this.hlth = input.nextDouble();
        input.close();
    }

    double proses(double i, double j) {
        hlth = j - i;
        if (hlth < 0) {
            hlth = 0;
        }
        return hlth;
    }

    void output() {
        System.out.println(nama + " attacking enemy with attack power " + attack + "0");
        System.out.println("Health of Enemy = " + hlth + "0");
    }
}