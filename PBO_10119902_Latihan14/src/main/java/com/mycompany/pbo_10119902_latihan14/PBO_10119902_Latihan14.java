/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo_10119902_latihan14;

/**
 *
 * @author Muhammad Nurkholiq
 */
public class PBO_10119902_Latihan14 {
    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        int c = 0;
        
        c = a & b;
        System.out.println("a & b = " + c);
        
        c = a | b;
        System.out.println("a | b = " + c);
        
        c = a ^ b;
        System.out.println("a ^ b = " + c);
        
        c = ~a;
        System.out.println("~a = " + c);
        
        c = a << 2;
        System.out.println("a << 2 = " + c);
        
        c = a >> 2;
        System.out.println("a >> 2 = " + c);
    }
}
