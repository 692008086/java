public class TestDog{

    public static void main(String[] args){
        Animal a = new Animal();
        Dog b = new Dog();

        a.move();

        b.move();
        b.bark();
    }

}

class Animal{
    public void move(){
        System.out.println("动物可以移动");
    }
}

class Dog extends Animal{
    public void move(){
        super.move(); // 应用super类的方法
        System.out.println("狗也可以跑和走");
    }
    public void bark(){
        System.out.println("狗可以蜷叫");
    }
}