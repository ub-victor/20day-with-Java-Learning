package Equity.bk;

public class AccountInfo {
    private String accountInfo;
    private String fName;
    private String lName;
    private int age;
    private String address;
    
    public AccountInfo(String accountInfo, String fName, String lName, int age, String address) {
        this.accountInfo = accountInfo;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.address = address;
    }

    public String getAccountInfo() {
        return accountInfo;
    }
    public void setAccountInfo(String accountInfo) {
        this.accountInfo = accountInfo;
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

}

