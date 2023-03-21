/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas1;

/**
 *
 * @author LENOVO
 */
public class Tugas1 {
    String  nama, alamat;
    int umur;
    
    void berjalan(){
        System.out.println(nama+"sedang berjalan");
    }
    void berlari (){
        System.out.println(nama+ "sedang berlari");
    }
    
    public static void main(String[] args) {
        Tugas1 s = new Tugas1();
        s.nama ="Pinkan";
        s.umur =19;
        s.alamat ="Surabaya";
        System.out.println("\n"+s.nama+"berumur"+s.umur+"tahun dan beradadi"+s.alamat);
        s.berjalan();
        
        s.nama ="Rahma";
        s.umur =18;
        s.alamat ="Bandung";
        System.out.println("\n"+s.nama+"berumur"+s.umur+"tahun dan beradadi"+s.alamat);
        s.berlari();
        
        
    }
}
