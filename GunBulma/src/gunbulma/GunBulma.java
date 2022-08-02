/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gunbulma;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class GunBulma {

 
    
    static String findDate (int day, int month, int year){
        String thisday;
        
        thisday=LocalDate.of(year, month,day).getDayOfWeek().name();
        
        return thisday;
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yılı giriniz (2000 - 3000) :");
        int year = input.nextInt();
        System.out.print("Lütfen ayı giriniz (1 - 12 ) :");
        int month = input.nextInt();
        System.out.print("Lütfen günü giriniz (1-31) :");
        int day = input.nextInt();
        
        
        System.out.println(findDate(day,month,year));
        
        
        
        
    }
    
}
