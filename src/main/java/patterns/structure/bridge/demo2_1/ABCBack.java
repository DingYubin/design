package patterns.structure.bridge.demo2_1;

public class ABCBack extends Bank{
    public ABCBack(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();//需要委托实现
        return account;
    }
}
