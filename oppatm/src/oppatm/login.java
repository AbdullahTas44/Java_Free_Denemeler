package oppatm;


import java.util.Scanner;


public class login{
    
   
    public boolean (hesap hesap) {
       
       
       
       Scanner scanner = new Scanner(System.in);
       
       
       String kullaniciadi;
       String parola;
       
            System.out.print("Kullanıcı adı:");
            kullaniciadi=scanner.nextLine();
            
            System.out.print("parola:");
            parola=scanner.nextLine();
            
            
            if (hesap.getKullaniciadi().equals(kullaniciadi) && hesap.getParola().equals(parola)){
                
                return true;
                
            }
            
            else {
                return false;
                
                
                
            }
                
                
          
          
           
   } 
    
    
}
