/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukualamat;



/**
 *
 * @author admin
 */
public class BukuAlamat {

private String nama;
private String alamat;
private String nomorTelepon;
private String alamatEmail;

    public BukuAlamat() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getAlamatEmail() {
        return alamatEmail;
    }

    public void setAlamatEmail(String alamatEmail) {
        this.alamatEmail = alamatEmail;
    }

        public void Detail(){
            System.out.println("Nama :" +this.getNama());
            System.out.println("Alamat :" +this.getAlamat());
            System.out.println("Nomor Telepon : " +this.getNomorTelepon());
            System.out.println("Alamat Email : " +this.getAlamatEmail());
        }
        
        public void Row(){
            System.out.println(this.getNama() + " \t\t " + this.getAlamat() + " \t\t " 
            + this.getNomorTelepon() + " \t\t " + this.getAlamatEmail() + " \t\t ");
        }
}
        

