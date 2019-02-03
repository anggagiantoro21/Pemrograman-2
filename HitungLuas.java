/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungluas;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class HitungLuas {

    Scanner s = new Scanner(System.in);
    
    public HitungLuas(){
        cariLuasPersegiPanjang(); 
    }

    private void cariLuasPersegiPanjang() {
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.println("Masukkan panjang : ");
        int panjang = s.nextInt();
        System.out.println("Masukkan lebar : ");
        int lebar = s.nextInt();
        
            int luasPersegiPanjang = panjang * lebar;
            System.out.println("Berikut luas Persegi Panjang dengan panjang = " + panjang + " dan lebar = " + lebar + ":");
            System.out.println(luasPersegiPanjang);
    }
    
    public static void main(String[] args){
        new HitungLuas();
    }
}

