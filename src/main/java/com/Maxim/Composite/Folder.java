package com.Maxim.Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Component{

    List<Component> components = new ArrayList<>();


    public void addValueInFolder (Component component) {
        components.add(component);
    }

    public void removeValueInFolder (Component component) {
        components.remove(component);
    }



    @Override
    public void getValue() {
        for (Component component:components) {
            component.getValue();
        }

    }
}
