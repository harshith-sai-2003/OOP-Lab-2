//3. Swap two values using call by value and call by reference.
//Completed!

package lab5;
import java.util.*;

class Swap{
    int p,q;
    reference x,y;
    Swap(int a, int b){
        p=a;
        q=b;
    }
    void vSwap() {
        int temp;
        temp = p;
        p = q;
        q = temp;
        System.out.println("After swapping(Call by value): x=" + p + " y=" + q + ".");
    }
    Swap(reference a,  reference b){
        x=a;
        y=b;
    }
    void rSwap(){
        reference z= new reference(x.a);
        x.a=y.a;
        y.a=z.a;
        System.out.println("After swapping(Call by reference): x="+x.a+" y="+y.a+".");
    }
}

public class L5Q3 {
    public static void main(String[] args){
        int x,y;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two values: ");
        x=in.nextInt();
        y=in.nextInt();
        reference a=new reference(x);
        reference b=new reference(y);
        System.out.println("Before swapping: x="+x+" y="+y+".");
        Swap v=new Swap(x,y);
        Swap r=new Swap(a,b);
        v.vSwap();
        r.rSwap();
    }
}
class reference {
    public int a;

    public reference(int a) {
        this.a = a;
    }
}
