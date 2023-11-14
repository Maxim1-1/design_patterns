package com.Maxim.Builder;

public class Runner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new AnnualReport());
        Report annualReport = director.buildReport();

        System.out.print(annualReport+"\n");

        director.setBuilder(new MonthlyReport());
        Report monthlyReport = director.buildReport();

        System.out.print(monthlyReport);
    }


}
