/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author User
 */
public class TP2 {
    public static void main(String[] args) throws Exception {
    int a = 5, b = 0;
    int c = a / b;
    if(c <= 0)
    {
        throw new ArithmeticException("Ada Kesalahan");
    }
    else
    {
        System.out.println("Benar");
    }
    }   
}
