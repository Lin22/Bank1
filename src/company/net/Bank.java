package company.net;


public class Bank{

    public String mercury="Mercury";

    public static class Account
    {
        public int account=123456;

        public Account() {

                    }

        public void showaccount(){
            System.out.println("My account number is "+account);}


        public double balance=10000;



        public void showbalance(){
            System.out.println("My balance is "+balance); }


        public void withdrawmoney(){
            if(balance>0)
            System.out.println("You can withdraw money");}


        public void putmoney(){
            if(balance<0)
            System.out.println("You can put money");}

        }
    public void showinfo(){
        System.out.println("My bank is "+mercury);

    }
}
