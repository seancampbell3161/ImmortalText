package Items;

import java.util.HashMap;
import java.util.Map;

public class Item {

    private String quality;
    Map<String, Integer> properties = new HashMap<>();

    /*
    Getters and Setters
     */
    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
