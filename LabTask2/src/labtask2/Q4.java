/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask2;
import java.util.*;
import java.util.Collections;
  class Cinema{
String genre, year;
double revenue;

    public Cinema(String genre, String year, double revenue) {
        this.genre = genre;
        this.year = year;
        this.revenue = revenue;
    }

    public String getGenre() {
        return genre;
    }

    public String getYear() {
        return year;
    }

    public double getRevenue() {
        return revenue;
    }

    @Override
    public String toString() {
        return "Cinema{" + "genre=" + genre + ", year=" + year + ", revenue=" + revenue + '}';
    }

                    }
class genreComparator implements Comparator<Cinema>{

    @Override
    public int compare(Cinema o1, Cinema o2) {
return o1.getGenre().compareTo(o2.getGenre());
    }
    
}

class Q4 {
                public static void main(String[] args) {
    LinkedHashSet <Cinema>L1 = new LinkedHashSet<>();
    L1.add(new Cinema("horror","2008",20000));
             L1.add(new Cinema("action","2000",30000));
    L1.add(new Cinema("documentary","2014",12000));
    L1.add(new Cinema("funny","2010",120000));
    L1.add(new Cinema("18+","2024",300000));
TreeSet<Cinema>T1=new TreeSet<>(new genreComparator());
T1.addAll(L1);
System.out.println("Sorted by genre");
for(Cinema c:T1){
    System.out.println(c);
}
Cinema Hprofit = null;
for(Cinema c:L1){
    if(Hprofit==null||c.getRevenue()>Hprofit.getRevenue()){
        Hprofit=c;
    }
}
System.out.println("Highest Profit Cinema"+ Hprofit);
String year = "2014";
double total=0;
for(Cinema c:L1){
    if(c.getYear().equals(year)){
        total+=c.getRevenue();
    }
}
System.out.println("total revenue of "+year+": "+total);


                    
                }
}
