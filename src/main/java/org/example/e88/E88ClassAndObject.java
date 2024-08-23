package org.example.e88;

public class E88ClassAndObject {

    public static void main(String[] args) {
        // Create a class named 'Dog'
        Dog dog1=new Dog();

        // Declare String variables named 'breed', 'name', and 'color'
        dog1.breed="Husky";
        dog1.name="AnyName";
        dog1.color="AnyColor";
        Dog dog2=new Dog();
        dog2.breed="Bulldog";
        dog2.name="AnyName";
        dog2.color="AnyColor";
        Dog dog3=new Dog();
        dog3.breed="Labrador";
        dog3.name="AnyName";
        dog3.color="AnyColor";

        // Declare methods named 'bark()', 'run()', and 'play()' that print messages in the specified format

        // Create the first object of the class 'Dog' with breed = "Husky", name = "AnyName", color = "AnyColor"

        // Create the second object of the class 'Dog' with breed = "Bulldog", name = "AnyName", color = "AnyColor"

        // Create the third object of the class 'Dog' with breed = "Labrador", name = "AnyName", color = "AnyColor"

        // Call the methods 'bark()', 'run()', and 'play()' for each object
        System.out.print(dog1.breed+" can ");
        dog1.bark();
        System.out.print(dog1.breed+" can ");
        dog1.run();
        System.out.print(dog1.breed+" can ");
        dog1.play();
        System.out.print(dog2.breed+" can ");
        dog2.bark();
        System.out.print(dog2.breed+" can ");
        dog2.run();
        System.out.print(dog2.breed+" can ");
        dog2.play();
        System.out.print(dog3.breed+" can ");
        dog3.bark();
        System.out.print(dog3.breed+" can ");
        dog3.run();
        System.out.print(dog3.breed+" can ");
        dog3.play();



    }
}
