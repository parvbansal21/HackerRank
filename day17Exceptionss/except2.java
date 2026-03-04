package day17Exceptionss;

// throw 


public class except2 {
    public static void main(String[] args) {
        try {
            int age=-5;
            if(age<0){
                throw new IllegalArgumentException("Age cannot be negative");

            }else{
                System.out.println("valid age");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
