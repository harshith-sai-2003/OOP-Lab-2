/*
2.Create two classes Bike and Splendar. 
Splendar class extends Bike class and overrides its run() method. 
Write a complete Java program to implement the runtime polymorphism. 
Include a member called “speedlimit” in both the classes with different values. 
The run() method should give the information of speed limit. 
Check whether the runtime polymorphism can be achieved through the data members.
Completed!
*/
package lab5;

class Bike{
    int speedlimit=80;
    void run(){
        System.out.println("Speed limit of a bike is "+speedlimit+"km/h.");
    }
}

class splender extends Bike{
    int speedlimit=60;
    void run(){
        System.out.println("Speed limit of splender is "+speedlimit+"km/h");
    }
}

public class L6Q2 {
    public static void main(String[] args){
        Bike b=new Bike();
        splender s=new splender();
        Bike ref;
        
        ref=b;
        ref.run();
        
        ref=s;
        ref.run();
    }
}
