/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.base;

/**
 *
 * @author 
 * Nama : Angga Giantoro
 * NPM  : 1841433
 */
public class Main {


    public static void main(String[] args) {
        
        System.out.println(" Output Class Circle ");
        
        System.out.println("");
       
        Circle c = new Circle(" Bola Sepak ", " 30 cm ");
        System.out.println("Hasil output : " + c.getName());
        System.out.println("Hasil output : " + c.getArea());
        
            System.out.println("");

            System.out.println(" Output Class Rectangle ");

            Rectangle r = new Rectangle(" Buku Tulis ", " 20 x 14 cm ");
            System.out.println("Hasil output : " + r.getName());
            System.out.println("Hasil output : " + r.getArea());
    }
    
}
