package day14Scope;
import java.util.*;
class Diffrence{
    int[]elements;
    int maximumDiffrence;
    Diffrence(int m[]){
        elements=m;
    }
    public void computeDifference(){
        Arrays.sort(elements);
        maximumDiffrence=elements[elements.length-1]-elements[0];
    }
}

public class parv {

    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int [] a=new int[n];
       for (int i=0;i<n;i++){
        a[i]=sc.nextInt();
       }
       Diffrence diff=new Diffrence(a);
       diff.computeDifference();
       System.out.print(diff.maximumDiffrence);
    }
}
