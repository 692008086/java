import java.util.*;
import java.text.*;
/**
 * 解析字符串为时间
 */
public class DateDemo{
     public static void main(String[] args){

          SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

          String input = args.length == 0 ? "1818-11-11" : args[0];

          System.out.print(input + " parses as ");

          Date t;

          try{
               t = ft.parse(input);
               System.out.println(t);
          }catch (ParseException e){
               System.out.println("unparseable using "+ft);
          }
     }
}