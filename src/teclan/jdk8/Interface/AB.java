package teclan.jdk8.Interface;

public class AB implements InterfaceA, InterfaceB {

    // 虽然 InterfaceA，InterfaceB 都有 print(),但是 print() 是抽象方法，所以只需要实现一次即可
    @Override
    public void print() {
        System.out.println(" I'm class AB !");

    }

    // 由于 defaultPrint() 在 InterfaceA，InterfaceB
    // 都是默认方法，即在存在了相同的方法，实现类必须指定使用的是哪一个接口的该方法，
    // 否则编译器无法确定使用哪个接口的该方法
    @Override
    public void defaultPrint() {
        InterfaceA.super.defaultPrint(); // 指定了调用 InterfaceA 的 defaultPrint()

        // InterfaceB.super.defaultPrint(); // 指定了调用 InterfaceB 的 defaultPrint()
    }

}
