package org.example;

public class Insurance {
    int age, price;


    public int insurancePrice(int age) {
        if (age >= 30 && age <= 65) {
            price = 100;
        } else if (age >= 18 && age <= 29) {
            price = 120;
        } else if (age >= 66 && age <= 79) {
            price = 130;
        } else {
            price = 0;
        }
        return price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

