/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanjava;

import java.util.Arrays;

/**
 *
 * @author jhoooganteng
 */
public class array {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "banana", "coconut"};
        
        //fruits[0] = "pineapple';
        //int numOfFruit = fruits.length;
        //System.out.println(fruits[0]);
        
        Arrays.sort(fruits); //urut sesuai alpabet
        //Arrays.fill(fruits, "pineapple"); //perintah memasukkan "pineapple" ke output
        
        for(int i = 0; i<fruits.length; i++){
            System.out.println(fruits[i]+ " ");
        }
        
        
        
        for(String fruit:fruits){
            System.out.println(fruit);
        } 
    
    }
    
}
