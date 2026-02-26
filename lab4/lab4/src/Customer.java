public class Customer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;
    private String accountType;
    private static double balance=0;

    public Customer(int customerId,String firstName,String lastName,String email,int phoneNumber,String accountType , double balance){
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
    Customer(Customer c){
        customerId = c.customerId;
        firstName = c.firstName;
        lastName = c.lastName;
        email = c.email;
        phoneNumber = c.phoneNumber;
        accountType = c.accountType;
        balance = c.balance;
    }
    public String toString(){
        return "id :"+ customerId + " firstname :"+firstName +" lastname :"+ lastName + " email :" + email + " phonenum :" + phoneNumber + " acctype :" + accountType + " balance :" + balance;
    }
    public boolean equals(Customer c){
        return customerId == c.customerId;
    }
    public double deposit(double amount){
        balance = balance + amount;
        return balance;
    }
    public double withdraw(double amount){
        if (balance - amount > 0){
            balance = balance - amount;
            return balance;
        }
        else
            System.out.println("Insufficient balance");
        return balance;
    }
    public int setCustomerId(int customerId){
        this.customerId = customerId;
        return customerId;
    }
    public String setFirstName(String firstName){
        this.firstName = firstName;
        return firstName;
    }
    public String setLastName(String lastName){
        this.lastName = lastName;
        return lastName;
    }
    public String setEmail(String email){
        this.email = email;
        return email;
    }
    public int setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
        return phoneNumber;
    }
    public String setAccountType(String accountType){
        this.accountType = accountType;
        return accountType;
    }
    public double setBalance(double balance){
        this.balance = balance;
        return balance;
    }
    public int getCustomerId(){
        return customerId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public String getAccountType() {
        return accountType;
    }
    public double getBalance() {
        return balance;
    }
}
