public class CheckingAccount {

    double balance;
    long accountNUmber;
    String accountHolder;
    String type = "checking";

    public void setInfo(double pBalance, long pAccNumber,String pAccHolder){
        balance=pBalance;
        accountNUmber=pAccNumber;
        accountHolder=pAccHolder;
    }

    public double deposit(double amount){
        balance+=amount;
        return  balance;

    }

    public double withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }else{
            System.out.println("Insufficent fund in account");
        }
        return  balance;
    }

    public double withdraw_branch(double amount, boolean branch){
        if(amount>500 && !branch){
            throw  new IllegalArgumentException();
        }
        balance -=amount;
        return balance;
    }

    public double purchase(String item,double price){
        if(price<=balance){
            balance-=price;

        }else {
            balance-=(price+35);
        }
        return balance;
    }
}
