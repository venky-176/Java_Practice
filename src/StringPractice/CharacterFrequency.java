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

//        String S= "Hello worll";
//        //StringBuilder sb= new StringBuilder(S);
//        //System.out.println(S);
//        int l=S.indexOf('l'),r=S.lastIndexOf('l');
//        String sg=S.substring(0,l)+'@'+S.substring(l+1,r)+"@@"+S.substring(r+1,S.length());
//        System.out.println(sg);
    }
}
