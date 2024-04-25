/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask2;
import java.util.*;
/**
 *
 * @author 2270576
 */
public class Q2 {
        public static void main(String[] args) {
            
            TreeSet<Integer>ts=new TreeSet<>();
            Scanner kb = new Scanner (System.in);
            int input;
            ts.add(23);  ts.add(44);  ts.add(45);  ts.add(46);
              ts.add(55);  ts.add(100);  ts.add(2222);  ts.add(100000);
              System.out.println();
              input = kb.nextInt();
              System.out.print("Less Than Element: "+ts.headSet(input)+" ");
       System.out.println();
              System.out.print("higher Than Element: "+ts.tailSet(input)+" ");
}
}
