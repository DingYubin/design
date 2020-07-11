package patterns.structure.bridge.demo2_1;

public abstract class Bank {
    protected Account account;
    public Bank(Account account){
        this.account = account;
    }

    abstract Account openAccount();
}
