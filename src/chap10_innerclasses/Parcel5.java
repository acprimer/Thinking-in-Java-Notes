package chap10_innerclasses;

public class Parcel5 {
    private int i = 11;
    public Destination destination(String dest) {
        // 局部内部类
        class PDestination implements Destination {
            private String label;

            private PDestination(String label) {
                this.label = label;
                i = 5;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(dest);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        System.out.println(p.i);
        Destination d = p.destination("Tasmania");
        System.out.println(d.getClass().getName());
        System.out.println(p.i);
    }
}
