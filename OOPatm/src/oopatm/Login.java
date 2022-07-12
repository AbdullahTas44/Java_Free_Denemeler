/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopatm;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Login {
    
    
    public boolean login(Hesap hesap){
        
        
        Scanner scanner = new Scanner(System.in);
        
        String kullaniciadi;
        String parola;
        
        System.out.print("kullanıcı adı:");
        kullaniciadi= scanner.nextLine();
        System.out.print("parola:");
        parola= scanner.nextLine();
        
        if (hesap.getKullaniciadi().equals(kullaniciadi) && hesap.getParola().equals(parola)){
            
            return true;
            
            
        }
        else{
            
            
            return false;
            
            
        }
        
        
        
        
        
    }
    
    
    
}
