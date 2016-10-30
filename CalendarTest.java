import java.util.*;
/**
 * Calendar类
 */
public class CalendarTest{
     public static void main(String[] args){

          Calendar c = Calendar.getInstance();//默认是当前日期
          c.set(2009,6,12);//2009年6月12日的Calendar对象
          int year = c.get(Calendar.YEAR);
     }
}