/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlistsson;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class LinkedListsSon {

    
    public static void sehirleri_turla(LinkedList<String> sehirler){
        
        ListIterator<String> iterator = sehirler.listIterator();
        
        int islem;
        
        islemleri_bastir();
        
        Scanner scanner = new Scanner(System.in);
        
        if (!iterator.hasNext()){
            
            System.out.println("herhangi bir gidilecek şehir yok babaaaa...");
            
        }
        
        boolean cikis = false;
        boolean ileri = true;
        
        while(!cikis){
            
            System.out.println("bir işlem seç babacım");
            islem = scanner.nextInt();
            
            switch (islem){
             
                case 0 :
                    islemleri_bastir();
                    break;
                     
                case 1 :
                
                    
                    if (!ileri){
                        if (iterator.hasNext()){
                            iterator.next();
                            
                        }
                        ileri=true;
                    }
                    if (iterator.hasNext()){
                        System.out.println("şehre gidiliyor baba : " + iterator.next());
                        
                    }
                    else{
                        System.out.println("gidilecek şehir kalmadı babaa...");
                        ileri = true;
                        
                    }
                
                    break;
                    
                case 2 : 
                
                     if (ileri){
                        if (iterator.hasPrevious()){
                            iterator.previous();
                            
                        }
                        ileri=false;
                    }
                    
                    if (iterator.hasPrevious()){
                        
                        System.out.println("bir önceki şehre gidiliyor baba :" +iterator.previous() );
                        
                        
                        
                    }
                    else{
                        System.out.println("şehir turu başladı baba..");
                        
                    }
                
                    break;
                case 3 :
                    cikis=true;
                    System.out.println("Şehir turlarımız bitti eve gidiyoruz baba...");
                    System.out.println("Uygulamadan çıkılıyor...");
                    
                break;
                
                
                
            }
               
           
        }
        
        
    } 
    
    public static void islemleri_bastir(){
        
        System.out.println("0 -  işlemleri görüntüle");
        System.out.println("1 -  bir sonraki şehre git");
        System.out.println("2 -  bir önceki şehre git");
        System.out.println("3 -  uygulamadan çık");
        
        
        
        
        
    }
    
    
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList<String> sehirler = new LinkedList<String>();
        
        sehirler.add("ankara");
        sehirler.add("eskişehir");
        sehirler.add("afyon");
        
        sehirleri_turla(sehirler);
        
        
        
        
    }
    
}
