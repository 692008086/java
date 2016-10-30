/**
 * java方法
 */
public class Functions{

    public static void main(String[] args){
      reload(3);
      reload("字符");
      moreArgs("moreArgs",1,2,3,4);


      System.out.println();
      System.out.println();
      System.out.println();


      Cake c1 = new Cake(1);  
      Cake c2 = new Cake(2);  
      Cake c3 = new Cake(3);  
        
      //c2 = c3 = null; 
      c1 = null; 
      System.gc(); //调用Java垃圾收集器
    }

    private static void reload(int i){
      System.out.println("数字i："+i);
    }

    //重载方法reload，使用不同的参数类型
    private static void reload(String i){
      System.out.println("字符串i："+i);
    }

    //多参数方法
    private static void moreArgs(String name,double ... num){
      System.out.println("打印多参数名："+name);
      if(num.length > 0){
        for(int i = 0; i < num.length;i++){
          System.out.println(num[i]);
        }
      }
    }
   



}


class Cake extends Object {  
  private int id;
  //构造函数
  public Cake(int id) {  
    this.id = id;  
    System.out.println("Cake Object " + id + "is created");  
  }  
  //Java 允许定义这样的方法，它在对象被垃圾收集器析构(回收)之前调用，这个方法叫做 finalize( )，它用来清除回收对象。 
  protected void finalize() throws java.lang.Throwable {  
    super.finalize();  
    System.out.println("Cake Object " + id + "is disposed");  
  }  
}