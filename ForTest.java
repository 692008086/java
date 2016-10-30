public class ForTest{
     public static void main(String args[]){
          for(byte x = 10; x < 20; x++){
          		System.out.println("value of x :"+x);
          }

          byte [] numbers = {10,20,30,40,50};
          for(byte x : numbers){
          		if(x == 40){
          			break;
          		}
          		System.out.print(x+",");
          }
          System.out.println();

          String [] names = {"James","Larry","Tom","Lacy"};
          for(String name : names){
          		if(name == "Tom") continue;
          		System.out.print(name+",");
          }
          System.out.println();
     }
}