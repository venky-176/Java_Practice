package StringPractice;

public class CharacterFrequency {
    static void main(String[] args) {
        String sg="aabbcaa";
        int l=0;
        while(l<sg.length()){
            int count=1;
            while(l+1<sg.length() && sg.charAt(l)==sg.charAt(l+1)){
                count++;
                l++;
            }
            System.out.print(sg.charAt(l)+"-"+count);
            l++;
        }
    }
}
