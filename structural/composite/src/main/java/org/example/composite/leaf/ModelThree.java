package org.example.composite.leaf;

import org.example.composite.Tesla;

public class ModelThree implements Tesla {

    @Override
    public void getDetail() {
        System.out.println("Tesla Model 3");
    }
}
