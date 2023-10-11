/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program_menentukanganjil_for;

/**
 *
 * @author Ricky
 */
import java.util.Scanner ;
public class Program_MenentukanGanjil_For {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Program menampilkan bilangan yang ganjil pada deret angka");
        System.out.print("Masukkan N = ");
        int N = s.nextInt();
        for(int i = 1; i <= N; i++){
            if(i%2!=0){
            System.out.print(i+"   ");
            }
        }
    System.out.println("");
    }  
}
