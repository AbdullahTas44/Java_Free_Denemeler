/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclasslar;

/**
 *
 * @author DELL
 */
public class Kare  extends  Sekil{

    private int kenar;

    public Kare(int kenar, String isim) {
        super(isim);
        this.kenar = kenar;
    }
    
    
    @Override
    void alan_hesapla() {

        System.out.println(getIsim() +" alanı = " + (kenar*kenar)+ "dir." );

    }
    
    public void cevre_hesapla(){
        
        System.out.println(getIsim() + "in çevresi = " + (4*kenar));
        
    }
    
    
    
    
}
