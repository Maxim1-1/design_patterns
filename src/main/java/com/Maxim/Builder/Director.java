package com.Maxim.Builder;

public class Director {

    ReportBuilder reportBuilder;

    public void setBuilder (ReportBuilder report) {
        this.reportBuilder = report;
    }


    Report buildReport () {
        reportBuilder.createReport();
        reportBuilder.buildDiagram();
        reportBuilder.buildTitle();
        reportBuilder.buildTable();

        return reportBuilder.getReport();
    }
}
