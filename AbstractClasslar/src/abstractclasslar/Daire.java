/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclasslar;

/**
 *
 * @author DELL
 */
public class  Daire  extends Sekil{

    private int yaricap;

    public Daire(int yaricap, String isim) {
        super(isim);
        this.yaricap = yaricap;
    }
    
    
    
    
    @Override
    void alan_hesapla() {
        
        System.out.println(getIsim() + " alanı = " + (Math.PI * yaricap * yaricap) + "dir.");
        
    }


    
}


