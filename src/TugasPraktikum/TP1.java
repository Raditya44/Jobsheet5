/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TP1 {
    public static void main(String[] args) {
        try{
           System.out.println("Masukkan Bilangan A : ");
           Scanner input = new Scanner(System.in);
           int a = input.nextInt();
            System.out.println("Masukkan Bilangan B : ");
            int b = input.nextInt();
            int c = (a+b)/0;
        }
        catch(ArithmeticException d){
            d.printStackTrace();  
            System.out.println("Hasilnya adalah : "+d);
        }
    }
}
