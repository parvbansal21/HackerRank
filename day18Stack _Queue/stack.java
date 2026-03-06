package day18Stack_Queue;

import java.util.*;

class stack {

    Stack<Character> s = new Stack<>();
    Queue<Character> q = new LinkedList<>();

    void pushCharacter(char ch) {
        s.push(ch);
    }

    void enqueueCharacter(char ch) {
        q.add(ch);
    }

    char popCharacter() {
        return s.pop();
    }

    char dequeueCharacter() {
        return q.remove();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        stack obj = new stack();
        for (int i = 0; i < S.length(); i++) {
            obj.pushCharacter(S.charAt(i));
            obj.enqueueCharacter(S.charAt(i));
        }
        boolean isPalindrome = true;
        for (int i = 0; i < S.length() / 2; i++) {
            if (obj.popCharacter() != obj.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The word, " + S + ", is a palindrome.");
        } else {
            System.out.println("The word, " + S + ", is not a palindrome.");
        }
    }
}
