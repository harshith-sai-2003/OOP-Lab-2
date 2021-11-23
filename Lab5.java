/*Create a class Result with 2D array and 1D array as its data members. And write methods to perform the following tasks:-
a.	Store marks of 3 subjects obtained by 3 students in 2D array
b.	To store total marks obtained by each student in 1D array.
c.	To find the highest marks in each subject and the roll number of the student who secured it.
d.	To find the student who obtained the highest total marks.
Completed!
*/

package lab5;
import java.util.*;

class Result{
    int score[][]=new int[10][10], total[]=new int[10],i,j;
    Scanner in=new Scanner(System.in);
    void storeMarks(){
        for(i=0;i<3;i++){
            System.out.println("Enter the marks of student "+(i+1));
            for(j=0;j<3;j++){
                System.out.print("Enter the marks of subject "+(j+1)+": ");
                score[i][j]=in.nextInt();
            }
            System.out.println();
        }
    }
    
    void totalMarks(){
        for(i=0;i<3;i++){
           total[i]=score[i][0]+score[i][1]+score[i][2];
        }
    }
    
    void highestMarks(){
        int max,roll=0;
        for(i=0;i<3;i++){
            max=score[3][i];
            for(j=0;j<3;j++){
                if(max<score[j][i]){
                    max=score[j][i];
                    roll=j+1;
                }
            }
           System.out.println("The highest marks in subject "+(i+1)+" are "+max+".");
           System.out.println("The highest marks is secured by roll number "+roll+".");
           System.out.println();
        }
    }
    
    void highestTotal(){
        int max=0,roll=0;
        System.out.print("Highest total marks are: ");
        for(i=0;i<3;i++){
            max=total[1];
                if(max<total[i]){
                    max=total[i];
                    roll=i+1;
            }
        }
        System.out.println(max);
        System.out.println("Highest total marks is secured by roll number "+roll+".\n");
    }
}
public class Lab5 {

    public static void main(String[] args) {
        Result students=new Result();
        students.storeMarks();
        students.totalMarks();
        students.highestMarks();
        students.highestTotal();
    }
    
}