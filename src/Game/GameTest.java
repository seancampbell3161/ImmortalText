package Game;

import Heros.Sorceress;

public class GameTest {

    public static void main(String[] args) {
        Sorceress p1 = new Sorceress();

        System.out.println(p1.getName());
        System.out.println(p1.getMana());


        System.out.println("Ice bolt does " + p1.iceBolt() + " damage");
        System.out.println("Charged bolt does " + p1.chargedBolt() + " damage");
        System.out.println("Fire bolt does " + p1.fireBolt() + " damage");

    }
}
