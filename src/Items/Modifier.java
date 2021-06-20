package Items;

import java.util.ArrayList;
import java.util.List;

public class Modifier {

    public static ArrayList<String> propertyTypes = new ArrayList<>();

    static {
        propertyTypes.add("damage");
        propertyTypes.add("mana");
        propertyTypes.add("defense");
        propertyTypes.add("health");
    }

    public String giveProperty() {
        return propertyTypes.get((int) Math.random() * 4);
    }
}
