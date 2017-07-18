package com.homeoffice.framework.util;


import java.util.Random;

public class RandomGenerator {

    /**
     * Return a random name.
     * @return name
     */
    public static String generateName() {
        Random random = new Random();
        String characters = "abcdefghijklmnopqrstuvwxyz";
        char[] name = new char[10];
        for (int i = 0; i < 10; i++)
            name[i] = characters.charAt(random.nextInt(characters.length()));
        return new String(name);
    }


    /**
     * Return a random house number.
     * @return houseNumber
     */
    public static int generateHouseNumber() {
        Random random = new Random();
        int houseNumber = random.nextInt(10-1+1)+1;

        return houseNumber;
    }

    /**
     * Return a random telephone number.
     * @return telephoneNumber
     */
    public static String generatePhoneNumber() {
        Random random = new Random();
        String telephoneNumber = "01204223" + random.nextInt(1000);
        return telephoneNumber;
    }



}

