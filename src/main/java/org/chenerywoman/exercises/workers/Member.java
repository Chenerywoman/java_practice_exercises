package org.chenerywoman.exercises.workers;

import java.util.Formatter;

public class Member {

    private String name;
    private int age;
    private long phoneNumber;
    private String address;
    private double salary;


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String printSalary(){

        Formatter formatter = new Formatter();
        formatter.format("%.2f", this.salary);
        return "Your salary is £" + formatter.toString();
    }
}
