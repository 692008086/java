import java.io.*;

public class EmployeeTest{

	void setVar(){
		int x = 7;
		int y = 10;
		byte a = 127;//byte数据类型-128到127之间，是int类型的1/4空间
		short b = 300;//short数据类型-32768到32767之间，是int数据类型的1/2
		int c = 2000000;//int数据类型-2147483648到2147483647之间
		long d = 1000000000;//正负最大9开头的19位数字
		float f = 125.3f;//存储浮点数时可以节省内存空间，不能用来表示精确的值
		double db = 1234.4;//双精度浮点型，不能用来表示精确的值
		final dobule PI = 3.141592657;//定义常量PI

		byte aa = 68;
		char ab = 'A';// char表示2进制
		int decimal = 100;//10进制
		int octal = 0144;//8进制
		int hexa = 0x64;//16进制



	}	

	public static void main(String args[]){
		//实例化两个对象
		Employee eOne = new Employee("a");
		Employee eTwo = new Employee("b");

		//调用两个对象的成员方法
		eOne.empAge(18);
		eOne.empDesignation("18a");
		eOne.empSalary(1000);
		eOne.printEmployee();

		eTwo.empAge(18);
		eTwo.empDesignation("18a");
		eTwo.empSalary(1000);
		eTwo.printEmployee();

	}
}