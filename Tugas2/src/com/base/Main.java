/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.base;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(" output class Circle ");
        
        System.out.println("");
       
        Circle c = new Circle("Bola Sepak", "30 cm");
        System.out.println("Hasil output : " + c.getName());
        System.out.println("Hasil output : " + c.getArea());
        
        System.out.println("");
        
        Rectangle r = new Rectangle("Buku Tulis", "20 x 14 cm");
        System.out.println("Hasil output : " + r.getName());
        System.out.println("Hasil output : " + r.getArea());
        
    }
    
}
