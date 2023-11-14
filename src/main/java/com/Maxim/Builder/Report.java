package com.Maxim.Builder;

public class Report {

    private String title;
    private String table;
    private Diagram diagram;

    public void setDiagram(Diagram diagram) {
        this.diagram = diagram;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTable(String table) {
        this.table = table;
    }

    @Override
    public String toString() {
        return "Report{" +
                "title='" + title + '\'' +
                ", table='" + table + '\'' +
                ", diagram=" + diagram +
                '}';
    }
}
