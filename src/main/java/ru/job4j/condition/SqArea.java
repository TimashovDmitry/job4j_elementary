package ru.job4j.condition;

public class SqArea {

    public static double square(double p, double k) {
        double square = (Math.pow(p,2) * k) / (4 * (Math.pow((k+1),2)));
        return square;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}