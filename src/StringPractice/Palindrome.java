package StringPractice;
import java.util.*;
public class Palindrome {
    static void main(String[] args) {
        String sg = "nolemonnomelon";
        int l=0,r=sg.length()-1;
        boolean check=true;
        while (l<r){
           if(sg.charAt(l)!=sg.charAt(r)){
               check=false;
           }
            l++;
            r--;
        }
        System.out.println(check? "Palindrome":"Not palindrome");
    }
}
