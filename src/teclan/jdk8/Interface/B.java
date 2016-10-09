package teclan.jdk8.Interface;

/**
 * 实现抽象方法，并且重写接口的默认方法
 * 
 * @author teclan
 *
 */
public class B implements InterfaceB {

    @Override
    public void print() {
        System.out.println(" I'm class B !");

    }

    // 去掉了关键字 default
    @Override
    public void defaultPrint() {
        System.out.println(
                " Class B override the default method in InterfaceB ! ");
    }

}
