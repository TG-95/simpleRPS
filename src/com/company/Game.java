package com.company;

public class Game {
    private static int spielerWahl1; /* 1 = rock, 2 = paper, 3 = scissors */
    private static int spielerWahl2; /* 1 = rock, 2 = paper, 3 = scissors */

    public Game(int spielerWahl1, int spielerWahl2) {
        Game.spielerWahl1 = spielerWahl1;
        Game.spielerWahl2 = spielerWahl2;

    }

    public static int getSpielerWahl1() {
        return spielerWahl1;
    }
    public static void setSpielerWahl1(int spielerWahl1) {
        Game.spielerWahl1 = spielerWahl1;
    }

    public static int getSpielerWahl2() {
        return spielerWahl2;
    }
    public static void setSpielerWahl2(int spielerWahl2) {
        Game.spielerWahl2 = spielerWahl2;
    }
}
