package equity.bk;

public class OpenAccountImp implements OpenAccount  {

    @Override
    public void addAccount() {
        AccountInfo acc = null;
        System.out.println("the national id is " + acc.getNationalId()
        + " the first name is " + acc.getfName()
        + " the last name is " + acc.getlName()
        + " the age is " + acc.getAge()
        + " the address is " + acc.getAddress());
    }

    @Override
    public void removeAccount() {
       
    }



    
}
