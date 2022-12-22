package JK.Lesson4;

import java.util.*;


public class Phonebook {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add(1235123, "Обломов");
        phonebook.add(5678794, "Пушкин");
        phonebook.add(123512, "Гагарин");
        phonebook.add(123123, "Чехов");
        phonebook.add(5143231, "Чехов");
        phonebook.get("Чехов");
        phonebook.get("Пушкин");
        phonebook.get("Ленин");
    }
    private Map<Integer, String> phonebook;
    Phonebook() {
        phonebook = new HashMap<>();
    }
    public void add(int number, String surname) {
        phonebook.put(number, surname);
    }
    public void get(String surname){
        if(phonebook.containsValue(surname)) {
            Set<Map.Entry<Integer, String>> set = phonebook.entrySet();
            for (Map.Entry<Integer, String> temp : set) {
                if(temp.getValue().equals(surname)) {
                    System.out.println(temp.getValue() + ":" + temp.getKey());
                }
            }
        } else {
            System.out.println("Пользователь ненайден");
        }
    }
}

