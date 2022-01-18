package HomeWork2_3;

public class PhoneBookTest {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", 123);
        phoneBook.add("Иванов", 123);
        phoneBook.add("Иванов", 456);



        System.out.println(phoneBook.get("Иванов"));
    }
}
