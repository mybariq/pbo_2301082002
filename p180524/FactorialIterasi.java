/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082002.p180524;

/**
 *
 * @author Bariq
 */
public class FactorialIterasi {
    static int factorial(int n){
        int result = 1;
        for(int i = n; i > 1; i--){
            result *=i;
        }
        return result;
    }
    
    /**
     * @param args the commad line arguments
     */
    public static void main(String[]args){
        // TODO caode application logic here
        int n = 4;
        System.out.println(factorial(n));
    }
}
