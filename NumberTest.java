public class NumberTest{
     public static void main(String args[]){
          
          Integer x = 5;
          x += 10;
          System.out.println(x);

          //获得随机数
          double rand = Math.random();
          //将角度转换为弧度
          double hudu = Math.toRadians(45.0);
          //将参数转换为角度
          double jiaodu = Math.toDegrees(35.0);
          //将矩形坐标 (x, y) 转换成极坐标 (r, theta)，返回所得角 theta
          double jiao = Math.atan2(45.0,30.0);
          //获得弧度正切值
          double zQie = Math.atan(jiaodu);
          //获得弧度反余弦
          double fy = Math.acos(jiaodu);
          //获得弧度反郑弦
          double fz = Math.asin(jiaodu);
          //获得弧度的正切值
          double zq = Math.tan(jiaodu);
          //获得弧度的余弦值
          double yx = Math.cos(jiaodu);
          //获得弧度的正弦值
          double zx = Math.sin(jiaodu);
          //返回算数平方根
          double pz = Math.sqrt(11.635);
          //返回第一个参数的第二个参数次方
          double pow = Math.pow(2,6);
          //返回参数的自然数底数的对数值
          double duishu = Math.log(3.33);
          //返回自然数底数e的参数次方
          double exp = Math.exp(11.635);
          //返回两个参数中的最大值
          int maxv = Math.max(22,88);
          //返回两个参数中的最小值
          int minv = Math.min(22,88);
          //返回一个最接近的int、long型值,四舍五入
          float likev = Math.round(100.678);
          //返回最接近参数的整数值
          double zheng = Math.rint(69.12);
          //方法可对一个数进行下舍入，返回给定参数最大的整数，该整数小于或等给定的参数
          double jian = Math.floor(100.32);//返回100.0
          double jia = Math.ceil(100.32);//101相反，用法同php
          //返回参数的绝对值,所有的负数都转为正数
          double jue = Math.abs(3.33);
          //字符串转十进制，若存在第二个参数则作为基数
          int pInt = Integer.parseInt("444",16);//得到1092
          //获得数字的字符串对象
          String myNumber = Integer.toString(22);
          //将获得参的指定数据类型
          Integer i =Integer.valueOf(9);
          Double c = Double.valueOf(5);
          Float a = Float.valueOf("80"); 

     }
}