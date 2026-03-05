//reverse a linkedList--

//Singly linkedList--

// import java.util.*;

// class Node{
//     int data;
//     Node next;
    
//     Node(int val){
//         data=val;
//         next=null;
//     }
// }
// class Singly{
//     Node head;
    
//     void insert(int val){
//         Node newnode=new Node(val);
//         while(head==null){
//             head=newnode;
//             return;
//         }
//         Node temp=head;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next=newnode;
//     }
//     void reverse(){
//         Node prev=null;
//         Node curr=head;
//         Node next=null;
        
//         while(curr!=null){
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         head=prev;
//     }
//     void display(){
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//     }
// }
// public class Main
// {
// 	public static void main(String[] args) {
// 		Scanner s=new Scanner(System.in);
// 		Singly ss=new Singly();
// 		int n=s.nextInt();
// 		int a;
// 		for(int i=0;i<n;i++){
// 		    a=s.nextInt();
// 		    ss.insert(a);
// 		}
// 		ss.reverse();
// 		ss.display();
// 	}
// }


//Doubly linkedList--

import java.util.*;

class Node{
    int data;
    Node prev;
    Node next;
    
    Node(int val){
        data=val;
        prev=null;
        next=null;
    }
}
class Doubly{
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
        newnode.prev=head;
    }
    
    
     void reverse(){
            Node current=head;
            Node temp=null;
            while(current!=null){
            
            temp=current.prev;
            current.prev=current.next;
            current.next=temp;
            
            current=current.prev;
        }
          if(temp!=null){
              head=temp.prev;
          }
     }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Doubly b=new Doubly();
		int n=s.nextInt();
		int a;
		for(int i=0;i<n;i++){
		    a=s.nextInt();
		    b.insert(a);
		}
		b.reverse();
		b.display();
	}
}