package designPatterns.单例;

public class HungrySingleton {

    public static void main(String[] args) {

        SingletonEager obj1=SingletonEager.getInstance();

        SingletonEager obj2=SingletonEager.getInstance();

        if(obj1==obj2)
        {
            System.out.println("他们是同一人！");
        }
        else
        {
            System.out.println("他们不是同一人！");
        }

    }

}

class SingletonEager{
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager(){

    }

    public static SingletonEager getInstance(){
        return instance;
    }

}