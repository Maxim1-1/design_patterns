package com.Maxim.Interpreter;

import java.util.List;
class SelectByFieldExpression implements Expression {
    private String fieldName;
    private String value;

    public SelectByFieldExpression(String fieldName, String value) {
        this.fieldName = fieldName;
        this.value = value;
    }

    @Override
    public List<Record> interpret(Context context) {
        return context.getIdRecordsByField(fieldName, value);
    }
}
