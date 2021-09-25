package Lecture_11.ArraySeparation;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        // Статическая инициализация массива
        int[] data = {1, 5, 6, 11, 3, 15, 7, 8};

        // Создание списка, где все элементы должны быть типа Integer
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Заполнение списка из массива
        for (int i = 0; i < data.length; i++) {
            list.add(data[i]);
        }

        ArrayList<Integer> even = new ArrayList<Integer>(); // Чётные
        ArrayList<Integer> odd = new ArrayList<Integer>(); // Нечётные

        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x % 2 == 0) { // если x чётное
                even.add(x); // добавляем x в коллекцию чётных чисел
            } else {
                odd.add(x); // добавляем x в коллекцию нечётных чисел
            }
        }
    }
}
