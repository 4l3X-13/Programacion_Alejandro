package Tema3;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] grades = new int[]{0, 2, 4, 6, 8, 10};
        pruebaArray(grades);

    }

    public static void pruebaArray(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }
    }
}
