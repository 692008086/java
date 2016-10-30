//使用枚举定义成员变量
class FreshJuice {
   enum FreshJuiceSize{ SMALL, MEDUIM, LARGE }
   FreshJuiceSize size;
}
public class Test {
   int status;
   public static void main(String args[]){
      FreshJuice juice = new FreshJuice();
      juice.size = FreshJuice. FreshJuiceSize.MEDUIM ;
      System.out.println(juice.size);
      Test myTest = new Test("好人");
      myTest.putText("测试");
      System.out.println("类最后的status是："+myTest.status∏);
   }

   public Test(String name){
      System.out.println("传入的是："+name);
   }

   //输出文本的方法
   public void putText(String inStr){
      status = 3;
      System.out.println("文本方法"+status+"的输入值就是："+inStr);
   }
}


//狗狗的类
class Dog{
  String breed;
  int age;
  String color;
  void barking(){
  }

  //类的构造方法
  public Dog(){

  }

  //类的构造方法2
  public Dog(String name){
    System.out.println("输入的name是：" + name);
  }

  void hungry(){
  }

  void sleeping(){
  }

  public static void main(String []args){
    //下面将创建一个Dog对象
    Dog rockyDog = new Dog("好人");
  }
}