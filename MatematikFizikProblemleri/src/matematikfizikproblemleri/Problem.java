/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikfizikproblemleri;

/**
 *
 * @author DELL
 */
public class Problem {
    
    
    public static class Matematik{
        
        public static void daire_alan(int yaricap){
            
            
            System.out.println("dairenin alanı : " + (Math.PI*yaricap*yaricap));
        }
        
        public static void ucgen_cevresi (int kenar1, int kenar2, int kenar3){
            
            
            System.out.println("üçgenin çevresi : " + (kenar1+kenar2+kenar3));
            
        }
        
        
        
    }
    
    public static class Fizik{
        
        public static void ic_carpim (Vec vec1, Vec vec2){
            
            int iccarpim = vec1.getI()*vec2.getI() * vec1.getJ()*vec2.getJ()*vec1.getK()*vec2.getK();
            
            System.out.println(vec1.getIsim() + " ile " + vec2.getIsim() + " in iç çarğımı : " + iccarpim);
            
            
            
            
            
        }
        
        
    }
    
    
    
}
