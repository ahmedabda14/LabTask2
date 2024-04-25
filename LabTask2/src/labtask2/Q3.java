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
public class Q3 {
            public static void main(String[] args) {
   PriorityQueue <Integer> p1 = new PriorityQueue<>();         
            for(int i=1;i<31;i++)
                p1.add(i);
               PriorityQueue <Integer> p2 = new PriorityQueue<>();         
while(!p1.isEmpty()){
    int num =p1.poll();
    if(num%5==0&&num%3==0){
        p2.add(num);
    }
}

while(!p2.isEmpty()){
    System.out.println(p2.poll());
}
            
            }
}
