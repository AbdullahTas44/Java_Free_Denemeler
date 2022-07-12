/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    
    public static void main(String[] args) {
       
       // ıdman programı 
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("idman programına hoşgeldiniz");
        
        String idmanlar =  "Geçerli hareketler...\n"
                + "burpee\n"
                + "pushup\n"
                + "situp\n"
                + "squat";
        
        System.out.println(idmanlar);
        
        
        System.out.println("bir idman oluşturun canlarım");
        
        System.out.print("burpee sayısı");
        int burpee = scanner.nextInt();
        System.out.print("pushup sayısı");
        int pushup = scanner.nextInt();
        System.out.print("situp sayısı");
        int situp = scanner.nextInt();
        System.out.print("squat sayısı");
        int squat = scanner.nextInt();
        scanner.nextLine();
        
        Idman idman = new Idman(burpee, pushup, situp, squat);
        
        System.out.println("idman başlasın....");
        
        while (idman.idmanbittimi()== false){
            
            System.out.print("hareket turu (burpee , pushup , situp , squat : ");
            String tur =scanner.nextLine();
            
            System.out.print("kaç adet yapacaksınız:");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            
            
            idman.hareketyap(tur, sayi);
            
          
                    
                    
        }
       
        
         System.out.println("harika bitirdiniz ");
       
       
                
    }
    
    
    
    
    
}
