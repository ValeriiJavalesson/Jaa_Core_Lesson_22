package Lesson_22.Ex1;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;


        Pet cat = () -> "Я кіт- Мяууу-Мяууу";
        Pet dog = () -> "Я пес - Гаууу-Гаууу";
        Pet cow = () -> "Я корова- Мууу-Мууу";

        System.out.println(cat.voice());
        System.out.println(dog.voice());
        System.out.println(cow.voice());
    }

    public static void some(int a, Predicate<Integer> predicate) {
        System.out.println(predicate.test(a));
    }
}
