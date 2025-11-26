package Equity.bk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter id");
        AccountInfo accountInfo = new AccountInfo();
        int in = sc.nextInt();
        accountInfo.setNationalId(in);
        System.out.println("your id is " + accountInfo.getNationalId());
        sc.close();

    }
    
}
