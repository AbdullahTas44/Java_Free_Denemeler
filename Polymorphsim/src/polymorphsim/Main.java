package polymorphsim;



class Hayvan {
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public String konus(){
        
       return "Hayvan konuşuyor";
       
        
    }
    
}

class Kedi extends Hayvan{

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavlıyorr..";
        
    }
  
    
}


class Kopek extends Hayvan{

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havlıyor....";
        
    }
    
    
    
    
}


class At extends Hayvan{

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " kişniyor...";
        
    }
    
    
    
}






/**
 *
 * @author DELL
 */
public class Main {

    
    
    public static void konustur( Hayvan hayvan){
        
        System.out.println(hayvan.konus());
        
        
        
    }
    
    public static void konustur2 (Object object){
        
        
          
        if ( object instanceof Kopek ){
            
            Kopek kopek= (Kopek) object;
            System.out.println(kopek.konus());
            
            
        }
        else if ( object instanceof Kedi){
            
            Kedi kedi = (Kedi) object;
            System.out.println(kedi.konus());
            
        }
        else if ( object instanceof At){
           
            At at = (At) object;
            System.out.println(at.konus());
            
            
        }
        
        else if (object instanceof Hayvan){
            
            Hayvan hayvan = (Hayvan) object;
            System.out.println(hayvan.konus());

        }
        
        // System.out.println(object.konus());
        
          
          
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Hayvan hayvan1 = new Kedi("Tekir");
        
        System.out.println(hayvan1.konus());
        
        
        Hayvan hayvan2 = new Kopek("Karabaş");
        
        System.out.println(hayvan2.konus());
        
        Hayvan  hayvan3 = new At("Şahbatur");
        
        System.out.println(hayvan3.konus());
        
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("************************");


        konustur(new Kedi("aaaa"));
        konustur(new Kopek("bbbbb"));
        konustur(new At("cccc"));
        
        
        // instanceof


        Kopek kopek = new Kopek("yyyyy");
        
        if (kopek instanceof Hayvan){  // sınıfını öğrenme manasında doğru ise true dönüş yapar
            
            System.out.println("bu nesne hayvan sınıfında ");
        }
    
        System.out.println("***********************");
        System.out.println("***********************");
        System.out.println("***********************");
        
    
        Kopek kopek1 = new Kopek("faklı kopek");
        Kedi kedi1 = new Kedi("farklı kedi");
        At at1 = new At("farklı at");
        Hayvan  hayvan5 = new Hayvan("farklı hayvan");
        
        
        konustur2(kopek1);
        konustur2(kedi1);
        konustur2(at1);
        konustur(hayvan5);
        
        
        
    
    
    }
    
}
