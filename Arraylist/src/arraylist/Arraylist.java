/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;


import java.util.ArrayList;


        
/**
 *
 * @author DELL
 */
public class Arraylist {

    
    public static void yazdir (ArrayList<String> a){
        
            System.out.println("");
            System.out.println("method içinde yazdırılıyor");
            
        
        
         for (int i =0; i< a.size(); i++){
            
            System.out.println(a.get(i));
           
        }
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ArrayList<String> arraylist = new ArrayList<String>();
        
        arraylist.add("metalica");
        arraylist.add("guns");
        arraylist.add("black");
        arraylist.add("ıron");
        arraylist.add("metalica");
        
        
        System.out.println(arraylist.get(0));
        System.out.println(arraylist.get(3));
        System.out.println(arraylist.get(2));
        
        System.out.println(arraylist.size());
        
        
        //arraylist.remove("metalica");  //isim ile silme
        //arraylist.remove(1);           // index number ile silme 
        
     
        System.out.println(arraylist.indexOf("metalica"));
        System.out.println(arraylist.lastIndexOf("metalica"));
        
        
        
        
        System.out.println(arraylist.indexOf("olmayan"));  // olmayan değeri ararsak 
        
        
        for (int i =0; i< arraylist.size(); i++){
            
            System.out.println(arraylist.get(i));
           
        }
        
        System.out.println("öncesi " + arraylist.get(1));  
        
        arraylist.set(1,"abdullah olsun");            // arraylist güncelleme 
        
        System.out.println("sonrası " + arraylist.get(1));
        
        
        
        yazdir(arraylist);
        
        
        
        
        
        
        
        
    }
    
}
