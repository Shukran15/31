package com.company;

public class DogsBuilder {
    private String name;
    private String poroda;
    private int age;

    public Dogs build() {
        if (name == null) {
            throw new IllegalStateException("Должно быть указано имя");
        }
        if (name == null) {
            throw new IllegalStateException("Должна быть указана порода");
        }
        return new Dogs(name, poroda, age);

    }

    public String getName() {
        return name;
    }

    public DogsBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getPoroda() {
        return poroda;
    }

    public DogsBuilder setPoroda(String poroda) {
        this.poroda = poroda;
        return this;
    }

    public int getAge() {
        return age;
    }

    public DogsBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        this.age = age;
        return this;
    }

}