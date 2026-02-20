package day7quesmapss;


import java.util.*;
public class parv {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine(); 
        Map<String,Integer>p=new HashMap<String,Integer>();
        for(int i=0;i<n;i++){
            String name=sc.next();
            int phone=sc.nextInt();
            sc.nextLine(); 
            p.put(name,phone);

        }
        while(sc.hasNext()) { 
            String s=sc.next();
            if(p.containsKey(s)){
                int num =p.get(s);
                System.out.println(s+"="+num);
            }else{
                System.out.println("Not found");
            }
            
        }  

    }
    
}
