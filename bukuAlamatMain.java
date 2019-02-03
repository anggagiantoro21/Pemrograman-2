/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukualamat;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class bukuAlamatMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean mainkan = true;
        ArrayList<BukuAlamat> buku = new ArrayList<>();
        
        while (mainkan){
            
            System.out.println(" - ANGGA GIANTORO - ");
            System.out.println(" - 1841433 - ");
            System.out.println("--------------------------------------------------------------------------");
            
            System.out.println(" Selamat Datang di Menu Buku Alamat ");
            
            System.out.println("1. Input Data");
            System.out.println("2. Update Data");
            System.out.println("3. Delete Data");
            System.out.println("4. Show Data");
            System.out.println("5. Exit aplikasi");
            System.out.println("\npilih Menu (1/2/3/4/5) : ");
            
            int list;
            try{
                list = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException nfe){
                list = 0;
            }
            
            input = new Scanner(System.in);
            
            switch(list){
                case 1:
                    System.out.println("\nMenu Input Data");
                    Boolean inputAgain = true;
                    while(inputAgain){
                        BukuAlamat entri = new BukuAlamat();
                        
                        System.out.println(" input Nama     : ");
                        String nama = input.nextLine();
                        entri.setNama(nama);
                        
                        System.out.println(" input Alamat    : ");
                        String alamat = input.nextLine();
                        entri.setAlamat(alamat);
                        
                        System.out.println(" input Nomor Telepon     : ");
                        String nomorTelepon = input.nextLine();
                        entri.setNomorTelepon(nomorTelepon);
                        
                        System.out.println(" input Alamat Email     : ");
                        String alamatEmail = input.nextLine();
                        entri.setAlamatEmail(alamatEmail);
                        
                        buku.add(entri);
                        
                        System.out.print("Input Data Again ? (Y/T) : ");
                        String terus = input.nextLine().toUpperCase();
                        
                        if(!terus.equals("Y")){
                            inputAgain = false;
                        }
                    }
                break;
                case 2:
                    System.out.println("\n Update Data");
                    System.out.println("\n=====================");
                    System.out.println("No \t Nama \t\t\t Alamat \t\t\t No. Telepon \t\t Email");
                    System.out.println("======================");
                    for(int i = 0; i < buku.size(); i++){
                        BukuAlamat a = buku.get(i);
                        System.out.print((i + 1) + "\t");
                        a.Row();
                    }
                    System.out.print("\nMasukkan nomor entri yang akan diubah : ");
                    
                    int nomoredit;
                    try{
                        nomoredit = Integer.parseInt(input.nextLine());
                    }catch(NumberFormatException nfe){
                        nomoredit = 0;
                    }
                    
                try {
                        if (nomoredit > 0) {
                            BukuAlamat a = buku.get(nomoredit - 1);
                            Boolean selesai = false;
                            while (!selesai) {
                                a.Detail();
                                System.out.println("\nPilih yang ingin diubah?");
                                System.out.println("1. Nama");
                                System.out.println("2. Alamat");
                                System.out.println("3. Nomor Telepon");
                                System.out.println("4. Email");
                                System.out.println("5. Done");
                                System.out.print("\nPilih (1/2/3/4/5) : ");

                                int pilihedit;
                                try {
                                    pilihedit = Integer.parseInt(input.nextLine());
                                } catch (NumberFormatException nfe) {
                                    pilihedit = 0;
                                }

                                switch (pilihedit) {
                                    case 1:
                                        System.out.print("Input nama baru : ");
                                        a.setNama(input.nextLine());
                                        break;
                                    case 2:
                                        System.out.print("Input alamat baru : ");
                                        a.setAlamat(input.nextLine());
                                        break;
                                    case 3:
                                        System.out.print("Input nomor telepon baru : ");
                                        a.setNomorTelepon(input.nextLine());
                                        break;
                                    case 4:
                                        System.out.print("Input alamat baru : ");
                                        a.setAlamatEmail(input.nextLine());
                                        break;
                                    case 5:
                                        System.out.println("\nSelesai mengubah entri.");
                                        selesai = true;
                                        break;
                                    default:
                                        System.out.println("\nMasukkan angka pada menu.");
                                        break;
                                }
                            }
                        } else {
                            System.out.println("\nNumber not found. Try Again");
                        }
                    } catch (Exception e) {
                        System.out.println("\nNumber not found. Try Again");
                    }

                    break;
                case 3:
                    System.out.println("\nHapus Data");
                    System.out.println("\n=====================================================");
                    System.out.println("No \t Nama \t\t\t Alamat \t\t\t No. Telepon \t\t Email");
                    System.out.println("=======================================================");
                    for (int i = 0; i < buku.size(); i++) {
                        BukuAlamat a = buku.get(i);
                        System.out.print((i + 1) + "\t");
                        a.Row();
                    }
                    System.out.print("Masukkan nomor entri yang ingin dihapus : ");

                    int nomorhapus;
                    try {
                        nomorhapus = Integer.parseInt(input.nextLine());
                    } catch (NumberFormatException nfe) {
                        nomorhapus = 0;
                    }

                    try {
                        if (nomorhapus > 0) {
                            buku.remove(nomorhapus - 1);
                            System.out.println("\nData telah terhapus");
                        } else {
                            System.out.println("\nTidak ada nomor tersebut pada entri");
                        }
                    } catch (Exception e) {
                        System.out.println("\nTidak ada nomor tersebut pada entri");
                    }

                    break;
                case 4:
                    System.out.println("==============================================");
                    System.out.println("No \t Nama \t\t\t Alamat \t\t\t No. Telepon \t\t Email");
                    System.out.println("==============================================");
                    for (int i = 0; i < buku.size(); i++) {
                        BukuAlamat a = buku.get(i);
                        System.out.print((i + 1) + "\t");
                        a.Row();
                    }
                    break;
                case 5:
                    mainkan = false;
                    break;
                default:
                    System.out.println("\nInput Number In Menu");
                    break;
            }
        }

    }

}

