package day7mapps;

import java.util.*;
// example of hash map  

class parv{
    public static void main(String[] args) {
        Map<String,Integer>m=new HashMap<String,Integer>();
        m.put("lokesh",34);
        m.put("ayush",7878);
        System.out.println(m.get("ayush"));

        // agr mujhe check karna h ki vha par wo exist karta h ki nhi 

        if(m.containsKey("ayush")){
            System.out.println("true");
        }
    }
}



