package org.example.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeslaGroup implements Tesla {

    private List<Tesla> teslaGroup;
    private String name;

    public TeslaGroup(String name) {
        teslaGroup = new ArrayList<>();
        this.name = name;
    }

    public void add(Tesla tesla) {
        this.teslaGroup.add(tesla);
    }

    @Override
    public void getDetail() {
        Iterator<Tesla> tesla = teslaGroup.iterator();

        System.out.println(name + " []");
        while (tesla.hasNext()) {
            tesla.next().getDetail();
        }
    }
}
