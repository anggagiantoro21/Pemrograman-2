/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasno1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class TugasNo1 {

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        
        
        System.out.print("Input titik x lingkaran 1:");
        int x1 = inp.nextInt();
        System.out.print("Input titik y lingkaran 1:");
        int y1 = inp.nextInt();
        System.out.print("Input jari-jari lingkaran 1:");
        int r1 = inp.nextInt();

        System.out.print("Input titik x lingkaran 2:");
        int x2 = inp.nextInt();
        System.out.print("Input titik y lingkaran 2:");
        int y2 = inp.nextInt();
        System.out.print("Input jari-jari lingkaran 2:");
        int r2 = inp.nextInt();

    
                int jarak = (int) Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        
                    if(jarak < (r2-r1)){
                    System.out.println("C2 didalam C1");
                    }else if(jarak < (r1-r2)){
                    System.out.println("C1 didalam C2");
                    }else if(jarak == (r1-r2)&& (jarak > (r1+r2))){
                    System.out.println("C1 dan C2 Beririsan");
                    }else if(jarak > (r1+r2)){
                    System.out.println("C1 dan C2 Saling Lepas");
                    }else{
                    System.out.println("C1 dan C2 Saling Berpotongan");
            }           
        }
    }
