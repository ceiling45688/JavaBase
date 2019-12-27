package CP6;

public class test6_7 {
    public static void main(String[] args){
        try {
            BankAccount ba = new BankAccount(50);
            ba.withdraw(100);
            System.out.println("取款成功！");
        }catch (myException e){
            System.out.println(e.toString());
        }
    }
}
class myException extends Exception {
    myException(String str) {
        super(str);
    }
}
class BankAccount {
    private double balance;
    BankAccount(double balance){this.balance = balance;}
    public void deposit(double dAmount){
        if(dAmount > 0.0){
            balance += dAmount;
        }
    }
    public void withdraw(double dAmount) throws myException{
        if(balance < dAmount){throw new myException("账户不能透支");}
        balance  -= dAmount;
    }
    public void show_balance(){
        System.out.println("余额为："+ (int)balance);
    }
}
