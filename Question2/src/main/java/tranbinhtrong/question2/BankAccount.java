package tranbinhtrong.question2;

import java.util.Scanner;

public class BankAccount {

    private int accNum;
    private String accName;
    private double accBalance;

    public BankAccount() {
    }

    public BankAccount(int accNum, String accName, double accBalance) {
        this.accNum = accNum;
        this.accName = accName;
        this.accBalance = accBalance;
    }

    public int getAccNum() {
        return accNum;
    }

    public String getAccName() {
        return accName;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public void inputAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Account number: ");
        accNum = sc.nextInt();
        sc.nextLine();
        System.out.println("Name: ");
        accName = sc.nextLine();
        System.out.print("Balance: \n");
        accBalance = sc.nextDouble();
    }

    public void displayAccount() {
        System.out.print("Account number: " + accNum + "\nName: " + accName + "\nBalance: " + accBalance);
    }

    public void deposit(double amount) {
        this.accBalance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            return false;
        }
        if (this.accBalance < amount) {
            return false;
        }
        this.accBalance -= amount;
        return true;
    }

    public boolean transferMoney(BankAccount acc, double amount) {
        if (amount < 0) {
            return false;
        }
        if (this.accBalance < amount) {
            return false;
        }
        acc.setAccBalance(acc.getAccBalance()+amount);
        this.accBalance -= amount;
        return true;
    }
}
