package ru.job4j;

public class Converter {

        public static float rubleToEuro(float value) {
            float rsl = value / 70;
            return rsl;
        }

        public static float rubleToDollar(float value) {
            float rsl = value / 60; /* формула перевода рублей в доллары. */
            return rsl;
        }

        public static void main(String[] args) {
            float euro = Converter.rubleToEuro(140);
            float dollar = Converter.rubleToDollar(1200);
            System.out.println("140 rubles are " + euro + " euro.");
            System.out.println("1200 rubles are " + dollar + " dollar.");
        }
}
