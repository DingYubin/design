package patterns.structure.bridge.demo2_1;

public class IBCBack extends Bank{
    public IBCBack(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开工商银行账号");
        account.openAccount();
        return account;
    }
}
