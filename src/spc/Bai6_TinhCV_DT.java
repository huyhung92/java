/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc;

import java.util.Scanner;

/**
 *
 * @author HUNG-THUONG
 */
public class Bai6_TinhCV_DT {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh chu vi dien tich");
        Scanner sc = new Scanner (System.in);
        double dai, rong, chuvi, dientich;  
        System.out.print ("Nhap chieu dai: ");
        dai = sc.nextDouble();
        System.out.print ("Nhap chieu rong: ");
        rong = sc.nextDouble ();
        
        chuvi = (dai + rong) *2;
        dientich = dai * rong;
        
        System.out.println("chuvi: " + Double.toString(chuvi));
        System.out.println("dientich: " + Double.toString(dientich));
        
    } 
}
