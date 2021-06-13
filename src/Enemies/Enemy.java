package Enemies;

public abstract class Enemy {

    String name;
    public int health, worth, attackDamage, defense;

    abstract int attack();
}
