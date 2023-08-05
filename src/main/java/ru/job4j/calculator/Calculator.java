package ru.job4j.calculator;

public class Calculator {
    private static int x = 5;

    private static int z = 5;

    public static int sum() {
        return x + z;
    }

    public int multiply() {
        return x * z;
    }

    public static int minus() {
        return x - z;
    }

    public int divide() {
        return x / z;
    }

    public int sumAllOperation() {
      return sum() + multiply() + minus() + divide();
    }

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int onePlusTwo = one + two;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;

        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
        Calculator calk = new Calculator();
        int rsm = sum();
        int rzk = calk.multiply();
        int rsk = minus();
        int rsl = calk.sumAllOperation();
        System.out.println(rsm);
        System.out.println(rzk);
        System.out.println(rsk);
        System.out.println(rsl);
    }
}
