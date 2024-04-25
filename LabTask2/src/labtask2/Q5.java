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
public class Q5 {
                    public static void main(String[] args) {
    TreeMap< Integer,String>map= new TreeMap<>();
    map.put(1,"a");
        map.put(2,"b");
    map.put(3,"c");
    map.put(4,"d");

    System.out.println(map);
    Map.Entry<Integer, String>greatestEntry = map.lastEntry();
    System.out.println("greatest key: "+greatestEntry.getKey());    
       
        Map.Entry<Integer, String>leastEntry = map.firstEntry();
    System.out.println("leat key: "+leastEntry.getKey());

                    }
}
