package com.Maxim.Builder;

public class MonthlyReport extends ReportBuilder{
    @Override
    void buildTitle() {
        report.setTitle("Monthly Report");
    }

    @Override
    void buildDiagram() {
        report.setDiagram(Diagram.PieChart);
    }

    @Override
    void buildTable() {
        report.setTable("Monthly Report Table");
    }
}
