package Equity.bk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter national id");
        String id = sc.nextLine();
        System.out.println("please enter first name");
        String fName = sc.nextLine();
        System.out.println("please enter last name");
        String lName = sc.nextLine();
        System.out.println("please enter age");
        int age = sc.nextInt();
        sc.nextLine(); 
        System.out.println("please enter address");
        String address = sc.nextLine();
        
        AccountInfo accountInfo = new AccountInfo(id, fName, lName, age, address);

        // set values
        accountInfo.setNationalId(id);
        accountInfo.setfName(fName);
        accountInfo.setlName(lName);
        accountInfo.setAge(age);
        accountInfo.setAddress(address);
    }
    
}
