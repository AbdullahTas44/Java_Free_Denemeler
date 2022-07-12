/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclasslar;



/**
 *
 * @author DELL
 */
public abstract class Sekil {
    
    
   private String isim;

    public Sekil(String isim) {
        this.isim = isim;
    }
   
   public void ismini_soyle (){
       
       
       System.out.println("bu obje " + isim + "objesidir.");
       
       
   }
    
   
   abstract void alan_hesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
   
   
    
    
}
