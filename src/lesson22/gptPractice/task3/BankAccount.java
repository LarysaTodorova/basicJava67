package lesson22.gptPractice.task3;

public class BankAccount {

    private String ownerName;
    private double balance;
    private boolean active;

    public BankAccount(String ownerName, double balance, boolean active) {
        this.ownerName = normalizeOwnerName(ownerName);
        this.balance = normalizeBalance(balance);
        this.active = active;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = normalizeOwnerName(ownerName);
    }

    public void setBalance(double balance) {
        this.balance = normalizeBalance(balance);
    }

    private String normalizeOwnerName(String ownerName) {
        return (ownerName == null || ownerName.isBlank()) ? "Unknown" : ownerName;
    }

    private double normalizeBalance(double balance) {
        return balance < 0 ? 0 : balance;
    }
}
