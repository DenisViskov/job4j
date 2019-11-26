package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int inRubleToEuro = 140;
        int expectedRubleToEuro = 2;
        int outRubleToEuro = rubleToEuro(inRubleToEuro);
        boolean passedRubleToEuro = expectedRubleToEuro == outRubleToEuro;
        System.out.println("140 rubles are 2. Test result : " + passedRubleToEuro);

        int inrubleToDollar = 120;
        int expectedrubleToDollar = 2;
        int outrubleToDollar = rubleToDollar(inrubleToDollar);
        boolean passedrubleToDollar = expectedrubleToDollar == outrubleToDollar;
        System.out.println("120 rubles are 2. Test result : " + passedrubleToDollar);

        int inEuroToRuble = 2;
        int expectedEuroToRuble = 140;
        int outEuroToRuble = euroToRuble(inEuroToRuble);
        boolean passedEuroToRuble = expectedEuroToRuble == outEuroToRuble;
        System.out.println("2 euro are 140. Test result : " + passedEuroToRuble);

        int inDollarToRuble = 5;
        int expectedDollarToRuble = 300;
        int outDollarToRuble = dollarToRuble(inDollarToRuble);
        boolean passedDollarToRuble = expectedDollarToRuble == outDollarToRuble;
        System.out.println("5 dollars are 300. Test result : " + passedDollarToRuble);
    }
}
