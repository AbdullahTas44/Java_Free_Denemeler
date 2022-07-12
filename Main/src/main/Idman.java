/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author DELL
 */
public class Idman {
    
    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public Idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;
    }

    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }
    
   
    
    
    public void hareketyap ( String hareketturu, int sayi){
        
        if (hareketturu.equals("burpee")){
            
            burpeeYap(sayi);
            
            
        }
        else if (hareketturu.equals("pushup")){
            
            
            pushupYap(sayi);
            
            
            
        }
         else if (hareketturu.equals("situp")){
            
            
            situpYap(sayi);
            
            
        }
         else if (hareketturu.equals("squat")){
            
            
            squatYap(sayi);
            
            
        }
         else {
             
             System.out.println("geçersiz hareket");
             
             
         }
        
    }
      
      public void burpeeYap (int sayi) {
    
            
            if (burpee_sayisi==0){
                
                System.out.println("yapacak burpee kalmadı");
                
            }
            if (burpee_sayisi- sayi < 0 ){
                
                System.out.println("hedeflenen geçildi tebrikle ");
                burpee_sayisi=0;
                System.out.println("kalan burpee sayısı " + burpee_sayisi);
            }
            
            else {
                
                burpee_sayisi-=sayi;
                System.out.println("kalan burpee sayısı " + burpee_sayisi);
                
                
            }
        
      }
       
        
      
      public void pushupYap (int sayi) {
    
            
            if ( pushup_sayisi ==0){
                
                System.out.println("yapacak pushup kalmadı");
                
            }
        
            if (pushup_sayisi- sayi < 0 ){
                
                System.out.println("hedeflenen geçildi tebrikle ");
                pushup_sayisi=0;
                System.out.println("kalan puhup sayısı " + pushup_sayisi);
            }
            
            else {
                
                pushup_sayisi-=sayi;
                System.out.println("kalan pushup sayısı " + pushup_sayisi);
                
                
            }
        }
        
     
        
        
        public void situpYap (int sayi) {
    
            
            if ( situp_sayisi ==0){
                
                System.out.println("yapacak situp kalmadı");
                
            }
        
            if (situp_sayisi- sayi < 0 ){
                
                System.out.println("hedeflenen geçildi tebrikle ");
                situp_sayisi=0;
                System.out.println("kalan burpee sayısı " + situp_sayisi);
            }
            
            else {
                
                situp_sayisi-=sayi;
                System.out.println("kalan situp sayısı " + situp_sayisi);
                
                
            }
        }
        


            public void squatYap (int sayi) {
    
            
            if ( squat_sayisi ==0){
                
                System.out.println("yapacak squat kalmadı");
                
            }
        
            if (squat_sayisi- sayi < 0 ){
                
                System.out.println("hedeflenen geçildi tebrikle ");
                squat_sayisi=0;
                System.out.println("kalan squat sayısı " + squat_sayisi);
            }
            
            else {
                
                squat_sayisi-=sayi;
                System.out.println("kalan squat sayısı " + squat_sayisi);
                
                
            }
        }
        

        public boolean idmanbittimi (){

        return((burpee_sayisi==0)&& (situp_sayisi==0) && (squat_sayisi==0) && (pushup_sayisi==0));
        
        
           
     
            }



}







    
    

