/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ınterfacereallife;

/**
 *
 * @author DELL
 */
public class SingUpManager {
    
    private IUserCheckService iUserCheckService;
    
    
    public SingUpManager(IUserCheckService iUserCheckService) {
        this.iUserCheckService = iUserCheckService;
    }
    
    
    public void SingUp(User user){
        
        
        
        if (iUserCheckService.checkUser(user)){
            
            System.out.println("Kullanıcı kayıt oldu " + user.getName());
        }
        else{
            
            System.out.println("kayıt yapılamadı");
            
        }
               
       
        
    }

    
}
