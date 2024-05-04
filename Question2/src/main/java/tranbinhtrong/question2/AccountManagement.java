package tranbinhtrong.question2;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManagement {

    private ArrayList<BankAccount> bank;

    public AccountManagement() {
    }

    public void getAccounts() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input no. of Account: ");
        int n = sc.nextInt();
        bank = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            BankAccount b1 = new BankAccount();
            b1.inputAccount();
            bank.add(b1);
        }
    }

    public void showAllAccounts() {
        for (int i = 0; i < bank.size(); i++) {
            bank.get(i).displayAccount();
            System.out.println();
        }
    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which account you would like to deposit: ");
        int n = sc.nextInt();
        System.out.print("The amount of money is? ");
        double amount = sc.nextDouble();
        for (int i = 0; i < bank.size(); i++) {
            if (bank.get(i).getAccNum() == n) {
                bank.get(i).deposit(amount);
                break;
            }
        }
    }

    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which account you would like to withdraw: ");
        int n = sc.nextInt();
        System.out.print("The amount of money is? ");
        double amount = sc.nextDouble();
        for (int i = 0; i < bank.size(); i++) {
            if (bank.get(i).getAccNum() == n) {
                bank.get(i).withdraw(amount);
                break;
            }
        }
    }

    public void transferMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sending Account Number: ");
        int sendAcc = sc.nextInt();
        System.out.print("Enter the Receiving Account Number: ");
        int reAcc = sc.nextInt();
        System.out.print("Enter the amount of money: ");
        double amount = sc.nextDouble();
        BankAccount sendAcc1 = null;
        BankAccount reAcc1 = null;
        for (int i = 0; i < bank.size(); i++) {
            if (bank.get(i).getAccNum() == sendAcc) {
                sendAcc1 = bank.get(i);
            }
            if (bank.get(i).getAccNum() == reAcc) {
                reAcc1 = bank.get(i);
            }
            if (sendAcc1 != null && reAcc1 != null) {
                break;
            }
        }
        if (sendAcc1 != null && reAcc1 != null) {
            sendAcc1.transferMoney(reAcc1, amount);
            for (int i = 0; i < bank.size(); i++) {
                if (bank.get(i).getAccNum() == sendAcc1.getAccNum()) {
                    bank.get(i).setAccBalance(sendAcc1.getAccBalance());
                }
                if (bank.get(i).getAccNum() == reAcc) {
                    bank.get(i).setAccBalance(reAcc1.getAccBalance());
                }
            }
        }
    }
}
