package com.Maxim.Composite;

public class Runner {
    public static void main(String[] args) {
        Component component1 = new File("component-1");
        Component component2 = new File("component-2");
        Component component3 = new File("component-3");
        Component component4 = new File("component-4");


        Folder folder = new Folder();
        folder.addValueInFolder(component3);
        folder.addValueInFolder(component4);

        Folder folder1 = new Folder();
        folder1.addValueInFolder(component1);
        folder1.addValueInFolder(component2);
        folder1.addValueInFolder(folder);

        folder1.getValue();



    }
}
