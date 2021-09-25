package Lecture_11.HomeWork;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        * Особенности некоторых методов ArrayList
        * add(int index, Cat element)
        * Вставляет элемент в массив, сначала сдвинув все элементы, начиная с [index], к концу массива, и затем вставив в образовавшуюся пустую ячейку новый элемент
        * */
        ArrayList<Integer> intsStandard = new ArrayList<>();
        intsStandard.add(1);
        intsStandard.add(2);
        intsStandard.add(3);
        intsStandard.add(4);
        intsStandard.add(5);
        System.out.println("Стандартный ArrayList<Integer>: " + intsStandard);
        ArrayList<String> stringsStandard = new ArrayList<>();
        stringsStandard.add("A");
        stringsStandard.add("B");
        intsStandard.add(37);
        intsStandard.add(5, 40);
        stringsStandard.add("C");
        stringsStandard.add(2, "i");
        stringsStandard.add(0, "i");

        MyArrayList<Integer> ints = new MyArrayList<>();
        ints.setT(new Integer[] {1, 2, 3, 4, 5});
        System.out.println(ints);
        MyArrayList<String> strings = new MyArrayList<>();
        strings.setT(new String[] {"A", "B"});

        /*System.out.println("Стандартный ArrayList<String>: " + stringsStandard);
        System.out.println(strings);*/

        ints.add(37);
        ints.add(5, 40);

        System.out.println("Стандартный ArrayList<Integer>: " + intsStandard);
        System.out.println(ints);

        strings.add("C");
        strings.add(2, "i");
        strings.add(0, "i");

        System.out.println("Стандартный ArrayList<String>: " + stringsStandard);
        System.out.println(strings);

        stringsStandard.remove("i");
        System.out.println("Стандартный ArrayList<String> после remove(\"i\"): " + stringsStandard);

        strings.remove("i");
        System.out.println(strings);

        stringsStandard.remove(1);
        System.out.println("Стандартный ArrayList<String> после remove(1): " + stringsStandard);

        strings.remove(1);
        System.out.println(strings);

        intsStandard.remove(5);
        System.out.println("Стандартный ArrayList<String> после remove(index = 5): " + intsStandard);

        ints.remove(5);
        System.out.println(ints);

        intsStandard.remove(Integer.valueOf(1));
        System.out.println("Стандартный ArrayList<String> после remove(1): " + intsStandard);

        ints.remove(Integer.valueOf(1));
        System.out.println(ints);

        String stringStandard = stringsStandard.get(2);
        System.out.println("Получаем из массива ArrayList<String> элемент под индексом 2: " + stringStandard);

        String string = strings.get(2);
        System.out.println(string);

        int indexStandard = intsStandard.indexOf(37);
        System.out.println("Получаем индекс элемента \"37\" в массиве ArrayList<Integer>: " + indexStandard);

        int index = ints.indexOf(37);
        System.out.println(index);
    }
}
