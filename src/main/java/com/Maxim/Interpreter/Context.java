package com.Maxim.Interpreter;

import java.util.ArrayList;
import java.util.List;

class Context {
    private List<Record> records;

    public Context(List<Record> records) {
        this.records = records;
    }

    public List<Record> getAllRecords() {
        return records;
    }

    public List<Record> getIdRecordsByField(String fieldName, String value) {
        List<Record> filteredRecords = new ArrayList<>();

        for (Record record : records) {

            if (record.getFieldName().equalsIgnoreCase(fieldName) & (record.getValue().equalsIgnoreCase(value))) {
                filteredRecords.add(record);
            }
        }

        return filteredRecords;
    }
}
