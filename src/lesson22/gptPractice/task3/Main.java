package lesson22.gptPractice.task3;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(null, -100, true);

        System.out.println("Owner name: " + account.getOwnerName() + ", balance: " + account.getBalance() + ", active: " + account.isActive());

        account.setOwnerName("");
        account.setBalance(-50);
        System.out.println("Owner name: " + account.getOwnerName() + ", balance: " + account.getBalance() + ", active: " + account.isActive());

        account.setOwnerName("Alexa");
        account.setBalance(1500);
        System.out.println("Owner name: " + account.getOwnerName() + ", balance: " + account.getBalance() + ", active: " + account.isActive());

    }
}
