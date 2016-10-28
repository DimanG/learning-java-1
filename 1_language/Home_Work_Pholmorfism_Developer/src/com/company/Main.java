package com.company;

public class Main {

    public static void main(String[] args) {
	Developer[] list={
            new JuniorDeveloper("Mike",500,1),
            new JuniorDeveloper("Dma",500,2),
            new JuniorDeveloper("Vova",500,3),
            new TeamLeadDeveloper("Robby",500,4),
            new DimaJunDeveloper("Diman",500,4)
    };
        Person[] list1={
                new HR("Tina",300,4),
                new SeniorDeveloper("Dima",500,4),
                new TeamLeadDeveloper("Robby",200,4),
                new JuniorDeveloper("Diman",500,2),
                new JuniorDeveloper("Vova",500,3),
                new TeamLeadDeveloper("Robby",500,4)
        };

    StringBuilder sb,sn;
        System.out.println("Developer:\n");
        for(Developer d:list){
            sb=new StringBuilder()
                    .append(d.getName())
                    .append(":")
                    .append(d.getBasicSalary())
                    .append("->")
                    .append(d.getSalary());
            System.out.println(sb.toString());
        }

        System.out.println("\nPerson:\n");
            for(Person d:list1){
                sn=new StringBuilder()
                        .append(d.getName())
                        .append(":")
                        .append(d.getBasicSalary())
                        .append("->")
                        .append(d.getSalary());
                System.out.println(sn.toString());
            }
    }
}
