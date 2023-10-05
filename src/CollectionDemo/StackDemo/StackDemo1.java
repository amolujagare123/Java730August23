package CollectionDemo.StackDemo;

import java.util.Stack;

public class StackDemo1 {
    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        System.out.println(s.empty()); //

        s.push("Hari");
        s.push("Dhraddha");
        s.push("Amol");
        s.push("Shivani");
        s.push("Pallavi");
        s.push("Saimounika");
        s.push("Sonal");
        System.out.println(s.empty()); //
        System.out.println(s);

        System.out.println(s.pop());

        System.out.println(s);

        System.out.println(s.peek());
        System.out.println(s);

        System.out.println(s.search("Hari"));
        System.out.println(s.search("Shivani"));
    }
}
