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
import java.util.Scanner;
public class Tugas5pbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.println("Baju yang ada :");
        int bajuA = 100000;
        System.out.println("Baju A dengan harga " + bajuA);
        int bajuB = 125000;
        System.out.println("Baju B dengan harga " + bajuB);
        int bajuC = 175000;
        System.out.println("Baju C dengan harga " + bajuC);
        System.out.print("Baju yang akan kamu beli bertipe : ");
        String jenis = in.nextLine();
        System.out.print("Jumlah baju yang akan kamu beli adalah : ");
        int jumlah = in.nextInt();
        
        baju baju = new baju(jenis, jumlah);
        baju.output();

        


    }
    
}

    
    

