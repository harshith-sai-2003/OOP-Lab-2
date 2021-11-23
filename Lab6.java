/*
1.Create a base class “Game” with method called “type” that prints “indoor & outdoor games”. 
Create a subclass cricket with a method called “type” that prints “cricket is an outdoor game”. 
Create one more subclass of “Game” called “chess” with a method “type” that prints “chess is an indoor game”. 
Write a complete Java program for the above to understand the Dynamic method dispatch concept.
Completed!
*/
package lab5;

class Game{
    void type(){
        System.out.println("indoor& outdoor games.");
    }
}

class cricket extends Game{
    void type(){
        System.out.println("cricket is an outdoor game.");
    }
}

class chess extends Game{
    void type(){
        System.out.println("chess is an indoor game.");
    }
}

public class Lab6 {
    public static void main(String[] args) {
        Game g=new Game();
        cricket c=new cricket();
        chess ch=new chess();
        Game ref;
        
        ref=g;
        ref.type();
        
        ref=c;
        ref.type();
        
        ref=ch;
        ref.type();
    }
    
}
