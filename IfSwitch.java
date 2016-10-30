public class IfSwitch{
     public static void main(String args[]){
          
          byte x = 10;
          if(x < 20){
               System.out.println("小于20输出");
          }else if(x < 10){
               System.out.println("小于0输出");
          }else{
               System.out.println("上述条件都不成立");
          }

          char grade = 'c';

          switch(grade){

               case 'a':
                    System.out.println("a");
                    break;
               case 'b':
               case 'c':
                    System.out.println("b OR c");
                    break;
               case 'd':
                    System.out.println("d");
                    break;
               default :
                    System.out.println("上述条件都不对");
          }

          System.out.println("跳出switch循环了");

     }
}