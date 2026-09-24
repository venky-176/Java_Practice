package PatternPrint;

public class AlphabetPyramid {
    static void main(String[] args) {
        int n=6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            char ch='A';
            int breakp=(2*i+1)/2;
            for (int k = 0; k <2*i +1; k++) {
                System.out.print(ch);
                if(k<breakp){
                ch++;}else{
                    ch--;
                }
            }
            for (int l = 0; l < n-i-1; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
