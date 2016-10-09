package teclan.jdk8.Interface;

public interface InterfaceB {

    // 普通的接口方法，实现类必须实现此方法
    public void print();

    // jdk8 新支持的默认接口方法，实现类可以重写此方法，重写时不能保留关键字 default ，亦可直接使用
    public default void defaultPrint() {
        System.out.println(" I'm the default method in InterfaceB ! ");
    }

    // jdk8 新支持的接口静态方法，静态方法不允许重写，并且只能通过 InterfaceB.staticPrint(),不允许通过子类调用此静态方法
    public static void staticPrint() {
        System.out.println(" I'm the static method in InterfaceB ! ");
    }

}
