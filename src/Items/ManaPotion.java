package Items;

import Heros.Hero;

public class ManaPotion extends Item {

    private int manaRestore = 25;

    public void drink(Hero character) {

        if(character.getMana() + manaRestore > character.getMaxMana()) {
            character.setMana(character.getMaxMana());
        } else {
            character.setMana(character.getMana() + manaRestore);
        }

        System.out.println("You drink the potion. Mana is " + character.getMana());
    }
}
