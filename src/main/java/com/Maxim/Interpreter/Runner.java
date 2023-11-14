package com.Maxim.Interpreter;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<Record> databaseRecords = new ArrayList<>();

        Record record1= new Record(1,"test","test1");
        Record record2= new Record(2,"test2","test22");
        Record record3= new Record(3,"test3","test33");

        databaseRecords.add(record1);
        databaseRecords.add(record2);
        databaseRecords.add(record3);

        Context context = new Context(databaseRecords);

        Expression selectAllExpression = new SelectAllExpression();

        List<Record> allRecords = selectAllExpression.interpret(context);

        for (Record record:allRecords) {
            System.out.println("record: " + record.getId());
        }

        Expression selectByFieldExpression = new SelectByFieldExpression("test2", "test22");

        List<Record> recordsByField = selectByFieldExpression.interpret(context);
        System.out.println("Id for filed name test2: " + recordsByField.get(0).getId());
    }
}
