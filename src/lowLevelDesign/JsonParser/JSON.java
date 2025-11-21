package lowLevelDesign.JsonParser;

import java.util.HashMap;

public class JSON {

    private final HashMap<String, JSON> keyTovalues;

    public JSON(HashMap<String, JSON> keyTovalues) {
        this.keyTovalues = keyTovalues;
    }

    public JSON get(String key) {
        return this.keyTovalues.get(key);
    }
}
