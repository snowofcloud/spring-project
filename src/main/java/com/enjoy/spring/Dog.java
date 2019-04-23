package com.enjoy.spring;

/**
 * @auther xuxq
 * @date 2019/4/23 22:52
 */
public class Dog {

    private String color;
    private Integer age;
    private String size;

    public Dog() {
    }

    public Dog(String color, Integer age, String size) {
        this.color = color;
        this.age = age;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                '}';
    }
}
