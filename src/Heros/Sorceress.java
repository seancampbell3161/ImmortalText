package Heros;

import Enemies.Enemy;
import Skills.Casting;

public class Sorceress extends Hero implements Casting {

    /*
    Constructor initializing stats
     */
    public Sorceress() {
        setName("Hero");
        setHealth(40);
        setMana(35);
        setStrength(10);
        setDexterity(25);
        setVitality(10);
        setEnergy(35);
    }

    /*
    A method to increase the exp pool of the user
     */
    public void increaseXP(Enemy enemy) {
        this.setExperience(this.getExperience() + enemy.getWorth());
    }

    /*
    A method to level up a character - increase stats and give options to allocate skill point
     */
    public void levelUp() {
        this.setMaxHealth(this.getMaxHealth() + 1);
        this.setMaxMana(this.getMaxMana() + 2);
    }

    /*
    Spells
     */
    @Override
    public int iceBolt() {
        return 5 + (this.getEnergy() / 7);
    }

    @Override
    public int chargedBolt() {
        return 7 + (this.getEnergy() / 7);
    }

    @Override
    public int fireBolt() {
        return 5 + (this.getEnergy() / 5);
    }

    public int attack() {
        return (int) (Math.random() * 3);
    }
}
