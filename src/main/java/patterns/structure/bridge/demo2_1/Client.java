package patterns.structure.bridge.demo2_1;

public class Client {
    public static void main(String[] args) {
        Bank ibcBank = new IBCBack(new DepositAccount());
        Account ibcAccount = ibcBank.openAccount();
        ibcAccount.showAccountType();

        Bank ibcBank2 = new IBCBack(new SavingAccount());
        Account ibcAccount2 = ibcBank2.openAccount();
        ibcAccount2.showAccountType();

        Bank abcBank = new ABCBack(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();
    }
}
