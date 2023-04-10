package Polymorphism;

public class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("MEOW");
    }
    public void scratch(){
        System.out.println("This is a cat. Cats love to SCRATCH.");
    }
}
