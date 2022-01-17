package HomeWork2_3;

import java.util.HashMap;
import java.util.Map;

public class ArrayWithRepeatedWords {

    private static String[] ArrayWithRepeatedWords = {"Мяч", "Мяч", "Снегурочка", "Машина", "Земля", "Земля", "Земля",
            "Подорожник", "Леопард", "Тигр", "Тигр"};

    public static void main(String[] args) {
        HashMap<String, Integer> CollectionWithRepeatedWords = new HashMap<>();
        for (int i = 0; i < ArrayWithRepeatedWords.length; i++) {
            int frequency = 0;
            for (int j = 0; j < ArrayWithRepeatedWords.length; j++) {
                if (ArrayWithRepeatedWords[i] == ArrayWithRepeatedWords[j])
                    frequency++;
            }
            CollectionWithRepeatedWords.put(ArrayWithRepeatedWords[i], frequency);
        }

        for (Map.Entry<String, Integer> o : CollectionWithRepeatedWords.entrySet()) {
            System.out.println(o.getKey());
        }
        for (Map.Entry<String, Integer> o : CollectionWithRepeatedWords.entrySet()) {
            System.out.println("Слово " + o.getKey() + " Встречается " + o.getValue() + " Раз(а)");
        }
    }
}
