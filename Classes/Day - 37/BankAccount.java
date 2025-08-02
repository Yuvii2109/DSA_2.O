class PNB{
    private int balance;
    private int password;
    int val;
    PNB(int password, int balance){
        this.password = password;
        this.balance = balance;
    }
    public int getBalance(int password){
        if(this.password == password){
            return balance;
        }else{
            System.out.println("Chor");
            return 0;
        }
    }
    public void updateBalance(int val, int password){
        if(this.password == password){
            this.balance += val;
        }else{
            System.out.println("Password Bhool gya kya???");
        }
    }
}

public class BankAccount {
    public static void main(String[] args) {
        PNB yuvraj = new PNB(2123, 21000);
        yuvraj.updateBalance(88345678, 2123);
        System.out.println(yuvraj.getBalance(2123));
        PNB aditya = new PNB(1234, 98763527);
        System.out.println(aditya.getBalance(1234));
    }
}