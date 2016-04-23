package company.net;

public class Main {

    public static void main(String[] args) {

        Bank a=new Bank();
        a.showinfo();
        Bank.Account a1=a.new Account();
        a1.showaccount();
        a1.showbalance();
        a1.withdrawmoney();
        a1.putmoney();





    }
}
