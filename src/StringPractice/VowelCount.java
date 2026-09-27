package StringPractice;

public class VowelCount {
    static void main(String[] args) {
        String sg="biology";
        int count=0;
        for (int i = 0; i < sg.length()-1; i++) {
            char c=sg.charAt(i);
            if(c=='a' || c=='e' || c=='i'|| c=='o' || c=='u'){
                count++;
            }
        }
        System.out.println("no.of vowels in "+sg+" are: "+count);
    }
}
