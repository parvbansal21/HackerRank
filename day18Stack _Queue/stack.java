import java.util.*;

class Solution {

    Stack<Character> stack = new Stack<>();
    Queue<Character> queue = new LinkedList<>();

    void pushCharacter(char ch) {
        stack.push(ch);
    }

    void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    char popCharacter() {
        return stack.pop();
    }
// yo
    char dequeueCharacter() {
        return queue.remove();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Solution obj = new Solution();

        for(int i = 0; i < s.length(); i++){
            obj.pushCharacter(s.charAt(i));
            obj.enqueueCharacter(s.charAt(i));
        }

        boolean isPalindrome = true;

        for(int i = 0; i < s.length()/2; i++){
            if(obj.popCharacter() != obj.dequeueCharacter()){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("The word, " + s + ", is a palindrome.");
        }
        else{
            System.out.println("The word, " + s + ", is not a palindrome.");
        }
    }
}
// yooooo
// ya
// pp