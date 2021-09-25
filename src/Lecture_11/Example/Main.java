package Lecture_11.Example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        Cat thomas = new Cat("Томас");
        Cat behemoth = new Cat("Бегемот");
        Cat philipp = new Cat("Филипп Маркович");
        Cat pushok = new Cat("Пушок");

        cats.add(thomas);
        cats.add(behemoth);

        System.out.println(cats);

        cats.set(0, philipp); // Сейчас у нас список из 2 котов. Добавляем 3-го через set:

        System.out.println("Сейчас у нас список из 2 котов. Добавляем 3-го через set в позицию с индексом 0:");
        System.out.println(cats);

        cats.add(0, pushok); // Сейчас у нас список из 2 котов. Добавляем 3-го через add:

        System.out.println("Сейчас у нас список из 2 котов. Добавляем 3-го через add в позицию с индексом 0:");
        System.out.println(cats);

        // Чтобы полностью очистить список, используется метод clear():
        cats.clear();
        System.out.println("Сейчас мы очистили список котов:");
        System.out.println(cats);

        Cat[] catsArray = {thomas, behemoth, philipp, pushok};

        ArrayList<Cat> catsList = new ArrayList<>(Arrays.asList(catsArray));
        System.out.println("catsList:\n" + catsList);

        // Удаление элемента массива
        ArrayList<Cat> cats1 = new ArrayList<>();
        cats1.add(thomas);
        cats1.add(behemoth);
        cats1.add(philipp);
        cats1.add(pushok);
        System.out.println("cats1:\n" + cats1);
        cats1.remove(1);
        System.out.println("Удалили элемент массива под индексом 1:");
        System.out.println("cats1:\n" + cats1);
        cats1.remove(philipp);
        System.out.println("Удалили элемент массива 'philipp':");
        System.out.println("cats1:\n" + cats1);

        for (Cat cat : cats1) {
            if (cat.getName().equals("Томас")) {
                cats1.remove(cat);
            }
        }
        System.out.println("Удалили элемент массива с именем \"Томас\":");
        System.out.println("cats1:\n" + cats1);

        // Так делать нельзя: нельзя одновременно проводить итерацию (перебор) коллекции и изменение её элементов (возникнет исключение "java.util.ConcurrentModificationException")
        for (Cat cat : cats1) {
            if (cat.getName().equals("Пушок")) {
                cats1.add(new Cat("Супер Кот"));
            }
        }
    }
}
