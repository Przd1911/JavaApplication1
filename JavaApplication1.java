/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner myscan = new Scanner (System.in);
        
        System.out.println ("Привет!");
        System.out.println ("Введи первое число");

         double x = 0;
         x = myscan.nextDouble (); 

         double y = 0;
         y = myscan.nextDouble ();

         System.out.println (x + y);
    }
}