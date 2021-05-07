package com.ailliushchenia;

import java.util.Random;

public class Randomizer {
    public static void main(String[] args) {
        System.out.println("Random String: " + getRandomString(10));
        System.out.println("Random Float: " + getRandomFloat(1, 10));
        System.out.println("Random Integer: " + getRandomInt(1, 10));

    }

    public static String getRandomString(Integer length) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String characters = "0123456789" + abc + abc.toUpperCase();
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }

        return sb.toString();
    }

    public static float getRandomFloat(float min, float max){
        Random r = new Random();

        float value = min + r.nextFloat() * (max - min);
        return  (float)(Math.ceil(value * 1000) / 1000);
    }

    public static int getRandomInt(int min, int max){
        return min + (int)(Math.random() * ((max - min) + 1));
    }
}