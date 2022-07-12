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
public class Atm {


public void calis(Hesap hesap){
    
    Login login = new Login();
    
    Scanner scanner  = new Scanner(System.in);
    
    System.out.println("bankaya hoşgeldin");
    System.out.println("*****************");
    System.out.println("kullanıcı girişi");
    System.out.println("*****************");
    
    int girishakki=3;
            
    while (true){
      
        if (login.login (hesap)){
            
            
            System.out.println("giriş başarılı");
            
            break;
            
            
            
        }
        else {
            
            System.out.println("giriş başarısız");
            girishakki-=1;
            System.out.println("giriş hakkınız= " + girishakki );
            
            
            
            
        }
        
        if (girishakki==0){
            
            System.out.println("giriş hakkınız bitti baboşş");
            
            
            return;
            
            
            
        }
        
        
            
       
        
    }
    
    
    
        System.out.println("*****************");
        String islemler = "1. bakiye görüntüle\n"
                + "2. para yatırma\n"
                + "3.para çekme\n"
                + "çıkış için q basınız";
        System.out.println(islemler);
        
        System.out.println("*****************");
        
        
        while(true){
            
            
            System.out.println("işlem seçiniz");
            
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                break;
                
            }
            else if (islem.equals("1")){
                
                System.out.println("bakiyeniz= " + hesap.getBakiye());
                        
            }
            else if (islem.equals("2")){
                
                System.out.print("yatırmak istediğiniz tutar=");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.parayatir(tutar);
                
         
                
            }
            
            else if (islem.equals("3")){
                
                System.out.print("çekmek istediğiniz tutar= ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paracek(tutar);
                
                
            }
            
            else {
                
                System.out.println("geçersiz işlem...");

                
            }
            
            
        }
    
  
 
    
    
}



    
}



