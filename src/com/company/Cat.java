package com.company;

public class Cat extends Animal{

    public Cat()
    {

    }

    @Override
    public void eat()
    {
        System.out.println("Every cat eats meat.");
    }

    public void jump()
    {
        System.out.println("Every cat can jump.");
    }
}
