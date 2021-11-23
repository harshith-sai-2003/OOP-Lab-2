//4.Write a Java program to implement stack class.
//Completed!
package lab5;

class Stack{
    int s[]=new int[10];
    int tos;
    Stack(){
        tos=-1;
    }
    void push(int a){
        if(tos==9)
            System.out.println("Stack is full.");
        else
            s[++tos]=a;
    }
    int pop(){
        int ele=0;
        if(tos==-1)
            System.out.println("Stack is empty.");
        else
            ele=s[tos--];
        return ele;
    }
}

public class L5Q4 {
    public static void main(String[] args){
        int i,out;
        Stack s1=new Stack();
        for(i=0;i<10;i++)
            s1.push(i+1);
        for(i=0;i<10;i++){
            out=s1.pop();
            System.out.printf("%d\t",out);
        }
        System.out.println();
    }
}
