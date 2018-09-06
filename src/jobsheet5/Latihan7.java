/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet5;

/**
 *
 * @author User
 */
public class Latihan7 {
    public static void main(String[] args) {
        try{
            String s = "LIMA";
            int i = Integer.parseInt(s);
            System.out.println("int calue = "+i);
        }
        catch(NumberFormatException nfe){
            nfe.printStackTrace();
        }
    }
}
