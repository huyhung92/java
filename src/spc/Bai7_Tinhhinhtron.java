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
public class Bai7_Tinhhinhtron {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh hinh tron");
        Scanner sc = new Scanner (System.in);
        double bankinh, chuvi, dientich;  
        System.out.print ("Nhap ban kinh: ");
        bankinh = sc.nextDouble();
        
        
        chuvi = Math.PI * bankinh * 2;
        dientich = Math.PI * bankinh * bankinh;
        
        System.out.println("chuvi: " + Double.toString(chuvi));
        System.out.println("dientich: " + Double.toString(dientich));
        
    }
}
