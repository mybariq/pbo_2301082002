/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082002.p140504;

/**
 *
 * @author Bariq
 */
public class DivByZero {
    public static void main(String[]args){
        try{
            int angka = Integer.parseInt(args[0]);
            System.out.println(3 / angka);
            System.out.println("Cetak.");
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Argumen Tidak Ada   :" + ex.getMessage());                                                              
        }
        catch(ArithmeticException ex){
            System.out.println("Bagi Dengan 0   :" + ex.getMessage());
        }
        finally{
            System.out.println("Block Finally Setelah Exception");
        }
    }
}
