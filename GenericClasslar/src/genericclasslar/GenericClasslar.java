/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericclasslar;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class GenericClasslar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Character[] char_dizi = {'J','A','V','A'};
        Integer[] integer_dizi = {1,2,3,4,5,6};
        String[] string_dizi = {"java", "Pyhton", "C++","Php"};
        
        Ogrenci[] ogrenci_dizi = {new Ogrenci("mustafa"), new Ogrenci("Mehmet"), new Ogrenci ("cemal")};
        
        
        
        
        CharYazdir.yazdir(char_dizi);
        
        
        IntegerYazdir.yazdir(integer_dizi);
        
        StringYazdir.yazdir(string_dizi);
       
        OgrenciYazdir.yazdir(ogrenci_dizi);
       
        
        
        System.out.println("*********************");
        System.out.println("generic yazdırıyor ");
        System.out.println("*********************");
        
        YazdirmaClassı<Character> yazdir_char = new YazdirmaClassı<Character>();
        YazdirmaClassı<Integer> yazdir_int = new YazdirmaClassı<Integer>();
        YazdirmaClassı<String> yazdir_string = new YazdirmaClassı<String>();
        YazdirmaClassı<Ogrenci> yazdir_ogrenci = new YazdirmaClassı<Ogrenci>();
        
        
        yazdir_char.yazdir(char_dizi);
        yazdir_int.yazdir(integer_dizi);
        yazdir_string.yazdir(string_dizi);
        yazdir_ogrenci.yazdir(ogrenci_dizi);

        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
