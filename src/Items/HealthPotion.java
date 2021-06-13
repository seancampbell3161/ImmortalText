package Items;

import Heros.Hero;

public class HealthPotion extends Item {

    private int healAmount = 20;

    public void drink(Hero character) {

        if(character.getHealth() + healAmount > character.getMaxHealth()) {
            character.setHealth(character.getMaxHealth());
        } else {
            character.setHealth(character.getHealth() + healAmount);
        }

        System.out.println("You drink the potion. Health is " + character.getHealth());
    }
}
