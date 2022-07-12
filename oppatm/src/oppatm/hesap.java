
public class hesap {



private String kullaniciadi;
private String parola;
private int bakiye;

    public hesap(String kullaniciadi, String parola, int bakiye) {
        this.kullaniciadi = kullaniciadi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }


    public void parayatir(int tutar){
        
        bakiye += tutar;
        System.out.println("yeni bakiyeniz = " + bakiye);
        
        
    }
    
    public void paracek(int tutar){
        
        if (bakiye - tutar <0 ){
            
            System.out.println("yeterli paranız yoktur");
            
        }
        else {
            
            bakiye -= tutar;
            
            System.out.println("yeni bakiyeniz = " + bakiye);
            
            
            
        }
        
    }
    
    
    
    
    
}
