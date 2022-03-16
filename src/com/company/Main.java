package com.company;

public class Main {

    public static void main(String[] args) {
	Dogs dogs1 = new DogsBuilder()
            .setName("Найджел")
            .setPoroda("Джек Рассел терьер")
            .setAge(5)
            .build();
        System.out.println(dogs1);


        Dogs dogs2 = new DogsBuilder()
            .setName("Твикс")
            .setPoroda("Корги")
            .setAge(2)
            .build();
        System.out.println(dogs2);

        Dogs dogs3 = new DogsBuilder()
                .setName("Роза")
                .setPoroda("Йорк")
                .setAge(4)
                .build();
        System.out.println(dogs3);

    }

}
