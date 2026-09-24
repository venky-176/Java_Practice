class inherit1{
    public inherit1(){
        System.out.println("Parent");
    }
}
public class Inherit extends inherit1{
    static void main(String[] args) {
        Inherit ih = new Inherit();
    }
}
