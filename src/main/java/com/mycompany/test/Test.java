/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

/**
 *
 * @author luca
 */
public class Test {

    public static void main(String[] args) {
//        String greeting = "Hello";
        
//        int greetLength = greeting.length();;
//        int number = 4;
        int likes = 4;
        int dislikes = 2;
        double total = ratio(likes, dislikes);
        System.out.println(total);
    }
    
    public static double ratio(int likes, int dislikes){
        return (double) likes / (likes + dislikes) * 100;
    }
}
