package com.class22;
/*Write a program  that will have a private default constructor class 
 * and create 2 objects of this class: 
 * 1 - inside same class; 2 - from outside the class.*/
public class Task3 {
private Task3(){
	Task3 obj = new Task3();
}
}
