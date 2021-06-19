package Game;

import Enemies.Enemy;
import Enemies.Fallen;
import Heros.Sorceress;

import java.util.LinkedList;
import java.util.Scanner;

public class Game {

    Scanner userInput = new Scanner(System.in);
    public LinkedList<Enemy> enemies = new LinkedList<Enemy>();

    public void start() {
        Sorceress player1 = new Sorceress();
        Fallen fallen = new Fallen();
        System.out.println("Welcome to Diablo2!");

        System.out.println("A " + fallen.getName() + " has appeared!");

        while(fallen.getHealth() > 0) {
            System.out.println("What do you do?");
            System.out.println("1 [attack]\t2 [run]");
            int action = userInput.nextInt();

            if(action == 1) {
                System.out.println("You attack! You deal " + player1.attack() + " damage");
                fallen.setHealth(fallen.getHealth() - player1.attack());
                if(fallen.getHealth() < 0) {
                    System.out.println("You have slain the " + fallen.getName());
                    break;
                }
                System.out.println("The Fallen has " + fallen.getHealth() + " remaining");
            } else {
                System.out.println("You ran away!");
                break;
            }
        }



    }
}
