package StaticAndNonStatic;

import java.util.Random;
//Static is used when a variable or method needs to be associated with the class rather than with individual objects.
//UPI or bank txn limit is same for all the people, whether the each customer have different acc number.

public class Test1 {
    static int num1=56;

    int num2=66;
static{
    System.out.println("1st static");
}
    //we can access static variables by using Class name
    //we can create static variables outside main method only, cause static variables belongs to class and has class level scope.
    static void main(String[] args) {
        Test1.num1= 45;

        Test1 t1 = new Test1();
        t1.num2=76;
        System.out.println(Test1.num1);
       int num2= t1.num2;

        //System.out.println(t1.num2);
    }
    public static void print1(){
        int h =76;
        h=6;

        System.out.println("static Print");
    }
    public void print2(){
        System.out.println("Non-static print");
    }
}
/* here int num1 is not static so the t1,t2,t3 object give 3 different outputs.
int num1
Test1 t1= new Test1();
        t1.num1 = new Random().nextInt();
        Test1 t2= new Test1();
        t2.num1 = new Random().nextInt();
        Test1 t3= new Test1();
        t3.num1 = new Random().nextInt();
        System.out.println(t1.num1);
        System.out.println(t2.num1);
        System.out.println(t3.num1);
        Output: 241486108
-1293123170
1052617033

After making num1 static, the t1,t2,t3 objects give same output
 static int num1;
 Test1 t1= new Test1();
        t1.num1 = new Random().nextInt();
        Test1 t2= new Test1();
        t2.num1 = new Random().nextInt();
        Test1 t3= new Test1();
        t3.num1 = new Random().nextInt();
        System.out.println(t1.num1);
        System.out.println(t2.num1);
        System.out.println(t3.num1);
 */
