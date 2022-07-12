/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericmetodlar;

/**
 *
 * @author DELL
 */
public abstract class Aday {
    
    private int Turkce;
    private int Matematik;
    private int Edebiyat;
    private int Fizik;

    public Aday(int Turkce, int Matematik, int Edebiyat, int Fizik) {
        this.Turkce = Turkce;
        this.Matematik = Matematik;
        this.Edebiyat = Edebiyat;
        this.Fizik = Fizik;
    }

    public int getTurkce() {
        return Turkce;
    }

    public void setTurkce(int Turkce) {
        this.Turkce = Turkce;
    }

    public int getMatematik() {
        return Matematik;
    }

    public void setMatematik(int Matematik) {
        this.Matematik = Matematik;
    }

    public int getEdebiyat() {
        return Edebiyat;
    }

    public void setEdebiyat(int Edebiyat) {
        this.Edebiyat = Edebiyat;
    }

    public int getFizik() {
        return Fizik;
    }

    public void setFizik(int Fizik) {
        this.Fizik = Fizik;
    }
    
    
    abstract int puan_hesapla();
    
    
    
    
    
}
