package bk;

public class Bpr {
    private int bankId;
    private String bankName;

    public Bpr(int bankId, String bankName) {
        this.bankId = bankId;
        this.bankName = bankName;
    }

    // getter and setter methods
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
        this.bankName = bankName;
    }
}
