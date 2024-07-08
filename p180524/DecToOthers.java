/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082002.p180524;

/**
 *
 * @author Bariq
 */
public class DecToOthers {
    public static void main(String args[]){
        int num = 15;
        int base = 8;
        printBase(num, base);
    }
    static void printBase(int num,int base){
        int rem = 1;
        String digits="0123456789ABCDEF";
        String result="";
        /* the iterative step*/
        while (num!=0){
            rem = num*base;
            num = num/base;
            result = result.concat(digits.charAt(rem)+"");
        }
        /* printing the reverse of the result */
        for (int i=result.length()-1; i>=0; i--){
            System.out.print(result.charAt(i));
        }
    }
}