/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp1_integer;

import java.io.File;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LP1_integer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Random rand = new Random();
        File file = new File("Lab08_01.txt");
        PrintWriter pr = new PrintWriter(file);
            for (int i = 0; i <=99; i++) {
                pr.write(rand.nextInt(100)+" ");
            }
            pr.close();
            Scanner sc = new Scanner(new File("Lab08_01.txt"));
            while (sc.hasNext()) {
                String next = sc.next();
                System.out.println(next);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
