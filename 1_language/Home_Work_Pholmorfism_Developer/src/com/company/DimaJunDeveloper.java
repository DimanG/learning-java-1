package com.company;

/**
 * Created by User on 22.10.2016.
 */
public class DimaJunDeveloper extends Developer{

    public DimaJunDeveloper(String name,double basicSalary, int experience) {
        super(name,basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return (basicSalary*2)+
                (experience>0?basicSalary*experience*0.1:0);
    }
}
