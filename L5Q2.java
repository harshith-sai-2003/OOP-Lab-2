/*
2.	Create a class with integer array of size 10 and write methods to perform following:-
a.	Input values into an array
b.	Display the values
c.	Display the largest value
d.	Display the average
e.	Sort the array in ascending order
Completed!
 */
package lab5;
import java.util.Scanner;

class Q2{
    int arr[]=new int[10],n,i,j,temp;
    Scanner in=new Scanner(System.in);
    void input(){
        System.out.print("Enter the number of values to be entered in the array: ");
        n=in.nextInt();
        System.out.println("Enter the values into the array:");
        for(i=0;i<n;i++)
            arr[i]=in.nextInt();
    }
    
    void disp(){
        System.out.println("Entered values are: ");
        for(i=0;i<n;i++)
            System.out.printf("%d\t",arr[i]);
        System.out.println();
    }
    
    void largest(){
        int max=arr[n];
        for(i=0;i<n;i++){
            if(max<arr[i])
                max=arr[i];
        }
        System.out.println("Largest value in the array is "+max+".");
    }
    
    void average(){
        int sum=0;
        float av;
        for(i=0;i<n;i++)
            sum+=arr[i];
        av=sum/n;
        System.out.println("The average of given array is "+av+".");
    }
    
    void sort(){
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Sorted array is: ");
        for(i=0;i<n;i++)
            System.out.printf("%d\t", arr[i]);
        System.out.println();
    }
}

public class L5Q2 {
    public static void main(String[] args){
        Q2 subject=new Q2();
        subject.input();
        subject.disp();
        subject.largest();
        subject.average();
        subject.sort();
    }
}
