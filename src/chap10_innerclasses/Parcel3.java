package chap10_innerclasses;

/**
 * Created by yaodh on 2018/10/30.
 */
public class Parcel3 {
    class Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }
    class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }
        String readLabel() {
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        // 使用外部类的引用p去创建内部类
        Contents c = p.new Contents();
        Destination d = p.new Destination("Tasmania");
    }
}
