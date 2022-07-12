/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometriksekilhesapla;

/**
 *
 * @author DELL
 */
public class Daire extends Sekil{
    
    private int yaricap;

    public Daire(int yaricap, String isim) {
        super(isim);
        this.yaricap = yaricap;
    }

    
    
    
    
    @Override
    void alanhesapla() {
        
        
        System.out.println(getIsim() + "in alanı" + (Math.PI*yaricap*yaricap));
        
    }
    
    
    
    
}
