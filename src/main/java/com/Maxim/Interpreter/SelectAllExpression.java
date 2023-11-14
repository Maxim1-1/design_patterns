package com.Maxim.Interpreter;

import java.util.List;

class SelectAllExpression implements Expression {
    @Override
    public List<Record> interpret(Context context) {
        return context.getAllRecords();
    }
}
