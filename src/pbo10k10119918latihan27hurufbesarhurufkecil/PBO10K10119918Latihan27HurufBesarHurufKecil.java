/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan27hurufbesarhurufkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Andreas Suryadi
 * KELAS    : IF-10K
 * NIM      : 10119918
 * Deskripsi Program : Menampilkan kalimat menjadi hruf besar dan huruf kecil
 *
 */

public class PBO10K10119918Latihan27HurufBesarHurufKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kalimat, kalimatHurufBesar, kalimatHurufKecil;

        System.out.print("Masukkan kalimat : ");
        kalimat = scanner.nextLine();
        
        System.out.println();

        kalimatHurufBesar = kalimat.toUpperCase();
        kalimatHurufKecil = kalimat.toLowerCase();

        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + kalimatHurufBesar);
        System.out.println("Huruf Kecil : " + kalimatHurufKecil);
    }
    
}
