//5.Write a JAVA program which contains a method square()
// such that square(3) returns 9, square(0.2) returns 0.04.
//Completed!

package lab5;

class square{
    double a,sq;
    double Square(double a){
        return sq=a*a;
    }
}

public class L5Q5 {
    public static void main(String[] args){
        double a=0.2;
        square s1=new square();
        System.out.printf("Square of %.2f is %.2f.",a,s1.Square(a));
    }
}
