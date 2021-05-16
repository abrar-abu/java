package com.abu.collection;

import java.util.Objects;

public class MyCustom implements Comparable {
    private String name;
    private Integer age;

    public MyCustom(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyCustom{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyCustom)) return false;
        MyCustom myCustom = (MyCustom) o;
        return name.equals(myCustom.name) && age.equals(myCustom.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Object o) {
        return hashCode();
    }

    /*
    @Override
    public int compareTo(MyCustom myCustom) {
        int name = this.name.compareTo(myCustom.name);
        return name == 0 ? this.age.compareTo(myCustom.age) : name;
    }*/
}
