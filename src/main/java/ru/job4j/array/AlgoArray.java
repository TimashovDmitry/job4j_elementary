package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];

        for (int i = 0; i < array.length; i++) {
            for (int count = i; count < array.length; count++) {
                if (array[i] > array[count]) {
                    temp = array[count];
                    array[count] = array[i];
                    array[i] = temp;
                }
            }
        }
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }

    }

}
