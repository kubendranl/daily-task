//Search for a given value in linkedList--

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
//     void checkval(int check){
//         boolean isfound=false;
//         Node temp=head;
//         while(temp!=null){
//             if(temp.data==check){
//                 isfound=true;
//         }
//         temp=temp.next;
//         }
//         if(!isfound)
//         System.out.println(false);
//         else
//         System.out.println(true);
        
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
// 		int check=s.nextInt();
// 		ss.checkval(check);
// 		ss.display();
// 	}
// }

//Doubly linkedList--

// import java.util.*;

// class Node{
//     int data;
//     Node prev;
//     Node next;
    
//     Node(int val){
//         data=val;
//         prev=null;
//         next=null;
//     }
// }
// class Doubly{
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
//         newnode.prev=temp;
//     }
//     void checkval(int check){
//         boolean isfound=false;
//         Node temp=head;
//         while(temp!=null){
//             if(temp.data==check){
//                 isfound=true;
//         }
//         temp=temp.next;
//         }
//         if(!isfound)
//         System.out.println(false);
//         else
//         System.out.println(true);
        
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
// 		Doubly b=new Doubly();
// 		int n=s.nextInt();
// 		int a;
// 		for(int i=0;i<n;i++){
// 		    a=s.nextInt();
// 		    b.insert(a);
// 		}
// 		int check=s.nextInt();
// 		b.checkval(check);
// 		b.display();
// 	}
// }

//Circular linkedList--

import java.util.*;

class Node{
    int data;
    Node next;
    
    Node(int val){
        data=val;
        next=null;
    }
}
class Circular{
    Node head;
    
    void insert(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            newnode.next=head;
            return;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=head;
    }
    void checkval(int check){
        boolean isfound=false;
        Node temp=head;
        do{
            if(temp.data==check){
                isfound=true;
            }
        temp=temp.next;
        }while(temp!=head);
        
        if(!isfound)
        System.out.println(false);
        else
        System.out.println(true);
    }
    void display(){
        Node temp=head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        while(temp!=head);
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Circular c=new Circular();
		int n=s.nextInt();
		int a;
		for(int i=0;i<n;i++){
		    a=s.nextInt();
		    c.insert(a);
		}
		int check=s.nextInt();
		c.checkval(check);
		c.display();
	}
}