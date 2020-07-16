package concurrency;

public class Test1 implements Runnable{

    private Account account;
    private String name;

    public Test1(Account account, String name) {
        this.account = account;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            account.withdraw(1);
            System.out.println(name+"修改了"+account.getBalance());
        }
    }
}
