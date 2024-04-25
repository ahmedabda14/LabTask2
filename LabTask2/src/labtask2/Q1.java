/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labtask2;
import java.util.*;
/**
 *
 * @author 2270576
 */
public class Q1 {

public static <T> void find(List <T>list){
    Map<T,Integer>count=new HashMap<>();
    for(T element:list){
    count.put(element, count.getOrDefault(element, 0)+1);
    }
    for(Map.Entry<T,Integer>entry:count.entrySet()){
        if(entry.getValue()>1){
            System.out.print(entry.getKey()+" ");
        }
    }
    System.out.println();
}
    public static void main(String[] args) {
List<Integer> intList = new ArrayList<>();
intList.add(1);
intList.add(2);
intList.add(3);
intList.add(2);
intList.add(2);
find(intList);
List<String> strList = new ArrayList<>();
strList.add("app");
strList.add("mic");
strList.add("min");
strList.add("app");
strList.add("app");
find(strList);

    }
    
}
