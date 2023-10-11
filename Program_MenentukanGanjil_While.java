/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program_menampilkanbilangan_ganjil;

/**
 *
 * @author Ricky
 */
import java.util.Scanner;
public class Program_MenampilkanBilangan_Ganjil {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Program menampilkan bilangan ganjil pada deret angka");
        System.out.print("Masukkan N = ");
        int N = s.nextInt ();
        int i = 0 ;
        while (i <= N) {
            if (i % 2 != 0 ){
                System.out.print(i +"  ");
            }
            i++ ;
        }
        System.out.println("  ");      
    }  
}
