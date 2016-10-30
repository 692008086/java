import java.util.*;
/**
 * Java休眠
 */
public class Sleep{
     public static void main(String[] args){

          try{

               System.out.println(new Date() + "\n");

               Thread.sleep(1000*3);//休眠3秒

               System.out.println(new Date() + "\n");

          }catch(Exception e){
               System.out.println("got an exception!");
          }

          System.out.println();

          Sleep.diff();
     }

     #测量时间
     public static void diff(){
          try{
               long start = System.currentTimeMillis();

               System.out.println(new Date ()+"\n");
               Thread.sleep(5*6*10);
               System.out.println(new Date ()+"\n");

               long end = System.currentTimeMillis();
               long diff = end - start;

               System.out.println("differece is : " + diff);
          }catch(Exception e){
               System.out.println("Got an exception!");
          }
     }
}