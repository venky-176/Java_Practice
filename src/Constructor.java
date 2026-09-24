/*
-> constructor is a block of code We call while creating an Instance(object) of class.
->Default constructor will always be a public
-> Constructors will always be public,private and protected.
 */
public class Constructor{
    public int i;
    static void main(String[] args) {
        Constructor cp= new Constructor();
        System.out.println(cp.i);
        Demo dem= new Demo();
        dem.get_mess();
    }
    public Constructor(){
        int i=20;
        System.out.println("Constructor is called");
    }
    public Constructor(int a){
        i=a;
    }
}
       class Demo{
   void get_mess(){
       System.out.println("hello constructor");
   }
}