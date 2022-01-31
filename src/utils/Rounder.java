package utils;

public class Rounder {

    public static String getRound(double value) {
        String valueRound = String.format("%.2f", value);
        return valueRound;
    }
}
