/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ınterfacereallife;

/**
 *
 * @author DELL
 */
public class InterfaceRealLİfe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        SingUpManager sign = new SingUpManager(new ComplexUserCheckService());
        
        
        
        sign.SingUp(new User(1,"Abdullah",20));
        
        
        
        
    }
    
}
