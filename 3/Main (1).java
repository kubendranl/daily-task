//I/P-- 1 3 0 2 4 6
//O/P-- 6 4 2 0 1 3 -- even reverse-6 4 2 0  odd reverse-- 1 3
import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int val){
        data=val;
        next=null;
    }
}
class Linkedlist{
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
    
    void reverse(){
        int count=0;
        Node temp=head;
        int evencount=0;
        while(temp!=null){
            if(temp.data%2==0){
                evencount++;
            }
                count++;
            temp=temp.next;
        }
        int even[]=new int[count];
        int odd[]=new int[count];
        int res[]=new int[count];
         int n=0,k=0,m=0;
        temp=head;
        int oddcount=count-evencount;
        while(temp!=null){
            if(temp.data%2==0){
                even[n++]=temp.data;
            }else{
                odd[k++]=temp.data;
            }
        temp=temp.next;
        }
        int j=-1;
        for(int i=evencount-1;i>=0;i--){
            res[m++]=even[i];
            System.out.print("even:"+res[++j]+" ");
        }
        System.out.println();
        
        for(int i=0;i<oddcount;i++){
            res[m++]=odd[i];
            System.out.print("odd:"+res[i]+" ");
        }
        System.out.println();
        
        for(int i=0;i<count;i++){
            System.out.print(res[i]+" ");
        }
        }
    }
public class Main{
    public static void main(String[]args){
        Linkedlist l=new Linkedlist();
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        for(int i=0;i<n;i++){
            // int a=s.nextInt();
            l.insert(s.nextInt());
        }
        l.reverse();
    }
}