package com.Maxim.Builder;

public class AnnualReport  extends ReportBuilder{
    @Override
    void buildTitle() {
        report.setTitle("Annual Report");
    }

    @Override
    void buildDiagram() {
        report.setDiagram(Diagram.Histogram);
    }

    @Override
    void buildTable() {
        report.setTable("Annual Report Table");
    }
}
