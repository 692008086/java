// 使用bufferedReader 在控制台读取字符
import java.io.*;

public class BRReadLines{
	public static void main(String[] args) throws IOException
	{

		// 使用 System.in 创建 BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		System.out.println("Enter lines of text.");
		System.out.println("输入end退出");
		// 读取字符
		do{
			str = br.readLine();
			System.out.println(str);
		}while(!str.equals("end"));//为end时退出
	}

	
}