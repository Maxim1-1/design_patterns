package com.Maxim.Builder;

public abstract class ReportBuilder {

    Report report;

    void createReport () {
        report = new Report();
    }

    abstract void buildTitle ();
    abstract void buildDiagram ();
    abstract void buildTable ();


    Report getReport () {
        return report;
    }

}
