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

public class Latihan6 implements Cloneable{
    public Latihan6 clone() throws CloneNotSupportedException
    {
           return(Latihan6)super.clone();
    }
    public static void main(String[] args) {
        try
        {
            new Latihan6().clone();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }    
}
