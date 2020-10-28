/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119003.latihan23nilaiterbesarterkecil;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author User
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk menentukan nilai terkecil dan 
 * terbesar dari nilai mahasiswa
 */

public class NilaiTerkecilTerbesar {

    /**
     * @param args the command line arguments
     */
    static Scanner scan = new Scanner(System.in);
    int nilai[];
    String petugas;

    private void masukkanData(){
        System.out.print("Masukkan Nama Petugas : ");
        petugas = scan.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");        
        int jumlah = scan.nextInt();
        nilai = new int[jumlah];
        for(int i = 0; i < jumlah; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" = ");
            nilai[i] = scan.nextInt();
        }
    }        
    
    private int nilaiTerkecil(){
        int nilaiTerkecil = nilai[0];
        for(int x : nilai){
            if(nilaiTerkecil > x){
                nilaiTerkecil = x;
            }            
        }        
        return nilaiTerkecil;
    }        
    
    private int nilaiTerbesar(){
        int nilaiTerbesar = nilai[0]; 
        for(int x : nilai){           
           if(nilaiTerbesar < x){
                nilaiTerbesar = x;
           }            
        }        
        return nilaiTerbesar;
    }
    
    private void tampilNilai(){
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        int num = 1;
        for(int x : nilai){
            System.out.println("Nilai Mahasiswa ke-"+num+" = "+x);
            num++;
        }
        System.out.println("\nNilai Terbesar adalah "+nilaiTerbesar());
        System.out.println("Nilai Terkecil adalah "+nilaiTerkecil());
        System.out.println("\nPetugas : "+petugas);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here        
        NilaiTerkecilTerbesar data = new NilaiTerkecilTerbesar();
        data.masukkanData();        
        data.tampilNilai();        
        System.out.println("Developed by : Ivan Faathirza");
    }
    
}
