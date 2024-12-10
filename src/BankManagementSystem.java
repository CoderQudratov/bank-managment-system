import java.util.Scanner;
import java.util.HashMap;

public class BankManagementSystem {
    private static HashMap<Integer, Acount> accounts = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Customer customer1 = new Customer("Ali", "123456");
        Customer customer2 = new Customer("Laylo", "654321");

        Acount account1 = new Acount(1, customer1, 500.0);
        Acount account2 = new Acount(2, customer2, 1000.0);

        accounts.put(1, account1);
        accounts.put(2, account2);

        while (true) {
            System.out.println("\nBank tizimiga xush kelibsiz!");
            System.out.println("1. Hisob raqamiga kirish");
            System.out.println("2. Chiqish");
            System.out.print("Tanlovingizni kiriting: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Hisob raqamingizni kiriting: ");
                int accountNumber = scanner.nextInt();
                Acount account = accounts.get(accountNumber);

                if (account != null) {
                    manageAccount(account);
                } else {
                    System.out.println("Bunday hisob raqami mavjud emas.");
                }
            } else if (choice == 2) {
                System.out.println("Dasturdan chiqish...");
                break;
            } else {
                System.out.println("Noto‘g‘ri tanlov.");
            }
        }
    }

    private static void manageAccount(Acount account) {
        while (true) {
            System.out.println("\nHisob raqamingiz: " + account.getAccountNumber());
            System.out.println("1. Depozit qo‘shish");
            System.out.println("2. Pul yechish");
            System.out.println("3. Hisob ma'lumotlarini ko‘rish");
            System.out.println("4. Chiqish");
            System.out.print("Tanlovingizni kiriting: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Depozit qo‘shish uchun summani kiriting: ");
                double amount = scanner.nextDouble();
                account.deposit(amount);
            } else if (choice == 2) {
                System.out.print("Pul yechish uchun summani kiriting: ");
                double amount = scanner.nextDouble();
                account.withdraw(amount);
            } else if (choice == 3) {
                account.printAccountDetails();
            } else if (choice == 4) {
                System.out.println("Hisobdan chiqish...");
                break;
            } else {
                System.out.println("Noto‘g‘ri tanlov.");
            }
        }
    }
}
