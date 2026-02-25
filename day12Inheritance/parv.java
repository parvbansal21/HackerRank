package day12Inheritance;
import java.util.*;

class Person{
    protected  String firstName;
    protected String lastname;
    protected int idNumber;
    Person(String firstName, String lastname, int idNumber){
         this.firstName=firstName;
         this.lastname=lastname;
         this.idNumber=idNumber;
    } 
    public void printPerson(){
        System.out.println("Name: "+lastname+", "+firstName);
         System.out.println("ID: "+idNumber);
        
    }
}   
class Student extends Person{
    private int[] testScores;
    Student(String firstName, String lastname, int idNumber, int [] testScores){
        super(firstName, lastname, idNumber);
        this.testScores=testScores;
    }
    public char calculate(){
        int sum=0;
        for(int score:testScores){
            sum+=score;
        }
        int average=sum/testScores.length;
        if(average >= 90) return 'O';
        else if(average >= 80) return 'E';
        else if(average >= 70) return 'A';
        else if(average >= 55) return 'P';
        else if(average >= 40) return 'D';
        else return 'T';

    }
}
public class parv {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String firstName=sc.next();
        String lastname=sc.next();
        int id=sc.nextInt();
        int numScores=sc.nextInt();
        int[] testScores=new int[numScores];

        for(int i =0;i<numScores;i++){
            testScores[i]=sc.nextInt();
        }
        Student s = new Student(firstName, lastname, id, testScores);

        s.printPerson();
        System.out.println("Grade: " + s.calculate());


        
    }
   
}
