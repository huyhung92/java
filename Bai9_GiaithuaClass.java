/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc;
import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class Bai9_GiaithuaClass {
    public static void main(String[] args){
        System.out.println("Tinh giai thua");
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap so: ");
        int so = sc.nextInt();
        int giaithua = 1;
        
        for (int i = 1; i <= so; i++){
            giaithua = giaithua * i;
        }
        
        System.out.printf("Giai thua cua %d! = %d",so,giaithua);
        
    }
}
