package Polymorphism;

public class Zoo {
    public static void main(String[] args) {
        Dog kitmir = new Dog();
        kitmir.fetch();
        kitmir.makeSound();
        feed(kitmir);

        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha);

        sasha = new Cat();
        sasha.makeSound();
        ((Cat) sasha).scratch();//Cast type of sasha from Animal to CAt to use the methods specific to Cat class
        feed(sasha);
    }
    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println(" Here is your Loyalty food Bones ");
        }
        else if (animal instanceof Cat){
            System.out.println("Here is your milk Majesty Meow");
        }
    }
}
