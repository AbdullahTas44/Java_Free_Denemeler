/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hafizaoyunu;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     *
     */
    private static Kart[][] kartlar = new Kart[4][4];
    
    /**
     *
     * 
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
       
        
        kartlar[0][0]= new Kart('E');
        kartlar[0][1]= new Kart('A');
        kartlar[0][2]= new Kart('B');
        kartlar[0][3]= new Kart('F');
      
        
        kartlar[1][0]= new Kart('G');
        kartlar[1][1]= new Kart('A');
        kartlar[1][2]= new Kart('D');
        kartlar[1][3]= new Kart('H');
        
        
        kartlar[2][0]= new Kart('F');
        kartlar[2][1]= new Kart('C');
        kartlar[2][2]= new Kart('D');
        kartlar[2][3]= new Kart('H');
        
        
        kartlar[3][0]= new Kart('E');
        kartlar[3][1]= new Kart('G');
        kartlar[3][2]= new Kart('B');
        kartlar[3][3]= new Kart('C');
   
        System.out.println(kartlar[1][1].getDeger());
        
        
        // oyun_tahtasi();
        
        
        while(oyunbittimi()== false){
            
            
            
            oyun_tahtasi();
            tahminet();


        }
     }
    
    public static void tahminet(){
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.print("birinci tahmin i ve j değerini bir boşluklu giriniz... "  );
        int i1= scanner.nextInt();
        int j1= scanner.nextInt();
        
        kartlar[i1][j1].setTahmin(true);
        oyun_tahtasi();
        
        System.out.print("ikinci tahmin i ve j değerini bir boşluklu giriniz... "  );
        int i2= scanner.nextInt();
        int j2= scanner.nextInt();
        
        
        if (kartlar[i1][j1].getDeger()== kartlar[i2][j2].getDeger()){
            
            System.out.println("doğru tahmin");
            kartlar[i2][j2].setTahmin(true);
            
            
        }
        else {
            System.out.println("hatalı tahmin");
            kartlar[i1][j1].setTahmin(false);
            
        }
        
        
        
        
    }
    
    
    public static boolean oyunbittimi(){
        
        for (int i=0 ;i<4;i++){
            for (int j=0;j<4;j++){
                
                if (kartlar[i][j].isTahmin()== false){
                     return false;
                     
                }
         }
     
    }
        oyun_tahtasi();
        return true;
         
         
        
    }
    
    
    
    public static void oyun_tahtasi(){
        
        
        for (int i =0; i<4; i++){
            System.out.println("___________________");
            for (int j=0 ; j<4;j++){
                
                if (kartlar[i][j].isTahmin()){
                    
                    System.out.print("|" + kartlar[i][j].getDeger()+ "|" ) ;
                    
                    
                }
                else{
                    
                    System.out.print(" | | ");
                    
                }
                
            }
             System.out.println("");
           
          
            
        }        
        System.out.println("___________________");
        
        
        
    }
    
    
    
    
}
