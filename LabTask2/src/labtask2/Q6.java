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
public class Q6 {
                        public static void main(String[] args) {
       TreeMap< Integer,String>map= new TreeMap<>();
           map.put(1,"a");
        map.put(2,"b");
    map.put(3,"c");
    map.put(4,"d");
    Scanner kb = new Scanner(System.in);
        System.out.println("enter value");
    int key =kb.nextInt();
    for(Integer i: map.headMap(key).keySet()){
        System.out.println(map.get(i));
    }
                            
                        }
}
