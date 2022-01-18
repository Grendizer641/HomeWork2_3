package HomeWork2_3;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {

    private HashMap<String, HashSet<Integer>> phoneBook = new HashMap<>();

    public void add(String surname, int phoneNumber){
        HashSet<Integer> phonesSet = this.phoneBook.getOrDefault(surname, new HashSet<>());
        phonesSet.add(phoneNumber);
        this.put(surname, phonesSet);
    }

    public void put(String surname, HashSet<Integer> phonesSet) {
        this.phoneBook.put(surname,phonesSet);
    }

    public HashSet<Integer> get(String surname) {
        return this.phoneBook.get(surname);
    }
}
