// 使用bufferedReader 在控制台读取字符
import java.io.*;

public class BRRead{
	public static void main(String[] args) throws IOException
	{

		System.out.println("请输入任意内容，输入q退出");

		char c;
		// 使用 System.in 创建 BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 读取字符
		do{
			c = (char) br.read();
			System.out.println(c);
		}while(c != 'q');//为q字母时退出
	}

	
}