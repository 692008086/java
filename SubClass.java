abstract class Caravan{
    private double price;
    private String model;
    private String year;
    public abstract int getFast();//抽象方法,不能被声明成final和static
    public abstract void changeColor();
}

public class SubClass extends Caravan{

	private static byte first2 = 0;
	//序列化的对象包含被transient修饰的实例变量时，java虚拟机(JVM)跳过该特定的变量。 
	public transient int limit = 55;//序列化对象时跳过此变量
	//Volatile 任何时刻，两个不同的线程总是看到某个成员变量的同一个值
	private volatile boolean active;

	public void changeColor(){

	}

    public int getFast(){
        return first2;
    }

    //Synchronized关键字声明的方法同一时间只能被一个线程访问
    public synchronized void showDetails(){
    	first2++;
    }

    //线程1执行run方法，线程2执行stop方法后，线程1的循环会终止
    public void run(){
    	active = true;
    	while(active){

    	}
    }

    public void stop(){
    	active = false;
    }

    public static void main(String args[]){
    	SubClass sc = new SubClass();
    	sc.showDetails();
    	System.out.println("firsts:"+sc.getFast());
    }

}