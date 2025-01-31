class createAccount{
    String name;
    String email;
    int mobile;
    int pin;
    public createAccount(String name,String email,int mobile,int pin){
       this.name=name;
       this.email=email;
       this.mobile=mobile;
       this.pin=pin;
    }
    public String getname(String name){
        return name;
    }
    public String getemail(String email){
        return email;
    }
    public int getmobile(int mobile){
        return mobile;
    }
}
class AccountBalance{
    int Balance;
    String accountNumber;
    String customerName;
    AccountBalance(int Balance,String accountNumber,String customerName){
        this.Balance=Balance;
        this.accountNumber=accountNumber;
        this.customerName=customerName;

    }
    public void deposit(int Amount){
        
    }

}