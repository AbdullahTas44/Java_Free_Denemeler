/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lokalınnerclasslar;

/**
 *
 * @author DELL
 */
public class LokalInnerClasslar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         class Alan {
            
            public void daire_alan(int yaricap){
                
                System.out.println("dairenin alanı :" + (yaricap*yaricap*Math.PI));
                
                
            }
            
            
        }
        
        
        Alan alan = new Alan();
        Alan alan2= new Alan();
        
        alan.daire_alan(10);
        alan2.daire_alan(3);
        
        
        
        
        
    }
    
    
    public static void deneme(){
        
        
        //Alan alan = new Alan();
       
    
}
    
}
