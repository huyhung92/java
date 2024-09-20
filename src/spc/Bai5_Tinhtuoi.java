/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc;
import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author HUNG-THUONG
 */
public class Bai5_Tinhtuoi {
    public static void main(String[] args) {
        System.out.print("Chuong trinh Quan ly sinh vien");
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap ho va ten: ");
        String hoten = sc.nextLine();
            
        System.out.print("Nhap nam sinh cua ban: ");
        int namsinh = sc.nextInt();
            
        System.out.print("Chao ban " + hoten);
        int tuoi = Year.now().getValue() -namsinh;
        System.out.print("Tuoi cua ban la " + tuoi);
    }
}
