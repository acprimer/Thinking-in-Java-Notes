package chap08_polymorphism;

public class PrivateOverride {
    // 用private修饰的函数自动认为是final的，而且对子类是屏蔽的
    // private 等同于 private final
    public void f() {
        System.out.println("private f()");
    }

    void g(PrivateOverride o) {
        System.out.println("PrivateOverride");
    }
    void g(Derived o) {
        System.out.println("Derived");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f(); // 调用的是父类的f()，该方法是private的
        po.g(po);

        Derived d = new Derived();
        d.f();
        po.g(d);
    }
}

class Derived extends PrivateOverride {
    // 这里是重新定义了一个函数f()，不是重载
    public void f() {
        System.out.println("public f()");
    }


}