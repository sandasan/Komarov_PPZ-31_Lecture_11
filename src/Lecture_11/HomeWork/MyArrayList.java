package Lecture_11.HomeWork;

import java.util.Arrays;

public class MyArrayList<T> {
    T[] t;

    public T[] getT() {
        return t;
    }

    public void setT(T[] t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "t=" + Arrays.toString(t) +
                '}';
    }

    public void add(T t) {
        System.out.println("add(T t): Добавляем элемент \"" + t + "\" в конец массива.");
        T[] temp = Arrays.copyOf(this.t, this.t.length + 1);
        temp[this.t.length] = t;
        this.t = temp;
    }

    public void add(Integer index, T t) {
        System.out.println("add(Integer index): Добавляем элемент \"" + t + "\" в массив под индексом " + index + ".");
        if (!rightIndex(index, this.t.length)) {
            System.err.println("Index is out of allowable range: 0 - " + this.t.length + ".");
            return;
        }

        T[] temp = Arrays.copyOf(this.t, this.t.length + 1);

        for (int i = 0; i < index; i++) {
            temp[i] = this.t[i];
        }
        temp[index] = t;
        for (int i = index + 1; i < this.t.length + 1; i++) {
            temp[i] = this.t[i - 1];
        }
        this.t = temp;
    }

    public void remove(int index) {
        System.out.println("remove(Integer index): Удаляем элемент в массиве под индексом " + index + ".");
        int allowableRange = this.t.length - 1;
        if (!rightIndex(index, allowableRange)) {
            System.err.println("Index is out of allowable range: 0 - " + allowableRange + ".");
            return;
        }

        T[] temp = Arrays.copyOf(this.t, this.t.length - 1);
        T removedElement = this.t[index];

        for (int i = 0; i < index; i++) {
            temp[i] = this.t[i];
        }
        for (int i = index; i < temp.length; i++) {
            temp[i] = this.t[i + 1];
        }
        this.t = temp;
    }

    public void remove(T t) {
        System.out.println("remove(T t): Удаляем элемент \"" + t + "\" из массива.");
        T[] temp = Arrays.copyOf(this.t, this.t.length - 1);
        int index = 0;
        boolean elementRemoved = false;
        for (T tItem : this.t) {
            if (!elementRemoved && tItem.equals(t)) {
                elementRemoved = true;
                continue;
            }
            temp[index++] = tItem;
        }
        this.t = temp;
    }

    public T get (int index) {
        System.out.println("Получаем из массива элемент под индексом " + index + ".");
        return this.t[index];
    }

    public int indexOf (T t) {
        System.out.println("Получаем индекс элемента \"" + t + "\" в массиве.");
        for (int i = 0; i < getT().length; i++) {
            if (t.equals(this.t[i])) {
                return i;
            }
        }
        return -1;
    }

    boolean rightIndex(Integer index, Integer maxIndex) {
        return !(index < 0 || index > maxIndex);
    }
}