package day20sorting;

import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
             a[i]=sc.nextInt(); 
        }
        int noofswapping=0;
        int temp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    noofswapping++;

                }
            }
        }
         System.out.println("Array is sorted in " +noofswapping + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);
    }
}
