/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superclass;

/**
 *
 * @author Tedii
 */
public class Employe extends Person {
    
//    float salary =10000f;
//    String name ="hengker";
//    int age =16;
//
//    Employee(String hengker, int i, float f) {
//        
//    }
//    
//    public void showInfo(){
//        
//        System.out.println("Name : " + super.name);
//        System.out.println("Age : " + super.age);
//        System.out.println("Salary: $" + salary);
//    }
    public Employe(){
        
        super();
        
        System.out.println("Eksekusi konstruktor Employee");    
    }
    public void info(){
        super.showMessage();
}
    }
