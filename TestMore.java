public class TestMore{
    public static void main(String[] args){
        show(new Cat());//以 cat 对象调用show方法
        show(new Dog());//以 dog 对象调用show方法

        Animal a = new Cat();// 向上转型
        a.eat();             // 调用的是 Cat 的eat
        Cat c = (Cat)a;      // 向下转型
        c.work();            // 调用的是 Cat 的catchMouse
    }

    public static void show(Animal a){
        a.eat();
        // 判断类型
        if(a instanceof Cat){//猫做的事情
            Cat c = (Cat)a;
            c.work();
        }else if(a instanceof Dog){//狗 做的事情
            Dog c = (Dog)a;
            c.work();
        }
    }
}

abstract class Animal{
    abstract void eat();
}

class Cat extends Animal{
    public void eat(){
        System.out.println("吃鱼");
    }
    public void work(){
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("吃骨头");
    }
    public void work(){
        System.out.println("看家");
    }
}


