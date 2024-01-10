interface BankInterface {
    abstract double getbalance();
    abstract double getinterestrate();
}

class BankA implements BankInterface {
    double balance;
    double interestA;

    public BankA(double balA)
    {
        balance = balA;
    }

    @Override
    public double getbalance()
    {

        return balance;
    }

    @Override
    public double getinterestrate(){
        return interestA=0.07*balance;


    }
}

class BankB implements BankInterface{
    double balance, interestB;
    public BankB(double balB){
        balance=balB;
    }

    @Override
    public double getbalance() {
        return balance;
    }

    @Override
    public double getinterestrate() {
        interestB=0.074*balance;
        return interestB;
    }
}

class Bankc implements BankInterface{
    double balance;
    double interestC;
    public Bankc(double balC){
        balance=balC;
    }

    @Override
    public double getbalance() {
        return balance;
    }

    @Override
    public double getinterestrate() {
        interestC=0.079*balance;
        return interestC;
    }
}

public class Main {

    public static void main(String args[]){
        BankInterface banka = new BankA(10000);
        BankInterface bankb = new BankB(150000);
        BankInterface bankc = new Bankc(200000);

        System.out.println("Bank A balance is"+ banka.getbalance());
        System.out.println("INtersest of BankA is"+ banka.getinterestrate());
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Bank b balance is"+ bankb.getbalance());
        System.out.println("Interest of Bankb is"+ bankb.getinterestrate());
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Bank c balance is"+ bankc.getbalance());
        System.out.println("Itersest of Bank c is"+ bankc.getinterestrate() );




    }
}

