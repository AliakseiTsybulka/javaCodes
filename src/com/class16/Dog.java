package com.class16;

public class Dog {
	String name,breed;
    int age,weight;
    void run() {
        System.out.println(breed+" dog can run");
    }
void doCommands() {
    System.out.println(breed+" dog can execute commands");
}
void fight() {
    System.out.println(breed+" dog can fight");
}
public static void main(String[] args) {
    Dog d1=new Dog();
    d1.name="Mishka";
    d1.breed="Husky";
    d1.age=6;
    d1.weight=15;
    d1.run();
    d1.doCommands();
    
    Dog d2=new Dog();
    d2.name="Conor";
    d2.breed="Bulldog";
    d2.age=4;
    d2.weight=26;
    d2.run();
    d2.doCommands();
    d2.fight();
    
    Dog d3=new Dog();
    d3.name="Lucas";
    d3.breed="Labrador";
    d3.age=7;
    d3.weight=40;
    d3.run();
    d3.doCommands();
}
}
