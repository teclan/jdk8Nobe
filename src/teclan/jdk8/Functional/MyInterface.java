package teclan.jdk8.Functional;

/**
 * @FunctionalInterface 注释的接口只能有一个抽象方法，默认方法和静态方法不限
 * @author teclan
 *
 */
@FunctionalInterface
public interface MyInterface {

    public void display(Student student);

    public default String defaultMethod() {

        System.out.println(" I'm defaultMethod !");

        return "";
    }

    public static String staticMethod() {

        System.out.println(" I'm staticMethod !");

        return "";
    }

}
