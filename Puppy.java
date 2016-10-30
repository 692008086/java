public class Puppy{
	int puppyAge;
	//仅有一个参数的构造函数
	public Puppy(String name){
		System.out.println("实例化名字是："+name);
	}

	public void setAge(int age){
		puppyAge = age;
	}

	public int getAge(){
		System.out.println("age is:"+puppyAge);
		return puppyAge;
	}


	public static void main(String []args){
		//实例化一个Puppu对象
		Puppy newPuppy = new Puppy("好人");
		//设置年龄
		newPuppy.setAge(12);
		/*获得age*/
		newPuppy.getAge();
		//在类外面调用类变量
		System.out.println("独立输出的age："+newPuppy.puppyAge);
	}
}