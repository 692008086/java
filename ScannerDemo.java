import java.util.Scanner;

public class ScannerDemo{

    public static void main(String[] args){
        //从键盘接收数据
        Scanner scan = new Scanner(System.in);

        //next 方式接收字符串,遇到空白中断
        System.out.println("next方式接收：");
        //判断是否有输入
        if(scan.hasNext()){
            String str1 = scan.next();
            System.out.println("输入的数据为："+str1);
        }

        
        //nextLine 方式接收字符串，接收从开始输入到回车之前的输入
        System.out.println("nextLine方式接收：");
        //判断是否有输入
        if(scan.hasNextLine()){
            String str2 = scan.nextLine();
            System.out.println("输入的数据为："+str2);
        }
    }
}