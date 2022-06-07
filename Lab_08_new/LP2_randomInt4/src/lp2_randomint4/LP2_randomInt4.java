/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2_randomint4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class LP2_randomInt4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Random rand = new Random();
            DataOutputStream pr = new DataOutputStream(new FileOutputStream("Lab08_02.dat"));
            DataInputStream bir = new DataInputStream(new FileInputStream("Lab08_02.dat"));

            String s = " ";
            byte[] b = s.getBytes();
            for (int i = 0; i <= 99; i++) {
                pr.writeInt(rand.nextInt(100));
                pr.write(b);
            }
            pr.close();
//            for (int i = 0; i <= 99; i++) {
//                System.out.print(bir.readInt() + " ");
//            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
