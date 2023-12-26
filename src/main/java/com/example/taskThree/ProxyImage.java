package com.example.taskThree;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProxyImage implements MyImage {
    private String filename;

    @Override
    public void display() {
        RealImage img = new RealImage(filename);
        img.display();
    }
}