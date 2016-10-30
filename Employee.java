import java.io.*;

public class Employee{
	String name;
	int age;
	String designation;
	double salary;
	//构造函数
	public Employee(String name){
		this.name = name;//为什么这里要使用this
	}

	//设置age的值
	public void empAge(int empAge){
		age = empAge;
	}

	/*设置designation的值*/
	public void empDesignation(String empDesig){
		designation = empDesig;

	}

	/* 设置salary的值 */
	public void empSalary(double empSalary){
		salary = empSalary;
	}

	//打印信息
	public void printEmployee(){
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("desc:"+designation);
		System.out.println("salary:"+salary);
	}


}

