package com.company;

public class Dogs {
    private String name;
    private String poroda;
    private int age;

    public Dogs() {

    }
    public Dogs(String name, String poroda, int age) {
        this.name = name;
        this.poroda = poroda;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPoroda() {
        return poroda;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dogs {" +
                "name ='" + name + '\'' +
                ", poroda ='" + poroda + '\'' +
                ", age =" + age +
                '}';
    }
}
