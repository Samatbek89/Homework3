package com.company;

public class Main {

    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "Petya";
        names[1] = "Dasha";
        names[2] = "Kuba";

        String name = "Nurik";
        switch (name) {
            case "Roma":
                System.out.println("Доброе утро Петя" );
                break;
            case "Dasha":
                System.out.println("Добрый день Даша");
                break;
            case "Maksat":
                System.out.println("Добрый вечер Куба");
                break;
            default:
                System.out.println("Привет всем");



        }



    }

}
