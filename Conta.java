package BankSimulator;

public class Conta {
    
    public String userName;
    public double balance;
    public double overdraft;
    private final double initialOverdraft;

    public Conta(String name, double balance) {
        this.userName = name;
        this.balance = balance;
        
        if (balance <= 500){
            this.overdraft = 50;
            this.initialOverdraft = this.overdraft;
            return;
        } 
        
        this.overdraft = balance / 2;
        this.initialOverdraft = this.overdraft;
    }

    public Conta(double balance) {
        this.balance = balance;
        
        if (balance <= 500){
            this.overdraft = 50;
            this.initialOverdraft = this.overdraft;
            return;
        } 
        
        this.overdraft = balance / 2;
        this.initialOverdraft = this.overdraft;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getOverdraft() {
        return overdraft;
    }
    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public void checkBalance(){
        System.out.println("Seu saldo atual: " + getBalance());

    }
    
     public void checkOverdraft(){
        System.out.println("Limite no seu cheque especial atual: " + getOverdraft());

    }

    public boolean verifyUsingOverdraft(){
        if (getOverdraft() == initialOverdraft){
            return false;
        }

        return true; 
    }

    public void depositMoney(double value){
        boolean verify = verifyUsingOverdraft();
        if (verify) {
            double fees = ((this.initialOverdraft - this.overdraft) / 100) * 20;
            value -= (this.initialOverdraft - this.overdraft) + fees;
            this.balance += value;
            this.overdraft += this.initialOverdraft - this.overdraft;
            System.out.println("Depósito efetuado com sucesso.");
            return;
        }

        this.balance += value;
        System.out.println("Depósito efetuado com sucesso.");
    }

    public void withdrawMoney(double value){
        if (value <= this.balance){
        this.balance -= value;
        System.out.println("Saque realizado com sucesso.");
        return;
        } else if ((value - this.balance) <= overdraft){
            this.overdraft -= value - this.balance;
            this.balance = 0;
            System.out.println("Saque realizado com sucesso.");
            System.out.println("Seu cheque especial foi usado parcialmente.");
            return;
        } 
        System.out.println("Saldo insuficiente para realizar o saque.");
    }

    public void payABill(double value){
        if (value <= this.balance){
        this.balance -= value;
        System.out.println("Seu pagamento foi realizado com sucesso.");
        return;
        } else if ((value - this.balance) <= overdraft){
            this.overdraft -= value - this.balance;
            this.balance = 0;
            System.out.println("Seu pagamento foi realizado com sucesso.");
            System.out.println("Seu cheque especial foi usado parcialmente.");
            return;
        } 
        System.out.println("Saldo insuficiente para realizar o pagamento.");
    }
    
}
