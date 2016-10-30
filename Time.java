import java.util.*;
import java.text.*;
public class Time{
     public static void main(String[] args){
          //初始化 Date 对象
          Date date = new Date();

          //使用 toString() 函数显示日期时间
          System.out.println(date.toString());


          Date dNow = new Date();
          SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

          System.out.println("current date :"+ft.format(dNow));
          

          //printf格式化日期
          String str = String.format("current Date/Time : %tc",date);

          System.out.printf(str);
          System.out.println("");

          System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
          System.out.println("");

          // 显示格式化时间
          System.out.printf("%s %tB %<te, %<tY", "Due date:", date);
          System.out.println("");

     }
}