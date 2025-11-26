package Equity.bk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter id");
        AccountInfo accountInfo = new AccountInfo();
        
        System.out.println("please enter national id");
        accountInfo.setNationalId(sc.nextLine());
        System.out.println("please enter first name");
        accountInfo.setfName(sc.nextLine());
        System.out.println("please enter last name");
        accountInfo.setlName(sc.nextLine());
        System.out.println("please enter age");
        accountInfo.setAge(sc.nextInt());
        sc.nextLine(); 
        System.out.println("please enter address");
        accountInfo.setAddress(sc.nextLine());


    }
    
}
