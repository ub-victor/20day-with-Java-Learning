package equity.bk;

public class AccountInfo {
    private String nationalId;
    private String fName;
    private String lName;
    private int age;
    private String address;

    public AccountInfo(String nationalId, String fName, String lName, int age, String address) {
        this.nationalId = nationalId;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.address = address;
    }

    public String getNationalId() {
        return nationalId;
    }
    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        if(fName == null || fName.isEmpty()) {
           System.out.println("First name cannot be empty");
           ;
        }
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        if(lName == null || lName.isEmpty()) {
           System.out.println("Last name cannot be empty");
           return;
        }
        this.lName = lName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age < 0) {
           System.out.println("Age cannot be negative");
           return;
        }
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        if(address == null || address.isEmpty()) {
           System.out.println("Address cannot be empty");
           return;
        }
        this.address = address;
    }

}

