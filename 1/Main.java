/singly linkedlist print even in first then print odd in last

import java.util.*;

class Node{
    int data;
    Node next;
    
    Node(int val){
        data=val;
        next=null;
    }
}
class Linked{
    Node head;
    
    void insert(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    void display(){
        Node temp=head;
        int count=0;
        int even=0;
        int odd=0;
        while(temp!=null){
            if(temp.data%2==0){
                even++;
            }else{
                odd++;
            }
            count++;
            temp=temp.next;
        }
        temp=head;
        int arr[]=new int[count];
        int evenarr[]=new int [count];
        int oddnarr[]=new int [odd];
       for(int i=0;i<count;i++){
           arr[i]=temp.data;
           temp=temp.next;
       }
       //check even
       int k=-1;
       for(int i=0;i<count;i++){
           if(arr[i]%2==0){
               evenarr[++k]=arr[i];
           }else{
               evenarr[even++]=arr[i];
           }
           }
        for(int i=0;i<count;i++){
           System.out.print(evenarr[i]+" ");
    }
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Linked l=new Linked();
		int n=s.nextInt();
		for(int i=0;i<n;i++){
		    int a=s.nextInt();
		    l.insert(a);
		}
		l.display();
	}
}