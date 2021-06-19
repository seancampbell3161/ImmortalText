package Enemies;

public class Fallen extends Enemy {

    public Fallen() {
        setName("Fallen");
        setHealth(10);
        setWorth(15);
        setAttackDamage(2);
        setDefense(1);
    }

    public int attack() {
        return (int) (Math.random() * 3);
    }
}
