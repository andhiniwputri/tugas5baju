/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5pbo;

/**
 *
 * @author Acer
 */
public class baju {
    String jenis;
    int jumlah;
    int harga;
     
    public baju(String a, int b){
    this.jenis = a;
    this.jumlah = b;

}

    final int bajuA = 100000;
    final int bajuB = 125000;
    final int bajuC = 175000;

    void hargaA(){
        if (jumlah > 100){
            harga = 95000;
        } else {
            harga = bajuA; 
        }
    }
    void hargaB(){
        if (jumlah > 100){
            harga = 120000;
        } else {
            harga = bajuB; 
        }

    }
    void hargaC(){
        if (jumlah > 100){
            harga = 160000;
        } else {
            harga = bajuC; 
        }
    }

    void output(){
        if (jenis.equalsIgnoreCase("a")){
            hargaA();
        } else if (jenis.equalsIgnoreCase("b")){
            hargaB();
        } else if (jenis.equalsIgnoreCase("c")){
            hargaC();
        }

        System.out.println("Jenis yang ingin anda beli  : " + jenis);
        System.out.println("Harga per buah              : " + harga);
        System.out.println("Total harga                 : " + harga * jumlah);
    }

}
