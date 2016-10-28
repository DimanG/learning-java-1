package com.company;


public class HR extends Person {

    public HR(String nam, double basicSalary, int experience) {
        super(nam, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return (basicSalary*2)+
                (experience>0?basicSalary*experience*0.1:0);
    }
}