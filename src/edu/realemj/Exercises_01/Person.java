package edu.realemj.Exercises_01;

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
        // Mild update of my own
    }   
    
    public static int calcMonths(int years) {
        return years*12;
    }
}
