package com.Maxim.Interpreter;

public class Record {


    public Record(int id, String fieldName, String value) {
        this.id = id;
        this.fieldName = fieldName;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private int id;
    private String fieldName;
    private String value;
}
