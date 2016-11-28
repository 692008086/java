import java.util.Scanner;

public class ScannerType{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);//接收键盘输入

        int i = 0;
        float f = 0.0f;
        System.out.println("输入整数：");
        //判断时候有整数输入
        if(scan.hasNextInt()){
            //接收整数
            i = scan.nextInt();
            System.out.println("整数数据："+i);
        }else{
            System.out.println("输入的不是整数");
        }

        System.out.println("输入浮点数：");
        if(scan.hasNextFloat()){
            f = scan.nextFloat();
            System.out.println("浮点数数据："+f);
        }else{
            System.out.println("输入的不是浮点数");
        }

    }
}