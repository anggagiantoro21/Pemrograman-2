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

    
    public static void main(String[] args) {
        int panjang;
        int lebar;
        double luas;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Hitung Luas");
        System.out.print("Masukkan Panjang: ");
        panjang = scan.nextInt();
        System.out.print("Masukkan Lebar: ");
        lebar = scan.nextInt();
  
        luas = (panjang * lebar);
        System.out.println("Hasil = " +luas);
    }
}

