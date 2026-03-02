package day16Exceptions;

import java.io.*;



public class parv {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();
        try{
            int m=Integer.parseInt(S);
            System.out.println(m);
        }catch(Exception e){
            System.out.println("Bad String");
        }
        bufferedReader.close();
    }
}
// yo
// yo