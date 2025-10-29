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
        String greeting = "Hello";
        
        int greetLength = greeting.length();
        int number = 4;
        int total = add(greetLength, number);
        System.out.println(total);
    }
    
    public static int add(int a, int b){
        return a + b;
    }
}
