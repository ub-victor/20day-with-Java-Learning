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
        if (!bprAddress.equals("REMERA")|| !bprAddress.equals("NYABUGOGO")) {
            System.out.println("Invalid BPR address. Please enter a valid address (REMERA, KIMIRONKO, NYARUGENGE).");
            return;
            
        }
        this.bprAddress = bprAddress;
    }

}
