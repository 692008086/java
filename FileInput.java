import java.io.*;
//演示 System.out.write().
public class FileInput{
	public static void main(String[] args){
        //InputStream f = new FileInputStream("String.txt");
        //等价于
        File f = new File("String.txt");
        InputStream f = new FileInputStream(f);//???报错
	}

	
}