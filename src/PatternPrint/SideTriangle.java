package PatternPrint;

public class SideTriangle {
    static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n*2; i++) {
            int star=i;
            if(star>=n) {star=2*n-i;}
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
       /* for (int i = n-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}
