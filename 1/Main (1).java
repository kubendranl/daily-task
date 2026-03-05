//swap two node in a linkedlist 
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
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
    void swap(int a,int b){
        Node temp=head;
        Node swap1;
        Node swap2;
        int count=0;
        int count1=0;
        int totcount=0;
        while(temp!=null){
            if(temp.data==a){
                swap1=temp.next;
                count++;
                
            }
            else if(temp.data==b){
                swap2=temp.next;
                count1++;
            }
            totcount++;
            temp=temp.next;
        }
        int arr[]=new int[totcount];
        temp=head;
        for(int i=0;i<totcount;i++){
            arr[i]=temp.data;
            temp=temp.next;
        }
        for(int i=0;i<totcount;i++){
            if(arr[i]==a){
                arr[i]=b;
            }else if(arr[i]==b){
                arr[i]=a;
            }
        }
         for(int i=0;i<totcount;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Linked l=new Linked();

        int n = s.nextInt();
         for(int i=0;i<n;i++){
            int a=s.nextInt();
             l.insert(a);
        }
        int s1=s.nextInt();
        int s2=s.nextInt();
        l.swap(s1,s2); 
    }
}