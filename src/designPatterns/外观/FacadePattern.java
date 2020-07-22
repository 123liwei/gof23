package designPatterns.外观;

public class FacadePattern {

    public static void main(String[] args) {
        Facade f = new Facade();
        f.method();
    }

}

class Facade{
    private SubSystem01 obj1 = new SubSystem01();
    private SubSystem02 obj2 = new SubSystem02();
    private SubSystem03 obj3 = new SubSystem03();
    public void method(){
        obj1.method1();
        obj2.method2();
        obj3.method3();
    }
}

class SubSystem01 {
    public  void method1(){
        System.out.println("子系统01的method1()被调用！");
    }
}

class SubSystem02 {
    public  void method2(){
        System.out.println("子系统02的method2()被调用！");
    }
}

class SubSystem03 {
    public  void method3(){
        System.out.println("子系统03的method3()被调用！");
    }
}

