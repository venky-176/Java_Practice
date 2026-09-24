package Encapsulation;

public class BankAccount {
    private int accno;
    private int balance;
public void setacc(int acc){
    this.accno=acc;
}
public void setBalance(int bal){
    this.balance=bal;
}
public int getAccno(){
    return  accno;
}
public void deposit(int amount){
    if(amount<0){
        System.out.println("Invalid");
        return;
    }balance+=amount;
    System.out.println("deposited amount:"+amount);
}
    public void withdraw(int amount){
        if(balance<amount){
            System.out.println("Insufficient balance.");
        }else {
            balance-=amount;
        System.out.println("withdrawn amount:"+amount);}

    }
    public int getBalance(){
        return balance;
    }
}

