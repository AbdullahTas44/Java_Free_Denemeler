/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oopatm;

/**
 *
 * @author DELL
 */
public class OOPatm {

 
    public static void main(String[] args) {
        //login class kullanıcı giriş kontrol 
        
        // hesap class hesap işlemlerini yapacak 
        
        // atm class atm çalıştıracak 
        
        
        Atm atm = new Atm();
        
        
        Hesap hesap = new Hesap("abdullah", "12345", 2000);
    
        
    
        atm.calis(hesap);
        
        
        System.out.println("programdan çıkıyoruzzzz");
        
        
        
        
    }
    
}
