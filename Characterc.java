public class Characterc{
     public static void main(String args[]){
          
          char ch = 'a';

          char uniChar = '\u039A';

          char[] charArray = {'a','b','c','d','e'};

          Character ch2 = new Character('a');

          System.out.println("测试\"转义\" 我是"+ch);

          //使用Character对a自己进行处理
          if(Character.isLetter(ch)){
          	System.out.println("a是一个字母");
          }
          if(!Character.isDigit(ch)){
          	System.out.println("a不是一个数字");
          }
          if(Character.isWhitespace(ch)){
          	System.out.println("a不是一个空格");
          }

          if(!Character.isUpperCase(ch)){
          	System.out.println("a不是大写字母");
          }
          if(Character.isLowerCase(ch)){
          	System.out.println("a是小写字母");
          }

          System.out.println("a的大写："+Character.toUpperCase(ch));
                    
          System.out.println("a小写："+Character.toLowerCase(ch));
          System.out.println("a字符串："+Character.toString(ch));
          
     }
}