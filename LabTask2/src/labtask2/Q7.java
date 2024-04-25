/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask2;

class Node{
    int data; Node next;
    
    Node(int data){
        this.data=data;
        this.next=next;
    }
    class List{
        Node head;
        void remove(){
            if(head==null||head.next==null){
                return;
            }
            Node s =head;
            Node f =head;
            
            while(f.next!=null&&f.next.next!=null){
                s=s.next;
                f=f.next.next;
            }
            s.next=null;
        }
    }
}

