public class AbstractDemo{

    public static void main(String[] args)
    {
        /*
        直接实例化一个抽象类是不允许的
         */
        AbstractClass a = new AbstractClass("George W.", "Houston, TX", 43);
        System.out.println("正在尝试实例化抽象类");
        a.mailCheck();
    }
}