/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anonimınnerclasslar;

/**
 *
 * @author DELL
 */
public class AnonimInnerClasslar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IOgrenci ogrenci = new IOgrenci() {
            @Override
            public void ders_calis() {
                System.out.println("ders çalışıyorum");

            }

            @Override
            public void derse_gir() {
                System.out.println("derse giriyorum");
                
            }
        };
        
        ogrenci.ders_calis();
        ogrenci.derse_gir();
        System.out.println("*******************");
        
        Aogrenci ogrenci2 = new  Aogrenci("abdullah",515) {
            @Override
            void kayit_yaptir() {

                System.out.println("kayıt yapılıyor ...   isim : " + getIsim() + "  numara : " + getNumara());


            }
        };
        
        ogrenci2.kayit_yaptir();
        
        
        
    }
    
    public static abstract class Aogrenci{
        
        private String isim;
        private int numara;

        public Aogrenci(String isim, int numara) {
            this.isim = isim;
            this.numara = numara;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNumara() {
            return numara;
        }

        public void setNumara(int numara) {
            this.numara = numara;
        }
        
        
        
        abstract void kayit_yaptir();
        public void selamla(){
            
            System.out.println("selamlar...");
            
        }
        
    }
    
    
    public interface IOgrenci{
        
        
        void ders_calis();
        void derse_gir();
      
    }
    
}
