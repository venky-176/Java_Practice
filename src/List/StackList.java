package List;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Stack extends Vector class
//Stack follows LIFO principle
public class StackList {
    static void main(String[] args) {
        Stack<String> S= new Stack<>();
        S.push("ven");
        S.push("kal");
        S.push("bal");// we can add at the index we want
        System.out.println(S);
        System.out.println(S.peek());
        S.pop();
        System.out.println(S);
        System.out.println(S.isEmpty());
    }
}
