/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author admin
 */
public class Sorting {

    public static void main(String[] args) {  
        
        int arr [] = {100, 29, 30, 29, 11, 22, 70, 13};
        int temp;
        for(int i = 0; i < arr.length -1; i++){
        for(int j = 0; j < arr.length -1 -i; j++){
            int x = j + 1;
            if(arr[j] > arr[x]){
               temp = arr[j];
               arr[j] = arr[x];
               arr[x] = temp;
            }
        }
    }
        for(int j = 7; j > 4; j--){
            System.out.println(arr[j]);
        }
    }
}


