package Encapsulation;

public class Main {
    static void main(String[] args) {
        BankAccount bk=new BankAccount();
        bk.setacc(1332341);
        bk.setBalance(10000);
        System.out.println(bk.getter());
        int a= bk.getter();
        a+=87;
        System.out.println(a+"---"+bk.getter());
        System.out.println(bk.getter());
        System.out.println("Account number:"+bk.getAccno());
        System.out.println("balance: "+bk.getBalance());
        bk.deposit(5000);
        bk.withdraw(7500);
        System.out.println("total balance: "+bk.getBalance());
        bk.deposit(-6000);
        bk.withdraw(8000);

    }
}
