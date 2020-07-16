package concurrency;

public class Account{

    private final Object balLock = new Object();

    private Integer balance;

    private final Object pwLock = new Object();

    private String password;

    void withdraw(Integer amt){
        synchronized (balLock){
            if(this.balance>amt){
                this.balance -= amt;
            }
        }
    }

    public Account(Integer balance, String password) {
        this.balance = balance;
        this.password = password;
    }

    Integer getBalance(){
        synchronized (balLock){
            return balance;
        }
    }

    String updatePassword(){
        synchronized (pwLock){
            return password;
        }
    }


    void transfer(Account account,int amt){
        if(this.balance > amt){
            this.balance -= amt;
            account.balance += amt;
        }
    }



}
