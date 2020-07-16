package concurrency;

public class TestThread {

    public static void main(String[] args) {
        Account account = new Account(10000,"123");
        Test1 testA = new Test1(account,"threadA");
        Test2 testB = new Test2(account,"threadB");
        Thread threadA = new Thread(testA);
        Thread threadB = new Thread(testB);
        threadA.start();
        threadB.start();
    }
}
