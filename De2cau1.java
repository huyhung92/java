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
public class De2cau1 {
    public static void main(String[] args) {
        System.out.println("Cau 1");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println ("Nhap so: ");
        int n = scanner.nextInt();
        ArrayList<Integer> fibonacciLists = new ArrayList<>();
        
        for (int i = 0; i <= n; i++){
            if (i == 0){
                fibonacciLists.add(0);
            } else if (i == 1){
                fibonacciLists.add(1);            
            } else {
                int nextFibo = fibonacciLists.get(i - 1) + fibonacciLists.get(i - 2);
                fibonacciLists.add(nextFibo);
            }
            int sum = 0;
            for (int num : fibonacciLists) {
                sum += num;
            }
            System.out.println("Day so fibonacci: " + fibonacciLists);
            System.out.println("Tong cua day so: " + sum);
            scanner.close();
        }
    }
}
