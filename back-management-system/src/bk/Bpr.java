package bk;

public class Bpr extends Bank {
    private String bprAddress;


    public Bpr(int bankId, String bankName, String bprAddress) {
        super(bankId, bankName);
        this.bprAddress = bprAddress;
    }
    public String getBprAddress() {
        return bprAddress;
    }
    public void setBprAddress(String bprAddress) {
        this.bprAddress = bprAddress;
    }

}
