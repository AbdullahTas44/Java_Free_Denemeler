package referanslar;



/**
 *
 * @author DELL
 */
public class acount {
    
    
    private String hesapno;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonno;

    public acount(String isim, String email, String telefonno){
        
        /*
        this.isim="isim";
        this.email="email";
        this.telefonno="telefonno";
        
        this.bakiye=0.0;
        this.hesapno="bilgi yok";
        */
        
        this("bilgi yok",0.0,isim,email,telefonno);
        
        
    
}
    
    
    
    public acount() {
        
        /*
        this.hesapno="bilgi yok";
        this.isim= "bilgi yok";
        this.email= " bilgi yok";
        this.telefonno="bilgi yok";
        this.bakiye=0.0;
        */
        
        this("bilgi yok",0.0,"bilgi yok","bilgi yok","bilgi yok");
        
        
        
        



        //System.out.println("kendi yazdığımız constructor....");
    }
    
    
    public acount(String hesapno, double bakiye, String isim, String email, String telefonno){
        
        this.hesapno=hesapno;
        this.bakiye=bakiye;
        this.isim=isim;
        this.email=email;
        this.telefonno=telefonno;
        
        
        
        
    }
            
    public void bilgilerigoster(){
        
        
        System.out.println("hesap no : " + this.hesapno);
        System.out.println("bakiye : " + this.bakiye);
        System.out.println("isim : " + this.isim);
        System.out.println("email : " + this.email);
        System.out.println("telefon no : " + this.telefonno);
        
        
        
    }     
    
    
    
    public void parayatir(double miktar){
        
        bakiye += miktar;
        
        System.out.println("yeni bakiye = " + bakiye);
        
        
    }
    
    
    public void paracekme(double miktar){
        
        if (miktar>1500){
            
            System.out.println("bir günde 1500 tl den fazla para çekemezsin");
         
        }
        
        
        if (bakiye - miktar < 0 ){
            
            System.out.println("yeterli bakiyeniz yoktur");
            System.out.println("bakiyeniz = " + bakiye);
           
        }
        else {
            
            bakiye -= miktar;
            
            System.out.println("yeni bakiyeniz = " + bakiye);
            
            
        }
        
    }
    
    
    /**
     * @return the hesapno
     */
    public String getHesapno() {
        return hesapno;
    }

    /**
     * @param hesapno the hesapno to set
     */
    public void setHesapno(String hesapno) {
        this.hesapno = hesapno;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefonno
     */
    public String getTelefonno() {
        return telefonno;
    }

    /**
     * @param telefonno the telefonno to set
     */
    public void setTelefonno(String telefonno) {
        this.telefonno = telefonno;
    }
    
    
    
    
    
    
}
