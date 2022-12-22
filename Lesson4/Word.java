package JK.Lesson4;

import java.util.*;

public class Word {
    public static void main(String[] args){
        List<String> words = Arrays.asList("Осуждаю", "Очень", "Сильно", "Осуждаю", "За","Три", "Занятие", "На",
                "Недели","Особенно","Перед", "Новым", "Годом", "И", "Так","Сильно", "Нехватает", "Времени", "Грусть",
                "Грусть");
        Set<String> unique = new HashSet<String>(words);
        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Колличество слов");
        for (String key : unique) {
            System.out.println(key + ":" + Collections.frequency(words, key));
        }
    }
}
