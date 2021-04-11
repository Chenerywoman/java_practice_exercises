package org.chenerywoman.exercises.workers;

public class Employee extends Member {
    private String specialization;

    public String getSpecialization(){
        return this.specialization;
    }

    public void setSpecialization(String specialization){
        this.specialization  = specialization;
    }
}
