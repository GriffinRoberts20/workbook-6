package com.pluralsight;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return this.firstName+" "+this.lastName+" "+this.age;
    }

    @Override
    public int compareTo(Person other){
        int last=this.lastName.compareTo(other.lastName);
        if(last==0){
            int first=this.firstName.compareTo(other.firstName);
            if(first==0){
                if(this.age>other.age) return 1;
                else if(this.age<other.age) return -1;
                else return 0;
            }
            return first;
        }
        return last;
    }
}
