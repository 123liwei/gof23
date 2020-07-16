package designPatterns.单例;

public class LazySingleton {

    public static void main(String[] args) {

        President dx1 = President.getInstance();
        President dx2 = President.getInstance();
        if(dx1 == dx2){
            System.out.println("他们是同一人！");
        }else {
            System.out.println("他们不是同一人！");
        }

    }

}

class President{

    private static volatile President instance = null;

    public President() {

        System.out.println("产生一个总统");

    }

    public static synchronized President getInstance() {

        if(instance == null){
            instance = new President();
        }else {
            System.out.println("已经有一个总统，不能产生新总统！");
        }

        return instance;
    }

    public void getName(){
        System.out.println("我是美国总统：特朗普。");
    }
}