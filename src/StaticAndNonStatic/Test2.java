package StaticAndNonStatic;

public class Test2 {
    static int num;
    static{
        System.out.println("Static-block");
    }
    public static  void hello(){
        System.out.println("Hello this is static method");
    }
    public Test2(){
        System.out.println("Constructor");
        num=10;
    }
    static void main(String[] args) {
//        Test1 t1 = new Test1();
        System.out.println("Main method");
        Test2 t2= new Test2();
        System.out.println(t2.num);
        print();
    }
    public static void print(){
        System.out.println("Print");
        //if we remove static in method calling the print can't be executed w/o creating an object.
        //But if we mention the method as a static we don't need to create a object to execute it.
    }
}
/*
//Here we can access static variable from Test1 w/o creating an object for Test1 class
System.out.println(Test1.num1);
        Test1.print1();
        //we can't access print2 w/o creating an object for an class
        Test1 t1 =new Test1();
        t1.print2();
 */