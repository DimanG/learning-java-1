package com.company;


public abstract class Person {
        protected String name;
        protected double basicSalary;
        protected int experience;

        public Person(String name,double basicSalary,int experience){
            this.name=name;
            this.basicSalary=basicSalary;
            this.experience=experience;
        }

    protected Person() {
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public abstract double getSalary();
    }

