package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rls = value / 70;
        return rls;
    }

    public static float rubleToDollar(float value) {
        float rls = value / 60;
        return rls;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
        float inEu = 140;
        float expectedEu = 2;
        float inDol = 120;
        float expectedDol = 2;
        float outEu = Converter.rubleToEuro(inEu);
        float outDol = Converter.rubleToDollar(inDol);
        boolean passedEu = expectedEu == outEu;
        boolean passedDol = expectedDol == outDol;
        System.out.println("140 rubles are 2. Test result : " + passedEu);
        System.out.println("120 rubles are 2. Test result : " + passedDol);
    }
}
