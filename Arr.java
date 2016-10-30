public class Arr{
     public static void main(String[] args){
          
          //创建一个double类型的数组
          double[] myList = {3.33,5.69,22.31};

          //定义接下来创建数组的大小
          int size = 10;
          //定义数组
          double[] myList2 = new double[size];
          myList2[0] = 0.1;
          myList2[1] = 1.1;
          myList2[2] = 2.1;
          myList2[3] = 3.1;
          myList2[4] = 4.1;
          myList2[5] = 5.1;
          myList2[6] = 6.1;
          myList2[7] = 7.1;
          myList2[8] = 8.1;
          myList2[9] = 9.1;

          double total = 0;
          for(int i = 0; i < size ; i++){
          	  total += myList2[i];
          }

          System.out.println("总和为："+total);


          double[] myList3 = {1.9, 2.9, 3.4, 3.5};
          //打印所有数组元素
          for(int i = 0; i < myList3.length; i++){
          	  System.out.println(myList3[i]);
          }
          //计算元素值的总和
          double total2 = 0;
          for(byte i = 0; i < myList3.length; i++){
          	  total2 += myList3[i];
          }
          System.out.println("total is :"+total2);
          //查最大元素
          double max = myList3[0];
          for(byte i = 1; i < myList3.length; i++){
          	  if(myList3[i] > max) max = myList3[i];
          }
          System.out.println("max is:"+max);

          //for循环
          double[] myList4 = {1.9,2.9,3.4,3.5};
          //打印所有数组元素
          for(double ii : myList4){
          	 System.out.println(ii);
          }

          System.out.println("数组作为参数");
          Arr.printArr(new int[]{1,2,3,4,5});

          System.out.println("返回数组");
          int[] param = {7,8,912};
          int[] res = Arr.reverse(param);
          for(int i = 0; i < res.length; i++){
              System.out.println(res[i]);
          }

          //多维数组
          String s[][] = new String[2][];
          s[0] = new String[2];
          s[1] = new String[3];
          s[0][0] = new String("good");
          s[0][1] = new String("Luck");
          s[1][0] = new String("to");
          s[1][1] = new String("you");
          s[1][2] = new String("!");

          System.out.println(s[1][1]);
     }

     //数组作为函数的参数
     public static void printArr(int[] arr){
     	for(int i = 0; i < arr.length; i++){
     		System.out.println(arr[i]);
     	}
     }

     //数组作为返回值
     public static int[] reverse(int[] list){
     	int[] result = new int[list.length];

     	for(int i = 0, j = result.length - 1; i < list.length; i++,j--){
     		result[j] = list[i];
     	}

     	return result;
     }
}