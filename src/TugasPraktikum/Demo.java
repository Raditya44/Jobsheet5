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
public class Demo {
        public static void main(String[] args) {
        try{
            Throw.my();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        }
}
