public class Sorceress extends Character implements Casting {


//    public Sorceress(String name, int health, int mana, int strength, int dexterity, int vitality, int energy) {
//        super(name, health, mana, strength, dexterity, vitality, energy);
//        name = "Hero";
//        health = 40;
//        mana = 35;
//        strength = 10;
//        dexterity = 25;
//        vitality = 10;
//        energy = 35;
//    }

    public Sorceress() {
        setName("Hero");
        setHealth(40);
        setMana(35);
        setStrength(10);
        setDexterity(25);
        setVitality(10);
        setEnergy(35);
    }

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
