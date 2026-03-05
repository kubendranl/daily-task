
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
    //ArrayList to  sort the both list .first we creating a ArrayList .
    //then store a head value in temp ,while we checking the temp is not equal null
    //add temp data to ArrayList. then move next. after moving next temp becomes null
    //then restoring the values in temp.using collections.sort to sort the ArrayList
    //array val to convert node type
    
    void sort(){
        ArrayList<Integer> values=new ArrayList<>();
        Node temp=head;
        while(temp!=null){
            values.add(temp.data);
            temp=temp.next;
        }
        temp=head;
        Collections.sort(values);
        for(int val:values){
            temp.data=val;
            temp=temp.next;
        }
    }
    static Node merge(Node head1,Node head2){
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        
//manual way to find the first smallest node first.so first we checking the
//head1 and head2 values .then compare two  value to find frist smallest node 
 //that node pointing to the reshead.head2 node is smallest .then reshead point to 
//that node
        
        // Node reshead;
        // if(head1.data<head2.data){//1 2 3 4 5 6
        //     reshead=head1;
        //     head1=head1.next;
        // }else{
        //     reshead=head2;
        //     head2=head2.next;
        // }
        
//anthor way to solve this part .creating a dummy node .
//it handle first element 
        Node dummy=new Node(0);
        Node temp=dummy;
        
        // Node temp=reshead;//1 2 3 4 5 6
        while(head1!=null && head2!=null){//h1-1 3 5   h2-2 4 6
            if(head1.data<head2.data){//1
                temp.next=head1;
                head1=head1.next;
            }else{
                temp.next=head2;
                head2=head2.next;
            }
            temp=temp.next;
        }
        if(head1!=null){
            temp.next=head1;
        }else{
            temp.next=head2;
        }
        return dummy.next;
        
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        Linked l1=new Linked();
        Linked l2=new Linked();
        int val;
        
        do{
            val=s.nextInt();
            if(val!=-1){
                l1.insert(val);
            }
        }while(val!=-1);
        
        do{
            val=s.nextInt();
            if(val!=-1){
                l2.insert(val);
            }
        }while(val!=-1);
        
        l1.sort();
        l2.sort();
        
        Node resh=Linked.merge(l1.head,l2.head);
        Linked res=new Linked();
        res.head=resh;
        res.display();
        
        
    }
}