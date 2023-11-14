package com.Maxim.Composite;

public class File implements Component{

    private String value;

    File (String newValue)
    {
        value=newValue;
    }

    @Override
    public void getValue() {
        System.out.print(value+"\n");
    }
}
