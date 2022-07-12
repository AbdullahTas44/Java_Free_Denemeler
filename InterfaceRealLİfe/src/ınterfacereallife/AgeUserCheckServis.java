/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ınterfacereallife;

/**
 *
 * @author DELL
 */
public class AgeUserCheckServis implements IUserCheckService{

    @Override
    public boolean checkUser(User user) {

        
        
        if ((user.getAge()>=18)){
            return true;
            
        }
        else{
            
            return false;
            
        }
        
    

    }

   


    
    // method 
    
    
    
    
    
    
}



