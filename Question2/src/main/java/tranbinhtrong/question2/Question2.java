package tranbinhtrong.question2;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountManagement bank = new AccountManagement();
        bank.getAccounts();
        int n;
        do {
            System.out.println("What do you want to do? \n1:Deposit \n2:Withdraw \n3:Transfer money to another account \n4:Show the list of accounts \n5:Escape");
            n = sc.nextInt();
            switch (n) {
                case 1 -> bank.deposit();
                case 2 -> bank.withdraw();
                case 3 -> bank.transferMoney();
                case 4 -> bank.showAllAccounts();
            }
        } while (n != 5);

    }
}
