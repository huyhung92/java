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
public class Bai3_Tinh2sothapphan {
    public static void main(String[] args) {
        System.out.println("Chương trình tính hiệu 2 số thập phân");
        double a,b, hieu;
        Scanner sc = new Scanner (System.in);
        
        System.out.print ("Nhap so a: ");
        a = sc.nextDouble();
        
        System.out.print ("Nhap so b: ");
        b = sc.nextDouble();
        hieu = a - b;
        System.out.println(a + " - " + b + " = " + hieu);
    }
}
