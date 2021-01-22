package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        String result = shouldGoOut(22, -10);
        System.out.println(result);
        System.out.println(shouldGoOut(17, 11));
        System.out.println(shouldGoOut(50, -9));
        System.out.println(shouldGoOut(100, 100));
        String r = shouldGoOut(50, -11);
        System.out.println(r);

        int randomAge = generateRandomAge();

        System.out.println(shouldGoOut(randomAge, 20));


    }


    public static String shouldGoOut(int ageOfPerson, int temperature) {

        if (ageOfPerson > 20 && ageOfPerson < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять.";
        }

        if (ageOfPerson < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять.";
        }


        if (ageOfPerson > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять.";
        }

        else {
            return "Оставайтесь дома.";
        }

    }


    public static int generateRandomAge() {
        Random rand = new Random();
        return rand.nextInt(60) + 1;

    }

}

