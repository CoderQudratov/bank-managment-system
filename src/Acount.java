import java.util.SortedMap;

public class Acount {
    private int accountNumber;
    private Customer customer;
    private double balance;

    public Acount(int accountNumber, Customer customer, double balance) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = balance;
    }
    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
            System.out.println(amount+"So'm depozit qilindi. Yangi balans: "+balance);
        }else {
            System.out.println("Notugri summa kiritildi");
        }
    }
    public void withdraw(double amount){
        if (amount>0 && amount<=balance){
            balance-=amount;
            System.out.println(amount+" som yechib olindi, Yangi balans"+balance);
        }else {
            System.out.println("Yetarli mablag yoq yoki yetarli summa summa kiritilmadi!");
        }
    }
    public void printAccountDetails(){
        System.out.println("Mijoz"+customer.getName());
        System.out.println("Hisob raqami:"+accountNumber);
        System.out.println("Balans"+balance);
    }
}
