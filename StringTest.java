public class StringTest{
     public static void main(String args[]){
          
          //创建字符串对象
          String greeting = "Hello world";

          char[] helloArr = {'h','e','l','l','o','.'};
          String helloStr = new String(helloArr);
          System.out.println(helloStr);

          String site = "www.leftoo.com";
          int len = site.length();
          System.out.println("site 变量长度："+len);

          String siteAll = site.concat("：左图网");
          System.out.println(siteAll);
     }
}