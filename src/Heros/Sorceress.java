package Characters;

import Enemies.Enemy;
import Skills.Casting;

public class Sorceress extends Character implements Casting {

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
        this.setExperience(this.getExperience() + enemy.worth);
    }

    /*
    A method to level up a character - increase stats and give options to allocate skill point
     */
    public void levelUp() {
        this.setHealth(this.getHealth() + 1);
        this.setMana(this.getMana() + 2);
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
}
