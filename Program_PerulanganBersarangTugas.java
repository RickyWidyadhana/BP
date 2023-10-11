/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program_perulanganbersarangtugas;

/**
 *
 * @author Ricky
 */
import java.util.Scanner ; 
public class Program_PerulanganBersarangTugas {
    public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.println("Program segitiga angka baris");
    System.out.print("Masukkan angka = ");
    int angka = s.nextInt ();
    for (int i = 0; i < angka; i++){
        for (int j = 1; j <= i + 1; j++){
            System.out.print(j+"   ");
        }
        System.out.println("Baris" + i);
        }  
    } 
}
