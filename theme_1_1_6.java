/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Никита,посчитаем скидку в 20% от старой цены.
 */
public class theme_1_1_6 {
    public static void main(String [] args){
        double profit=1000000;//цена
        double discount_percent=0.1;// процент
        double first_year=profit*discount_percent+profit;
        System.out.print("Прибыль за 1 год составит  ");
        System.out.println(first_year);
         double second_year=first_year*discount_percent+first_year;
      System.out.print("Прибыль за 2 год составит  ");
         System.out.println(second_year);
         double third_year=second_year*discount_percent+second_year;
         System.out.print("Прибыль за 3 год  составит  ");
         System.out.println(third_year);
         double four_year=third_year*discount_percent+third_year;
         System.out.print("Прибыль за 4 год составит  ");
         System.out.println(four_year);
         double five_year=four_year*discount_percent+four_year;
         System.out.print("Прибыль за 5 год составит  ");
         System.out.println(five_year);
          
               
    }
    
}
