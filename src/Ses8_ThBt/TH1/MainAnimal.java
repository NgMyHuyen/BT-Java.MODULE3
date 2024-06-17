package Ses8_ThBt.TH1;
import Ses8_ThBt.TH1.Cat;
import Ses8_ThBt.TH1.Dog;
import Ses8_ThBt.TH1.Animal;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Pig");
        Dog dog1 = new Dog("Becgie", "black");
        Dog dog2 =new Dog("Pug","white");
        Cat cat= new Cat("Dora");

        System.out.println("Animal name: " + animal.getName());
        animal.setName("Bird");
        System.out.println("Animal name: " + animal.getName());
        dog1.setName("Corgi");

        System.out.println("Name "+dog1.getName());
        System.out.println("make sound " + dog1.makeSound());
        System.out.println("Color dog2 "+dog2.getColor());
        System.out.println("make sound " + dog2.makeSound());
        System.out.println("Name cat "+cat.getName());
        System.out.println("make sound " + cat.makeSound());

    }
}