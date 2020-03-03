package main.java;

public class Charizard implements Abstraction {
    @Override
    public void animalSound() {

        System.out.println("RAWR!!");
    }

    @Override
    public void animalMove() {

        System.out.println("Jump in arms.");
    }
}
