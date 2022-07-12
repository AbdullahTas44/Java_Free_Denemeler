/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foreach.dongusu;

/**
 *
 * @author DELL
 */
public class deneme {
    
    private String isim;

    
  
    
    public deneme(String isim) {
        this.isim = isim;
        
    }

    @Override
    public String toString() {
        return isim;
    }
    
    public String getIsim() {
        return ("bebekler " +isim);
    }
    
    
    public void yaz(){
        
        System.out.println(isim);
        
        
    }

    
    

    }
    
    
    
    

