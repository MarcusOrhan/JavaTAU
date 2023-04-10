package Polymorphism;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("HAw HAW ~ WOOF Woof");
    }
    public void fetch(){
        System.out.println("this is a dog who do not refuse to FETCH things.");
    }
}
