package org.example;

public class Person {
    String firstname;
    String lastname;
    int age;
    String country;
    String university;
    double gpa;


    public Person(String firstname, String lastname, int age, String country, String university, double gpa) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.country = country;
        this.university = university;
        this.gpa = gpa;
    }

    public Person(String firstname, String lastname, int age) {

        this(firstname, lastname, age, "Unknown", "Unknown", 0.0);
    }

    public String getFirstName() {
        return this.firstname;
    }

    public String getLastName() {
        return this.lastname;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isTeen() {
        return this.age > 13 && this.age >= 19;
    }

}