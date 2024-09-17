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
public class Bai4_Pheptinhcoban {
    public static void main(String[] args) {
        System.out.println("Chương trình tính hiệu 2 số thập phân");
        int a,b;
        Scanner sc = new Scanner (System.in);        
        System.out.print ("Nhap so a: ");
        a = sc.nextInt();        
        System.out.print ("Nhap so b: ");
        b = sc.nextInt();
        
        
        int tong;
        tong = a + b;
        System.out.println(a + " + " + b + " = " + tong);
        
        int hieu;
        hieu = a - b;
        System.out.println(a + " - " + b + " = " + hieu);
        
        int tich;
        tich = a*b;
        System.out.println(a + " * " + b + " = " + tich);
        
        int thuong;
        
        
}
    public static int tingtong (int a, int b){
        return a+b;
    }
    public static int tinghieu (int a, int b){
        return a-b;
    }
    public static int tingtich (int a, int b){
        return a*b;
    }
    public static int tingthuong (int a, int b){
        return a/b;
    }
    public static double tinhthuong(int a, int b){
        if (b == 0) {
            return -1;
        } else {
            return (double) a/b;
        }
    }
    
    public static String tinhthuongD(int a, int b){
        if ( b == 0) {
            return "Khong the chia cho 0";
        } else {
            return Double.toString((double)a/b);
        }
    }
}
