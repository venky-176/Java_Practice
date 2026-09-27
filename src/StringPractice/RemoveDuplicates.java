package StringPractice;

public class RemoveDuplicates {
    static void main(String[] args) {
        String sg="malayalam";
        String sk="";
        for(int i=0;i<sg.length();i++){
            char c = sg.charAt(i);
            boolean found = false;
            for (int j = 0; j < sk.length(); j++) {
                if (c == sk.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                sk += c;
            }
        }
        System.out.println(sk);
    }
}
