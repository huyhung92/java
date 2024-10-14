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
public class Bai14_TinhCanChi {
    public static void main(String[] args) {
        System.out.println("Tinh can chi");
        
        Scanner sc = new Scanner (System.in);
        int year;
        System.out.print("Nhap nam ");
        year = sc.nextInt();
        
        String can[] = {"canh", "tan", "nham", "quy", "giap", "at", "binh", "dinh", "mau", "ky"};
        String chi[] = {"than", "dau", "tuat", "hoi", "ty", "suu", "dan", "mao", "thin", "ti", "ngo", "mui"};
        String cn = can[year % 10];
        String ci = chi[year % 12];
        
        System.out.print ("" + cn + "" + ci);
    }
}
