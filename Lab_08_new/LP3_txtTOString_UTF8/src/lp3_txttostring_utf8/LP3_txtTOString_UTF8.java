/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp3_txttostring_utf8;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LP3_txtTOString_UTF8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\Admin\\Documents\\CSE110\\LAB_\\Lab_08_new\\LP3_txtTOString_UTF8\\test.txt"));
            DataOutputStream  br = new DataOutputStream (new FileOutputStream("Lab08_03.dat"));
            DataInputStream bir  = new DataInputStream(new FileInputStream("Lab08_03.dat"));
            while (sc.hasNext()) {
                String s = sc.next();
                br.writeUTF(s);
                System.out.print(bir.readUTF()+" ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
