/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Tugas2 {
  String nama;
  String nim; 
  String prodi;
  String alamat;
  
  
  void nama(){
          nama ="Pinkan Rahmadani";
 }            
  void nim(){
      nim = "127";
 }     
  void prodi (){
          prodi="Sistem Informasi";
 }
  void alamat(){
      alamat ="Surabaya";
 }
  void keterangan(){
      System.out.println("DATA PRIBADI");
      System.out.println("nama    :"+nama);
      System.out.println("nim    :"+nim);
      System.out.println("prodi    :"+prodi);
      System.out.println("alamat   :"+alamat);
 }
  
    public static void main(String[] args) {
        Tugas2 oop = new Tugas2();
        oop.nama();
        oop.nim();
        oop.prodi();
        oop.alamat();
        oop.keterangan();
        
        Scanner scan = new Scanner (System.in);
        System.out.print("masukan namamu : ");
        String nama = scan.nextLine();
        System.out.println("Nama Anda Adalah : " + nama);
        System.out.print("masukan nim: ");
        String nim = scan.nextLine();
        System.out.println("nim anda adalah: "+ nim);
        System.out.print("masukan prodimu : ");
        String prodi = scan.nextLine();
        System.out.println(" nama prodimu adalah: "+ prodi);
        System.out.print("masukan alamat anda : ");
        String alamat = scan.nextLine();
        System.out.println("alamat anda adalah : " + alamat);
    }
} 

