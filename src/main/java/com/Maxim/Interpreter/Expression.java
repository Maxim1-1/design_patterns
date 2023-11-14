package com.Maxim.Interpreter;

import java.util.List;

interface Expression {
    List<Record> interpret(Context context);
}
