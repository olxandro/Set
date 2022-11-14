package Collections_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ToMap {
    Map<String, Integer> example = new HashMap<>();

    public ToMap(Map<String, Integer> example) {
        this.example = example;
    }

    public void addToMap(String s, Integer number) {
        Set<String> key = example.keySet();
        if (key.contains(s)) {
            if (example.containsValue(number)) {
                throw new RuntimeException("Объект существует");
            } else {
                example.put(s, number);
            }
        } else {
            example.put(s, number);
        }
    }

    @Override
    public String toString() {
        return "ToMap{" +
                "example=" + example +
                '}';
    }
}
