package StringPractice;
import java.util.*;
public class ReverseString {
    static void main(String[] args) {
        String sg= "hello";
        String sg1= "";
        for (int i = sg.length()-1; i >=0 ; i--) {
            sg1+=sg.charAt(i);
        }
        System.out.println(sg1);
    }
}
