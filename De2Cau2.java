/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author SPC
 */
public class De2Cau2 {
    private static void main(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Nhap ban kinh: ");
        
        double bankinh = scanner.nextDouble();
        double dientich = 4 * Math.PI * Math.pow(bankinh, 2);
        double thetichhinhcau = (4.0 / 3.0) * Math.PI * Math.pow(bankinh, 3);
        System.out.println("dien tich:   %.2f" + dientich);
        System.out.println("the tich hinh cau:  %.2f" + thetichhinhcau);
    }
}
