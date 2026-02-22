import java.io.*;



public class parv {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        
        int count=0;
        int max=0;
        while(n>0){
            int a=n%2;
            if(a==1){
                count++;
                if(count>max){
                    max=count;
                }
            }else{
                    count=0;
            }
            
            n=n/2;
        }
        System.out.println(max);

        bufferedReader.close();
    }
}
