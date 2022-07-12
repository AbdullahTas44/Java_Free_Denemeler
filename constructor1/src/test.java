/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class test {
    
    public static void main(String[] args) {
        
        
       /*
        
      
        acount acount1= new acount();
        
        acount1.setHesapno("123456");
        acount1.setBakiye(1000.0);
        acount1.setIsim("abdullah");
        acount1.setEmail("abdullah@gmail.com");
        acount1.setTelefonno("5068348943");
        
        
        System.out.println("bakiye = " + acount1.getBakiye());
        
        */
        
        // constructor  yapıcı metodlar sen constructor yazmaz isen kendisi otomatik oluşturur 
        
        //acount acount1 = new acount();
        
        
        /*
        acount acount2 = new acount("1214243",1000.0,"abdullah","abdullah@gmail.com","5068348943");
        
        acount2.parayatir(500);
        
        acount2.paracekme(700);
        
        acount2.paracekme(2000);
        
        
        */
        
        
        acount acount1 = new acount();
        
       // System.out.println(acount1.getEmail());
        
       
       acount acount2 = new acount("abdullah","abdullah@gmail.com","5068453453");
       
        //System.out.println(acount2.getEmail());
        //System.out.println(acount2.getBakiye());
        
        
        acount2.bilgilerigoster();
        
        
        
        
        
        
        
        
    }
        
        
        
        
        
        
    
    
    
}
