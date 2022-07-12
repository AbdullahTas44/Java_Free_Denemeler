/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foreach.dongusu;

/**
 *
 * @author DELL
 */
public class ForEachDongusu {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String[] array = {"elma","erik","armut"};
        int[] array2 = {1,2,3,4,5};
      
        deneme2 mert = new deneme2("mert",15);
        
        System.out.println(mert.getName() + "  " + mert.getAge());
        
        deneme[] dizi3 = {new deneme("mustafa"), new deneme ("Murat"), new  deneme("coşkun")};
             
     
        for (deneme a: dizi3){
            
            System.out.println(a.toString());
            
            
        }
        System.out.println("");
        System.out.println("ikinci yazdırma yöntemi");
        
        for (deneme d: dizi3){
            
            
            
            d.yaz();
            
            
        }
       
         System.out.println("");
         System.out.println("üçüncü yazdırma yöntemi");
        
        for (deneme f: dizi3){
            
            
            System.out.println(f.getIsim()); 
            
            
        }
    
        for (String a: array){
            System.out.println(a);
                       
        }
        
         for (int i : array2){
            
            System.out.println(i);
                        
        }
        
   
    }

       
        
    
}
