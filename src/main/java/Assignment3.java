package main.java;

public class Assignment3 extends Inherit {

    public void inheritanceEx(){
        Assignment3 pika = new Assignment3();
        System.out.println("Pokemon Sound: " + pika.sound);
        System.out.println("Pokemon Move: " + pika.move);
        pika.attack();
    }

    public void encapsulationEx(){
       Encapsulation hero = new Encapsulation();
        hero.setName("Iron Man");
        hero.setAge(50);
        hero.setPower("Money and Intelligence");

        System.out.println("Hero Name: " + hero.getName());
        System.out.println("Hero Age: " + hero.getAge());
        System.out.println("Hero Abilities: " + hero.getPower());

    }

    public void polymorphismEx(){
        Polymorphism squirtle = new Squirtle();
        squirtle.pokemonSound();
    }

    public void abstractionEx(){
        Charizard dragon = new Charizard();
        dragon.animalSound();
        dragon.animalMove();
    }

    public static void  main(String[]args){
        Assignment3 run = new Assignment3();
        System.out.println("Inheritance \n-----------");
        run.inheritanceEx();
        System.out.println();
        System.out.println("Encapsulation \n-------------");
        run.encapsulationEx();
        System.out.println();
        System.out.println("Polymorphism \n------------");
        run.polymorphismEx();
        System.out.println();
        System.out.println("Abstraction \n-----------");
        run.abstractionEx();


    }
}
