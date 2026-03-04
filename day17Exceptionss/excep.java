package day17Exceptionss;

// try and catch 
public class excep {
    
    public static void main(String[] args) {
        try {
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("cannot divide by zero ");
        }

        System.out.println("program continues");
    }
}
