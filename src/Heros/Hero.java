package Characters;

public abstract class Character {

    private String name;
    private int health, mana, strength, dexterity, vitality, energy, experience;
    int[] levelThresholds = new int[] {50, 100, 200, 350, 500 };

    public Character() {

    }

    public Character(String name,
                     int health,
                     int mana,
                     int strength,
                     int dexterity,
                     int vitality,
                     int energy,
                     int experience) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.strength = strength;
        this.dexterity = dexterity;
        this.vitality = vitality;
        this.energy = energy;
        this.experience = experience;
    }


    /*
    A method to level up stats
     */
    public abstract void levelUp();

    /*
    Getters and Setters for instance variables
     */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int str) {
        this.strength = str;
    }

    public int getDexterity() {
        return this.dexterity;
    }

    public void setDexterity(int dex) {
        this.dexterity = dex;
    }

    public int getVitality() {
        return this.vitality;
    }

    public void setVitality(int vit) {
        this.vitality = vit;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void setEnergy(int eng) {
        this.energy = eng;
    }

    public int getExperience() { return this.experience; }

    public void setExperience(int exp) { this.experience = exp; }
}
