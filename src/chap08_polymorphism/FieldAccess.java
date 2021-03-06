package chap08_polymorphism;

class Super {
    public int field = 0;

    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;

    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}

/**
 * 演示类的成员变量不具有多态性
 * 类的成员变量是编译器解析的
 */
public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.field = " + sup.field + ". sup.getField() = " + sup.getField());

        Sub sub = new Sub();
        System.out.println("sub.field = " + sub.field +
                ". sub.getField() = " + sub.getField() +
                ". sub.getSuperField = " + sub.getSuperField());
    }
}
/*
sup.field = 0. sup.getField() = 1
sub.field = 1. sub.getField() = 1. sub.getSuperField = 0
 */
