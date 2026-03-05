/*
1)check for balanced parentheses in an expression using a stack in java::
Logic::
..Create a stack.
..Traverse each character of the expression.
..If opening bracket → push into stack.
..If closing bracket:
..If stack is empty → not balanced.
..Pop from stack and check if it matches.
..At the end:
..If stack is empty → balanced.
..Otherwise → not balanced.
*/
import java.util.*;
class Node{
    char data;
    Node next;
    
    Node(char val){
        data=val;
        next=null;
    }
}
class Stack{
    Node top;
    
    void push(char val){
        Node newnode=new Node(val);
    
        newnode.next=top;
        top=newnode;
    }
    boolean isempty(){
        return top==null;
    }
    char pop(){
      if(isempty()){
          return '\0';
      }
      char value=top.data;
      top=top.next;
      return value;
    }
}
    public class Main
{
    static boolean isexpression(String exp){
        Stack st=new Stack();
        
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }else if(c==')'|| c=='}'|| c==']'){
                
                if(st.isempty()){
                    return false;
                }
                char top=st.pop();
                if((c==')' && top!='(')||(c=='}'&&top!='{')||(c==']'&& top!='[')){
                    return false;
                }
            }
        }
        return st.isempty();
    }

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
        String expression=s.nextLine();
        if(isexpression(expression)){
            System.out.print("Balanced");
        }else{
            System.out.print("Not Balanced");
        }
	}
}