package teclan.jdk8.Interface;

public class Main {

    public static void main(String[] args) {
        A a = new A();

        a.print();
        a.defaultPrint();
        // a.staticPrint(); 静态方法只能通过静态方法所在类直接调用
        InterfaceA.staticPrint();

        System.out.println("\n ============== 华丽的分隔线 =============== \n");

        B b = new B();

        b.print();
        b.defaultPrint();
        // b.staticPrint(); 静态方法只能通过静态方法所在类直接调用
        InterfaceB.staticPrint();

        System.out.println("\n ============== 华丽的分隔线 =============== \n");

        AB ab = new AB();

        ab.print();
        ab.defaultPrint();

        // ab.staticPrint(); 静态方法只能通过静态方法所在类直接调用
        InterfaceA.staticPrint();
        InterfaceB.staticPrint();

    }

}
