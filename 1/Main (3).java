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
        while(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    void rotation(int k){
        Node temp=head;
        int count=0;
        //counting the size
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int arr[]=new int[count];
        int arr1[]=new int[count];
        
        for(int i=0;i<count;i++){
            arr[i]=temp.data;
            temp=temp.next;
        }
        int n=0;
        while(k>n){
        for(int i=0;i<count;i++){
            if(i==0){
                arr1[i]=arr[count-1];
                // arr1[count-1]=arr[i];
            }else{
                arr1[i]=arr[i-1];
                // arr1[i-1]=arr[i];
            }
        }
        for(int i=0;i<count;i++){
            arr[i]=arr1[i];
        }
        n++;
        }
        for(int i=0;i<count;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
// 		System.out.print("number testcase perform:");
// 		int testcase=s.nextInt();
		int c=0;
// 		while(testcase>c){
		Linked l=new Linked();
		System.out.print("size:");
		int n=s.nextInt();
		System.out.print("kth element:");
		int k=s.nextInt();
		System.out.print("node element:");
		for(int i=0;i<n;i++){
		    int a=s.nextInt();
		    l.insert(a);
		}
		l.rotation(k);
// 		c++;
// 		}
	}
}
/*
I/P
user enter testcase: 2
   user enter size :6
   unser enter kth rotation:10
    7 8 9 10 12 14
    
    sixe-6   kth val-8
    4 8 12 14 16 18
    
    O/P
after kth 10 rotation::
9 10 12 14 7 8

after kth 8 rotation::
16 18 4 8 12 14
*/