import java.io.*;
public class ExceptionTest{
    public static void main(String[] args){
        try{

            int[] a = new int[2];
            System.out.println("array 3:"+a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown  :" + e);
        }
        System.out.println("Out of the block");
    }
}