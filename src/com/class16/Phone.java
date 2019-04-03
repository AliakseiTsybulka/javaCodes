package com.class16;

public class Phone {
String color, make, OS, model;
boolean camera;
int memory;
public static void main(String[] args) {
	Phone phone1 = new Phone();
	phone1.make = "iPhone";
	phone1.camera = true;
	phone1.color = "Black";
	phone1.memory=32;
	phone1.model="7";
	phone1.OS="iOS";
	phone1.calls();
	phone1.takePictures();
	phone1.apps();
	Phone phone2= new Phone();
	phone2.make = "Samsung";
	phone2.camera = true;
	phone2.color = "White";
	phone2.memory=128;
	phone2.model="Galaxy S8";
	phone2.OS="Android";
	phone2.calls();
	phone2.takePictures();
	phone2.apps();
	Phone phone3=new Phone();
	phone3.make = "Nokia";
	phone3.camera = false;
	phone3.color = "Black";
	phone3.memory=1;
	phone3.model="3310";
	phone3.OS="nokiaOS";
	phone3.calls();
}
void calls() {
	System.out.println(make+" can make calls");
}
void takePictures() {
	System.out.println(make+" can take pictures");
}
void apps() {
	System.out.println(make+" can install applications");
}

}
