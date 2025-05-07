package org.example.composite.leaf;

import org.example.composite.Tesla;

public class ModelS implements Tesla {

    @Override
    public void getDetail() {
        System.out.println("Tesla Model S");
    }
}
