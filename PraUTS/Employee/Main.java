/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prauts;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        
        Employee bos = new Manajer("Gajah Mada", "Jakarta", 3000000, 500000);
        Employee staff1 = new Staff("Aladin", "Bandung", 2500000);
        Employee staff2 = new Staff("Hana", "Sukabumi", 2000000);
        
            System.out.println("Nama    : " + bos.getName());
            System.out.println("Alamat  : " + bos.getAddress());
            System.out.println("Gaji    : " + bos.getSalary());
            System.out.println("");
            
                System.out.println("Nama    : " + staff1.getName());
                System.out.println("Alamat  : " + staff1.getAddress());
                System.out.println("Gaji    : " + staff1.getSalary());
                System.out.println("");
                
                    System.out.println("Nama    : " + staff2.getName());
                    System.out.println("Alamat  : " + staff2.getAddress());
                    System.out.println("Gaji    : " + staff2.getSalary());
                    System.out.println("");
                
    }
    
}
