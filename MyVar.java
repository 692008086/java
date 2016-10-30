//package com.runoob.test;
import java.io.*;

public class MyVar{

    // void setVar(){
    //     int a,b,c;
    //     int d = 3,e,f = 5;
    //     byte z = 22;
    //     String s = "runoob";
    //     double pi = 3.14159268;
    //     char x = 'x';
    //     final double PPI = 3.141592653;//常量
    //     public static final double PPI = 3.141592653;//静态变量声明为常量
    // }

    // //局部变量
    // public void pupAge(){
    //     int age  = 0;
    //     age = age + 7;
    //     System.out.println("this dog age is:"+age);
    // }

    // public static void main(String args[]){
    //     MyVar testVar = new MyVar();
    //     testVar.pupAge();
    // }


    public String name;//这个成员变量子类可见
    private double salary;//私有变量，仅当前类可见
    private boolean MyFlag;
    static final double WEEKS = 9.5;
    protected static final int BOXWINDTH = 42;

    //静态私有常量
    private static double gongzi;
    //公共常量
    public static final String DEPARTMENT = "开发人员";

    //在构造器中对name赋值
    public MyVar(String eName){
        name = eName;
    }

    //设置salary的值
    public void setSalary(double es){
        this.salary = es;
    }

    // 打印信息
    public void printVar(){
        System.out.println("name:"+this.name);
        System.out.println("name:"+salary);
    }

    // 入口函数
    public static void main(String args[]){
        MyVar vv = new MyVar("good man");
        vv.setSalary(4545);
        vv.printVar();

        gongzi = 10000;
        System.out.println(DEPARTMENT+"平均工资："+gongzi);
    }

}