/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist1;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author DELL
 */
public class LinkedList1 {

    
    
    public static void listeyi_bas (LinkedList<String> gidilecek){
        
        /*for (String i : gidilecek){
            System.out.println(i);
          */
        
        
        ListIterator<String> iterator = gidilecek.listIterator();
        
        while (iterator.hasNext()){
            
            System.out.println(iterator.next());
            
        }
        
      
        
    }
    
    
    public static void sirali_ekle( LinkedList<String> gidilecek, String yeni){
        
         ListIterator<String> iterator = gidilecek.listIterator();
         
         while(iterator.hasNext()){
             
             int karsilastir=iterator.next().compareTo(yeni);
             
             if (karsilastir==0){
                 
                 System.out.println("listenizde bu eleman zaten var");
                 return;
             
             }
             else if (karsilastir<0){
                 
                 // yeni değer iteratör.next den daha büyük
                 
             }
             else if (karsilastir>0){
                 
                 iterator.previous();
                 iterator.add(yeni);
                 
                 return;
                                
             }
         }
        
        iterator.add(yeni);
        
         
         
         
         
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList<String> gidilecek_yerler = new LinkedList<String>();
        LinkedList<String> gidilecek = new LinkedList<String>();
        
     
        sirali_ekle(gidilecek, "postane1");
        sirali_ekle(gidilecek, "market1");
        sirali_ekle(gidilecek, "ev1");
        sirali_ekle(gidilecek, "avm1");
        sirali_ekle(gidilecek, "züccaciye1");
        
        gidilecek_yerler.add("postane");
        gidilecek_yerler.add("market");
        gidilecek_yerler.add("okul");
        gidilecek_yerler.add("kütüphane");
        gidilecek_yerler.add("spor");
        gidilecek_yerler.add("ev");
        
        
        listeyi_bas(gidilecek_yerler);
        
        
        System.out.println("--------------");
        
        gidilecek_yerler.add(4,"avm");
        
        
        listeyi_bas(gidilecek_yerler);
        
        
        System.out.println("--------------");
        
        gidilecek_yerler.remove(3);
        listeyi_bas(gidilecek_yerler);
        
        
        
        
        System.out.println("----------  sıralı ekleme ----------");
        
        listeyi_bas(gidilecek);
        
        
        
        
        
    }
    
}
