package bk;

public class Bank {
    private int bankId;
    private String bankName;

    public Bank(int bankId, String bankName) {
        this.bankId = bankId;
        this.bankName = bankName;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        while (!bankName.equals("BPR")) {
            System.out.println("Invalid bank name. Please enter 'BPR'.");
            return;
        }
        this.bankName = bankName;
    }
}
