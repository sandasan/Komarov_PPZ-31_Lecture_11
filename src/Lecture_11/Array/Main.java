package Lecture_11.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {
    public static void main(String[] args) throws IOException {
        // Используем Array
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        // Ввод строк с клавиатуры
        String[] list = new String[10];
        for (int i = 0; i < list.length; i++) {
            System.out.print("Введите " + i + "-й элемент массива: ");
            String s = reader.readLine();
            list[i] = s;
        }

        // Вывод содержимого массива на экран (в обратном порядке)
        for (int i = 0; i < list.length; i++) {
            int j = list.length - i - 1;
            System.out.println(list[j]);
        }
    }
}
