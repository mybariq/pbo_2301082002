/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082002.p230424;

/**
 *
 * @author Bariq
 */
public class Employee extends Person {
      public static void main(String[] args){
    student ali = new student();
    System .out.println("Nama      :"+ali.getName());
    System .out.println("Alamat    :"+ali.getAddress());
    }
      
      public String getName(){
          System.out.println("student : getName");
          return name;
      }
}