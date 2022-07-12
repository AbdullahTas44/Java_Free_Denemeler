/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometriksekilhesapla;

/**
 *
 * @author DELL
 */
public class Ucgen extends Sekil{
    
    private int a;
    private int b;
    private int c;

    public Ucgen(int a, int b, int c, String isim) {
        super(isim);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    
    
    
    
    @Override
    void alanhesapla() {
        
        double u = (a+b+c) /2 ;
        
        double  alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println(getIsim() + " in alanı " + alan);
        
    }
    
    
    
    
}
